package com.behavioral.iterator;

//Реализует интерфейс Iterator и предоставляет реализацию методов для итерации по элементам коллекции.
import java.util.List;

public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> items;
    private int position = 0;

    public ConcreteIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            return items.get(position++);
        }
        return null;
    }
}

