package shopToys;

import shopToys.model.Manager;
import shopToys.model.Toy;
import shopToys.model.ToyPosition;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        Manager manager = new Manager("Валентин","Иванов");
        ArrayList<ToyPosition> toys = new ArrayList<>(manager.GetToSklad());
        for (ToyPosition item: toys) {
            System.out.println(item);

        }
    }
}