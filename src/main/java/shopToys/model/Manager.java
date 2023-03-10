package shopToys.model;

import java.io.*;
import java.util.ArrayList;

/**
 * Класс Менеджер
 */
public class Manager {
    MapperToy mapperToy;
    public String firstName;
    public String lastName;

    /**
     * Конструктор
     * @param firstName Имя менеджера
     * @param lastName  Фаимлия менеджера
     */
    public Manager(String firstName, String lastName, MapperToy mapperToy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mapperToy = mapperToy;
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

}
