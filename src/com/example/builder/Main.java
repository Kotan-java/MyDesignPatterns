package com.example.builder;

//Программа создает два объекта Computer с разной конфигурацией: игровой ПК (gamingPC) и офисный ПК (officePC).

//создаем два объекта Computer с использованием паттерна "Строитель".
//настраиваем каждый объект с различными параметрами и выводим их на консоль.

//Используя паттерн "Строитель", мы легко настраиваем различные параметры объектов
//без необходимости создавать множество перегруженных конструкторов.
public class Main {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setGPU("NVIDIA RTX 3080")
                .setRAM(32)
                .setStorage(1000)
                .setLiquidCooled(true)
                .build();

        Computer officePC = new Computer.Builder()
                .setCPU("Intel i5")
                .setGPU("Integrated")
                .setRAM(16)
                .setStorage(512)
                .setLiquidCooled(false)
                .build();

        System.out.println(gamingPC);
        System.out.println(officePC);
    }
}

