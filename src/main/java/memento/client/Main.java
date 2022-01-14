package memento.client;

import memento.Caretaker;
import memento.Person;

public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Person person = new Person("mahdi", "shojaei");
        caretaker.push(person.save());
        Person person1=new Person();
        person1.restore(caretaker.pop());
        System.out.println(person1.toString());

    }
}
