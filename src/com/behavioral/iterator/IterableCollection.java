package com.behavioral.iterator;

//Определяет метод createIterator(), который должен возвращать объект итератора для конкретной коллекции.
public interface IterableCollection<T> {
    Iterator<T> createIterator();
}

