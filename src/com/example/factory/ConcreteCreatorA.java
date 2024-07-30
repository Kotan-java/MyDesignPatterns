package com.example.factory;
//наследует Creator и реализует метод factoryMethod(), который создает конкретный продукт ConcreteProductA
public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
