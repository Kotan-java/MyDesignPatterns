package com.creational.abstractFactory;
//использует фабрику для создания продуктов и использует их
public class Client {
    private ProductA productA;
    private ProductB productB;

    public Client(AbstractFactory factory) {
        productA = factory.createProductA();
        productB = factory.createProductB();
    }

    public void run() {
        productA.use();
        productB.use();
    }
}
