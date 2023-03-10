package shopToys;

import shopToys.model.Manager;
import shopToys.model.MapperToy;
import shopToys.model.Toy;
import shopToys.model.ToyPosition;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        Manager valentin = new Manager("Валентин","Иванов",new MapperToy());
        valentin.PutInShowcase();
    }
}