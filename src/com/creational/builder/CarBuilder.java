package com.creational.builder;
// Интерфейс Builder. Это интерфейс, который определяет методы для установки различных частей автомобиля
//(двигатель, трансмиссия, колеса) и метод для сборки конечного объекта (build).
public interface CarBuilder {
    CarBuilder setEngine(String engine);
    CarBuilder setTransmission(String transmission);
    CarBuilder setWheels(int wheels);
    Car build();
}
