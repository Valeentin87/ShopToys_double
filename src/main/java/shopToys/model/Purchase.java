package shopToys.model;

import java.io.IOException;
import java.util.ArrayList;

public interface Purchase {
    ArrayList<ToyPosition> DemonstrateAllToy(String fileName) throws IOException;
}
