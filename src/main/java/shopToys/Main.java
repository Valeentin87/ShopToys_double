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
        MapperToy mapperToy = new MapperToy();
        ArrayList<ToyPosition> toys = new ArrayList<>(mapperToy.GetToSklad());
        for (ToyPosition item: toys) {
            System.out.println(item);

        }
    }
}