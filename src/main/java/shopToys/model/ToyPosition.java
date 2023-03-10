package shopToys.model;

import java.util.Objects;

/**
 * Класс Позиция товара (показывает сколько товара под каждым наименованием)
 */
public class ToyPosition {
    public Toy toy;
    public int count;

    public long idInvoice;

    /**
     * Конструктор
     * @param idInvoice номер накладной, по которой поступил товар
     * @param toy игрушка
     * @param count количество игрушек конкретного наименования
     */
    public ToyPosition(long idInvoice, Toy toy, int count) {
        this.idInvoice = idInvoice;
        this.toy = toy;
        this.count = count;
    }

    @Override
    public String toString() {
        return String.format("На складе игрушек %s имеется в количестве %d штук ",toy.getName(),count);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToyPosition that = (ToyPosition) o;
        return Objects.equals(toy, that.toy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toy);
    }
}
