package com.example.singleton;
//Вызывает метод getInstance() для получения экземпляра Singleton и проверяет,
//что оба полученных экземпляра ссылаются на один и тот же объект.

//создает два объекта Singleton с использованием метода getInstance(), выводит сообщение и проверяет,
//что оба объекта ссылаются на один и тот же экземпляр, что подтверждает реализацию паттерна "Одиночка".
public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.showMessage();


        //в выводе будет одинаковый хешкод
        System.out.println(singleton1);
        System.out.println(singleton2);

        //Проверка, что оба объекта ссылаются на один и тот же экземпляр
        System.out.println(singleton1 == singleton2);
    }
}

