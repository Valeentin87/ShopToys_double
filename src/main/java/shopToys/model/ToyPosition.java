package shopToys.model;

/**
 * Класс Позиция товара (показывает сколько товара под каждым наименованием)
 */
public class ToyPosition {
    Toy toy;
    int count;

    /**
     * Конструктор
     * @param toy игрушка
     * @param count количество игрушек конкретного наименования
     */
    public ToyPosition(Toy toy, int count) {
        this.toy = toy;
        this.count = count;
    }

    @Override
    public String toString() {
        return String.format("На складе игрушек %s имеется в количестве %d штук ",toy.getName(),count);
    }
}
