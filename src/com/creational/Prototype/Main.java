package com.creational.Prototype;
//Создает объект ConcretePrototype, клонирует его и выводит на консоль оригинал и клон.
//Изменение клона не влияет на оригинал, что подтверждает независимость клонированного объекта.
public class Main {
    public static void main(String[] args) {
        ConcretePrototype prototype1 = new ConcretePrototype("Prototype 1");
        ConcretePrototype clone1 = (ConcretePrototype) prototype1.clone();

        System.out.println(prototype1);
        System.out.println(clone1);

        // Изменение клона не влияет на оригинал
        clone1 = new ConcretePrototype("Prototype 2");
        System.out.println(prototype1);
        System.out.println(clone1);
    }
}

