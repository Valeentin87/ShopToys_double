package shopToys.model;

import java.io.*;
import java.util.ArrayList;

public class MapperToy {
    String invoice;
    String showcase;

    public MapperToy(String invoice, String showcase) {
        this.invoice = invoice;
        this.showcase = showcase;
    }

    public MapperToy() {
        this.invoice = "invoice.csv";
        this.showcase = "showcase.csv";
    }

    public ArrayList<ToyPosition> GetToSklad() throws IOException {
        ArrayList<ToyPosition> toysFromInvoice = new ArrayList<>();
        BufferedReader csvReader = new BufferedReader(new FileReader(invoice));
        String row;
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(";");
            toysFromInvoice.add(new ToyPosition(new Toy(Long.parseLong(data[1]), data[2], data[3],
                    Double.parseDouble(data[4])), Integer.parseInt(data[5])));
        }
        csvReader.close();
        return toysFromInvoice;

    }

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


}
