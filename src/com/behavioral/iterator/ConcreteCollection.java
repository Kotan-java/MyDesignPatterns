package com.behavioral.iterator;

//Реализует интерфейс IterableCollection и содержит элементы коллекции. Метод createIterator() возвращает новый
//объект итератора, связанный с этой коллекцией.
import java.util.List;

public class ConcreteCollection<T> implements IterableCollection<T> {
    private List<T> items;

    public ConcreteCollection(List<T> items) {
        this.items = items;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }
}
