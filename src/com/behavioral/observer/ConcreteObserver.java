package com.behavioral.observer;

//Конкретная реализация наблюдателя. Он получает обновления от субъекта через метод update()

public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " получил сообщение: " + message);
    }
}