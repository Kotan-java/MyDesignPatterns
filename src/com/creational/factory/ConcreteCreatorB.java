package com.creational.factory;
//наследует Creator и реализует метод factoryMethod(), который создает конкретный продукт ConcreteProductB
public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
