package com.behavioral.observer;

//Интерфейс, который позволяет добавлять, удалять и уведомлять наблюдателей.
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
