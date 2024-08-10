package com.behavioral.Command;

// Ресивер - устройство, которое мы контролируем (свет)
//Объект, который выполняет действия, умеет включать и выключать свет.
class Light {
    public void on() {
        System.out.println("Свет включен");
    }

    public void off() {
        System.out.println("Свет выключен");
    }
}