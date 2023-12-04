package shopToys;
// добавил строку с комментарием;
import shopToys.model.*;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        Manager valentin = new Manager("Валентин","Иванов",new MapperToy("invoice.csv","showcase.csv"),"10 марта");
        PrizeBasket prizeBasket = new PrizeBasket(valentin.PutInShowcase());
        for (Toy toy:prizeBasket.MakePrizeBasket()) {
            System.out.println(toy);
        }

        }


}
