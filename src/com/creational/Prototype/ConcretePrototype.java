package com.creational.Prototype;
//Реализует интерфейс Prototype и предоставляет метод clone(), который создает и возвращает новый объект
//с таким же значением поля field.

public class ConcretePrototype implements Prototype {
    private String field;

    public ConcretePrototype(String field) {
        this.field = field;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(field);
    }

    @Override
    public String toString() {
        return "ConcretePrototype [field=" + field + "]";
    }
}
