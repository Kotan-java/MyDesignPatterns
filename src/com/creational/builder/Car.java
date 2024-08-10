package com.creational.builder;
// Класс Car, объект которого создается с помощью Builder.
// Он имеет закрытые поля для хранения информации о двигателе, трансмиссии и количестве колес, а также
// переопределенный метод toString, чтобы выводить информацию об автомобиле.
public class Car {
    private String engine;
    private String transmission;
    private int wheels;

    public Car(String engine, String transmission, int wheels) {
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car [Engine=" + engine + ", Transmission=" + transmission + ", Wheels=" + wheels + "]";
    }
}