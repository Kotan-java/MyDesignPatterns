package com.behavioral.ChainOfResponsibility;

// Конкретный обработчик 3
class ConcreteHandlerC implements Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(String request) {
        if (request.equalsIgnoreCase("C")) {
            System.out.println("ConcreteHandlerC handled request: " + request);
        } else if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}