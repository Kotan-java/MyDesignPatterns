package com.behavioral.observer;
//Интерфейс, который содержит метод update(). Этот метод будет вызываться для обновления состояния наблюдателей.
public interface Observer {
    void update(String message);
}
