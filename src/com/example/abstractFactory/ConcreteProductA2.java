package com.example.abstractFactory;
//реализует интерфейс продуктов и предоставляет конкретную реализацию метода use()
public class ConcreteProductA2 implements ProductA {
    @Override
    public void use() {
        System.out.println("Using Product A2");
    }
}