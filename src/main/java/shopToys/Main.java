package shopToys;

import shopToys.model.*;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        Manager valentin = new Manager("Валентин","Иванов",new MapperToy("invoice.csv","showcase.csv"),"10 марта");
        valentin.PutInShowcase();
        /*
        ArrayList<ToyPosition> delivery = new ArrayList<>(new MapperToy().GetAssortment("invoice.csv"));
        ArrayList<ToyPosition> sklad = new ArrayList<>(new MapperToy().GetAssortment("showcase.csv"));
        for (ToyPosition i: delivery) {
            System.out.println(i);
        }
        System.out.println("\n-----------");
        for (ToyPosition j: sklad) {
            System.out.println(j);
        }
        System.out.println("\n--------");

        ArrayList<ToyPosition> result = new ArrayList<>();

        for (int n=0;n<delivery.size();n++){
               for (int m=0; m<sklad.size();m++){
                    if (delivery.get(n).equals(sklad.get(m))) {
                        delivery.get(n).count+=sklad.get(m).count;
                        sklad.remove(sklad.get(m));
                    }

            }
            result.add(delivery.get(n));
        }

        for (ToyPosition i:sklad) {
            result.add(i);
        }


        for (ToyPosition j:result) {
            System.out.println(j);

        }
*/
        }


}
