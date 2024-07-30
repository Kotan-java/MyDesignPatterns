package com.example.abstractFactory;
//Паттерн Абстрактная фабрика (Abstract Factory) предоставляет интерфейс для создания семейств взаимосвязанных
// или взаимозависимых объектов без указания их конкретных классов. В отличие от фабричного метода,
// который создает один объект, абстрактная фабрика создает семейство объектов.

// создаются две фабрики (ConcreteFactory1 и ConcreteFactory2). Затем для каждой фабрики создается клиент,
// который использует фабрику для создания и использования продуктов.

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        Client client1 = new Client(factory1);
        client1.run();

        AbstractFactory factory2 = new ConcreteFactory2();
        Client client2 = new Client(factory2);
        client2.run();
    }
}
// были созданы и использованы продукты различных типов, созданные разными фабриками.
