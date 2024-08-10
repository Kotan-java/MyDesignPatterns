package com.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague colleagueA = new ConcreteColleagueA(mediator);
        Colleague colleagueB = new ConcreteColleagueB(mediator);

        mediator.addColleague(colleagueA);
        mediator.addColleague(colleagueB);

        ((ConcreteColleagueA) colleagueA).send("Hello from A");
        ((ConcreteColleagueB) colleagueB).send("Hello from B");
    }
}