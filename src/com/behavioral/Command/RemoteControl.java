package com.behavioral.Command;

// Инвокер - устройство, которое вызывает команды.
//Объект, который вызывает команду. В примере это пульт дистанционного управления (RemoteControl).
// Он хранит команду и вызывает ее выполнение при нажатии кнопки.
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}