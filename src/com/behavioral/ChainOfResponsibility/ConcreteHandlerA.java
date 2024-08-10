package com.behavioral.ChainOfResponsibility;

// Конкретный обработчик 1
class ConcreteHandlerA implements Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(String request) {
        if (request.equalsIgnoreCase("A")) {
            System.out.println("ConcreteHandlerA handled request: " + request);
        } else if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
