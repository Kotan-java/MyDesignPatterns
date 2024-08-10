package com.behavioral.Command;

// Конкретная команда для выключения света.
//Реализует интерфейс Command, содержит ссылку на объект, над которым будет выполняться операция (в данном случае
// это объект Light). Команды LightOnCommand и LightOffCommand инкапсулируют операции включения и выключения света
// соответственно.
class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}