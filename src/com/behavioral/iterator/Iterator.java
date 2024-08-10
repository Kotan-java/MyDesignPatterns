package com.behavioral.iterator;

//Определяет основные методы, необходимые для итерации по элементам коллекции (hasNext() для проверки,
// есть ли следующий элемент, и next() для получения следующего элемента).
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
