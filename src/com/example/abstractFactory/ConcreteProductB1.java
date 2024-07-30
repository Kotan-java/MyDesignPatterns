package com.example.abstractFactory;
//реализует интерфейс продуктов и предоставляет конкретную реализацию метода use()
public class ConcreteProductB1 implements ProductB {
    @Override
    public void use() {
        System.out.println("Using Product B1");
    }
}
