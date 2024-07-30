package com.example.abstractFactory;
//определяет методы для создания продуктов семейства (createProductA() и createProductB())
public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}
