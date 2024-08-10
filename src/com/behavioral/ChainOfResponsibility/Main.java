package com.behavioral.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        // Создание объектов обработчиков
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        // Формирование цепочки обязанностей
        ((ConcreteHandlerA) handlerA).setNextHandler(handlerB);
        ((ConcreteHandlerB) handlerB).setNextHandler(handlerC);

        // Передача запросов в цепочку
        String[] requests = {"A", "B", "C", "D"};

        for (String request : requests) {
            handlerA.handle(request);
        }
    }
}
//Каждый обработчик проверяет, соответствует ли запрос определенному значению, и если да, обрабатывает его.
// В противном случае запрос передается следующему обработчику в цепочке.
//ConcreteHandlerA обрабатывает запросы, если они равны "A".
//ConcreteHandlerB обрабатывает запросы, если они равны "B".
//ConcreteHandlerC обрабатывает запросы, если они равны "C".
//Если запрос не может быть обработан ни одним из обработчиков, он не обрабатывается.