package com.creational.builder;
// Конкретная реализация Builder. В ней реализованы методы для установки характеристик автомобиля и метод build,
// который создает и возвращает объект Car.
public class ConcreteCarBuilder implements CarBuilder {
    private String engine;
    private String transmission;
    private int wheels;

    @Override
    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public CarBuilder setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    @Override
    public Car build() {
        return new Car(engine, transmission, wheels);
    }
}
