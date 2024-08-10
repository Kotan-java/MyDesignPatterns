package com.behavioral.Command;

// Клиент - создаёт команды и связывает их с инвокером
public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        // Включаем свет
        remote.setCommand(lightOn);
        remote.pressButton();

        // Выключаем свет
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}