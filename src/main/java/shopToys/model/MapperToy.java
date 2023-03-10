package shopToys.model;

import java.io.*;
import java.util.ArrayList;

/**
 * Класс MapperToy, позволяющий преобразовывать файлы с информацией о поступившем товаре
 * в объекты и обновлять текущий ассортимент магазина после поступления товара на склад
 */
public class MapperToy {
    String invoice;
    String showcase;

    /**
     * Конструктор с параметрами
     * @param invoice имя файла (товарной накладной)
     * @param showcase имя файла (весь ассортимент товаров, с учётом привезенных)
     */
    public MapperToy(String invoice, String showcase) {
        this.invoice = invoice;
        this.showcase = showcase;
    }

    /**
     * Конструктор по умолчанию
     */
    public MapperToy() {
        this.invoice = "invoice.csv";
        this.showcase = "showcase.csv";
    }

    /**
     * Метод GetAssortment
     * @return возвращает список позиций товаров, поступивших на склад с указанием количества каждого наименования
     * @throws IOException выдает исключение, если файл не существует
     */
    public ArrayList<ToyPosition> GetAssortment(String file) throws IOException {
        ArrayList<ToyPosition> toysFromInvoice = new ArrayList<>();
        BufferedReader csvReader = new BufferedReader(new FileReader(file));
        String row;
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(";");
            toysFromInvoice.add(new ToyPosition(Long.parseLong(data[0]),new Toy(Long.parseLong(data[1]), data[2], data[3],
                    Double.parseDouble(data[4])), Integer.parseInt(data[5])));
        }
        csvReader.close();
        return toysFromInvoice;

    }
/*
    public void UpdateAssortment(ArrayList<ToyPosition> ToyInShop) throws IOException {
        PrintWriter printWriter = new PrintWriter(new File(showcase));
        StringBuilder sb = new StringBuilder();
        for (ToyPosition newToy:ToyInShop) {
            sb.append(newToy.toy.getId()).append(";").append(newToy.toy.getName()).append(";").append(newToy.toy.getType()).
                    append(";").append(newToy.toy.getPrice()).append(";").append(newToy.count).append(";\n");
            printWriter.write(sb.toString());
        }
        printWriter.close();

    }
*/
    public ArrayList<ToyPosition> UpdateAssortment(ArrayList<ToyPosition> toyFromDelivery
            ,ArrayList<ToyPosition> toyInSklad, String fileName) throws IOException {
        PrintWriter printWriter = new PrintWriter(new File(fileName));
        StringBuilder sb = new StringBuilder();
        ArrayList<ToyPosition> result = new ArrayList<>();

        for (int n=0;n<toyFromDelivery.size();n++){
            for (int m=0; m<toyInSklad.size();m++){
                if (toyFromDelivery.get(n).equals(toyInSklad.get(m))) {
                    toyFromDelivery.get(n).count+=toyInSklad.get(m).count;
                    toyInSklad.remove(toyInSklad.get(m));
                }

            }
            result.add(toyFromDelivery.get(n));
        }

        for (ToyPosition i:toyInSklad) {
            result.add(i);
        }

        for (ToyPosition res:result) {
            sb.append(res.idInvoice).append(";").append(res.toy.getId()).append(";").append(res.toy.getName()).append(";").append(res.toy.getType()).
                    append(";").append(res.toy.getPrice()).append(";").append(res.count).append("\n");
            }
        printWriter.write(sb.toString());

        printWriter.flush();
        printWriter.close();
        File srs = new File("showcaseResult.csv");
        File dst = new File("showcase.csv");
        FileOperation.copyFile(srs,dst);
    return result;
    }

}
