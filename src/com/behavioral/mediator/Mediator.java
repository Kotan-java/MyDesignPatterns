package com.behavioral.mediator;

interface Mediator {
    void sendMessage(String message, Colleague colleague);

    void addColleague(Colleague colleague);
}
