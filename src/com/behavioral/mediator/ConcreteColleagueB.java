package com.behavioral.mediator;

class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Colleague B received: " + message);
    }

    public void send(String message) {
        mediator.sendMessage(message, this);
    }
}
