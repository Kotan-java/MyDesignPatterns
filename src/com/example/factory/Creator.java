package com.example.factory;
//Этот класс содержит абстрактный метод factoryMethod(), который возвращает объект типа Product. Также в этом
// классе есть метод someOperation(), который использует продукт, созданный фабричным методом.
public abstract class Creator {
    public abstract Product factoryMethod();

    public void someOperation() {
        Product product = factoryMethod();
        product.use();
    }
}

