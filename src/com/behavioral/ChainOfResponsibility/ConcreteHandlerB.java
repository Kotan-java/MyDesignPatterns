package com.behavioral.ChainOfResponsibility;

// Конкретный обработчик 2
class ConcreteHandlerB implements Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(String request) {
        if (request.equalsIgnoreCase("B")) {
            System.out.println("ConcreteHandlerB handled request: " + request);
        } else if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
