package com.example.singleton;
//Содержит приватный статический экземпляр instance и приватный конструктор, предотвращающий создание новых
//экземпляров. Метод getInstance() возвращает единственный экземпляр класса, создавая его при первом обращении.
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        //Приватный конструктор предотвращает создание экземпляров класса
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
