package shopToys.model;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * Класс Менеджер
 */
public class Manager {
    MapperToy mapperToy;
    public String firstName;
    public String lastName;

    public String date;

    /**
     * Конструктор
     * @param firstName Имя менеджера
     * @param lastName  Фаимлия менеджера
     */
    public Manager(String firstName, String lastName, MapperToy mapperToy,String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mapperToy = mapperToy;
        this.date = date;
    }

    public MapperToy getMapperToy() {
        return mapperToy;
    }

    public void setMapperToy(MapperToy mapperToy) {
        this.mapperToy = mapperToy;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Метод, позволяющий отправить товары, полученные по накладной на склад
     * @return возвращает список позиций (наименование - количество) товаров
     * @throws IOException в том случае, если отсутствует файл (накладная)
     */

    /*
    public ArrayList<ToyPosition> GetToSklad() throws IOException {
        ArrayList<ToyPosition> toysFromInvoice = new ArrayList<>();
        BufferedReader csvReader = new BufferedReader(new FileReader("invoice.csv"));
        String row;
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(";");
            toysFromInvoice.add(new ToyPosition(new Toy(Long.parseLong(data[1]),data[2],data[3],
                    Double.parseDouble(data[4])),Integer.parseInt(data[5])));
        }
        csvReader.close();
        return toysFromInvoice;
    }
*/
    public void PutInShowcase() throws IOException {
        mapperToy.UpdateAssortment(mapperToy.GetAssortment("invoice.csv"),mapperToy.GetAssortment("showcase.csv"),
                "showcaseResult.csv");
    }



}
