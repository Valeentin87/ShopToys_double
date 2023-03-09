package shopToys.model;

public class ToyPosition {
    Toy toy; //игрушка, хранящаяся на складе
    int count; //количество игрушек на складе

    public ToyPosition(Toy toy, int count) {
        this.toy = toy;
        this.count = count;
    }

    @Override
    public String toString() {
        return String.format("На складе игрушек %s имеется в количестве %d штук ",toy.getName(),count);
    }
}
