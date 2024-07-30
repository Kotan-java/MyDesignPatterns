package com.example.abstractFactory;
//реализует интерфейс продуктов и предоставляет конкретную реализацию метода use()
public class ConcreteProductB2 implements ProductB {
    @Override
    public void use() {
        System.out.println("Using Product B2");
    }
}
