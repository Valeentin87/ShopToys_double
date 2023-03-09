package shopToys.model;

import java.io.*;
import java.util.ArrayList;

public class Manager {
    public String firstName;
    public String lastName;

    public Manager(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public ArrayList<Toy> GetToSklad() throws IOException {
        ArrayList<Toy> toysFromInvoice = new ArrayList<>();
        BufferedReader csvReader = new BufferedReader(new FileReader("invoice.csv"));
        String row;
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(";");
            toysFromInvoice.add(new Toy(Long.getLong(data[1]),data[2],data[3],Double.parseDouble(data[4])));
        }
        csvReader.close();
        return toysFromInvoice;
    }
}
