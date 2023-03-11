package shopToys.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Buyer implements Purchase {


    @Override
    public ArrayList<ToyPosition> DemonstrateAllToy(String fileName) throws IOException {
        ArrayList<ToyPosition> allToys = new MapperToy().GetAssortment(fileName);
        return allToys;
    }
}
