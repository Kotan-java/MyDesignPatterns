package com.behavioral.mediator;

class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Colleague A received: " + message);
    }

    public void send(String message) {
        mediator.sendMessage(message, this);
    }
}