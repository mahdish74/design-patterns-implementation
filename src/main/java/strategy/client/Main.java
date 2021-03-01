package strategy.client;

import strategy.context.Context;
import strategy.model.Person;
import strategy.strategy.Json;
import strategy.strategy.Xml;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new Person("mahdi", "shojaei"));
        context.marshal(new Xml());
        context.marshal(new Json());
        context.marshal(person -> System.out.println(person.getName() + " " + person.getFamily()));
    }
}
