package com.behavioral.observer;

//В этом классе создается субъект и несколько наблюдателей. Наблюдатели добавляются в список субъекта,
//после чего субъект изменяет свое состояние и уведомляет наблюдателей.

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Наблюдатель 1");
        Observer observer2 = new ConcreteObserver("Наблюдатель 2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setMessage("Первое сообщение");
        subject.removeObserver(observer1);
        subject.setMessage("Второе сообщение");
    }
}