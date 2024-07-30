package com.example.factory;
//Программа создает два объекта конкретных создателей (ConcreteCreatorA и ConcreteCreatorB).
// Затем она вызывает метод someOperation(), который создает продукт с помощью фабричного метода и вызывает
// метод use() на созданном продукте.
// Были созданы и использованы продукты различных типов с помощью фабричного метода
public class Main {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Creator creatorB = new ConcreteCreatorB();

        creatorA.someOperation();
        creatorB.someOperation();
    }
}

