package shopToys.model;

import java.util.Objects;

public class Toy {
    public String name; //название игрушки
    public long id; //уникальный номер товара (игрушки)
    double price; //цена товара
    public Toy(long id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // геттеры
    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    // сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Игрушка: %s Цена: %f",name,price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return id == toy.id;
    }

}
