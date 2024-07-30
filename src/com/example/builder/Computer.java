package com.example.builder;

//Класс продукта (Computer): Этот класс представляет конечный продукт, который мы хотим создать.
//Конструктор этого класса приватный, и он принимает объект Builder.
public class Computer {
    private String CPU;
    private String GPU;
    private int RAM;
    private int storage;
    private boolean isLiquidCooled;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.isLiquidCooled = builder.isLiquidCooled;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", GPU=" + GPU + ", RAM=" + RAM + "GB, storage=" + storage + "GB, isLiquidCooled=" + isLiquidCooled + "]";
    }
//Внутренний класс Builder: Этот класс предоставляет методы для установки различных параметров объекта Computer.
// Каждый метод установки возвращает объект Builder, что позволяет использовать цепочку вызовов.
// Метод build() создает и возвращает объект Computer.
    public static class Builder {
        private String CPU;
        private String GPU;
        private int RAM;
        private int storage;
        private boolean isLiquidCooled;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setLiquidCooled(boolean isLiquidCooled) {
            this.isLiquidCooled = isLiquidCooled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

