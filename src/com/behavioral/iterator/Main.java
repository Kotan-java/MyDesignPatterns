package com.behavioral.iterator;

import java.util.Arrays;
import java.util.List;

//Демонстрирует работу паттерна "Итератор".
//Создает коллекцию элементов и использует итератор для последовательного перебора всех элементов в этой коллекции.
public class Main {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Item1", "Item2", "Item3");

        ConcreteCollection<String> collection = new ConcreteCollection<>(items);
        Iterator<String> iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
