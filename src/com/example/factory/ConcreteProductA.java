package com.example.factory;
//реализует интерфейс Product и предоставляет конкретную реализацию метода use()
public class ConcreteProductA implements Product {
    @Override
    public void use() {
        System.out.println("Using Product A");
    }
}


