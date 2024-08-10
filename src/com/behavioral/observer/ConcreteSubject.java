package com.behavioral.observer;

//Конкретная реализация субъекта. В нем хранится список наблюдателей, и когда состояние субъекта меняется
//(например, устанавливается новое сообщение), всех наблюдателей уведомляют через метод notifyObservers().

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private String message;
    private List<Observer> observers = new ArrayList<>();

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

