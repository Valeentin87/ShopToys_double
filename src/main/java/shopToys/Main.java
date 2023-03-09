package shopToys;

import shopToys.model.Toy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Toy toy1 = new Toy(1234,"Кукла Даша",567.68);
        Toy toy2 = new Toy(1234,"Кукла Маша",2345.4566);
        System.out.println(toy1.equals(toy2));
        System.out.println(toy1);
    }
}