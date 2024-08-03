package com.example.builder;
//Создается объект ConcreteCarBuilder, затем с помощью методов цепочки устанавливаются параметры автомобиля,
// и в конце вызывается метод build, который возвращает готовый объект Car.
public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new ConcreteCarBuilder();
        Car car = builder.setEngine("V8")
                .setTransmission("Automatic")
                .setWheels(4)
                .build();
        System.out.println(car);
    }
}
