package shopToys.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class PrizeBasket {
    public ArrayList<ToyPosition> allToys;

    public ArrayList<Toy> prizeBasket;
    public int prizeNumber;
    public double criticPrice;

    public ArrayList<ToyPosition> getAllToys() {
        return allToys;
    }

    public ArrayList<Toy> getPrizeBasket() {
        return prizeBasket;
    }

    public int getPrizeNumber() {
        return prizeNumber;
    }

    public double getCriticPrice() {
        return criticPrice;
    }

    public void setAllToys(ArrayList<ToyPosition> allToys) {
        this.allToys = allToys;
    }

    public void setPrizeBasket(ArrayList<Toy> prizeBasket) {
        this.prizeBasket = prizeBasket;
    }

    public void setPrizeNumber(int prizeNumber) {
        this.prizeNumber = prizeNumber;
    }

    public void setCriticPrice(double criticPrice) {
        this.criticPrice = criticPrice;
    }

    public PrizeBasket(ArrayList<ToyPosition> allToys) {
        this.allToys = allToys;
    }

    public ArrayList<Toy> MakePrizeBasket() throws IOException {
        ArrayList<Toy> prizeToys = new ArrayList<>();
        ArrayList<Toy> allToy = new ArrayList<>();
        this.allToys = (new MapperToy()).GetAssortment("showcaseResult.csv");
        int allToysNumber = 0;
        int toyCount;
        for (int i = 0; i < this.allToys.size(); i++) {
            toyCount = (this.allToys.get(i)).count;
            allToysNumber += toyCount;
            for(int j=0;j<toyCount;j++){
                allToy.add(this.allToys.get(i).toy);
            }
        }

        this.prizeNumber = allToysNumber/20;
        Random rnd = new Random();
        int rndNumber;
        for (int j = 0; j<this.prizeNumber;j++){
            rndNumber = rnd.nextInt(0,allToy.size());
            prizeToys.add(allToy.get(rndNumber));
            allToy.remove(rndNumber);
        }
        return prizeToys;
    }

}
