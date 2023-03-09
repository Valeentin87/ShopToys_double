package shopToys;

import shopToys.model.Manager;
import shopToys.model.Toy;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        Manager manager = new Manager("Валентин","Иванов");
        manager.GetToSklad();
    }
}