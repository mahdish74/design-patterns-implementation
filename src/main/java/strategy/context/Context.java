package strategy.context;

import strategy.model.Person;
import strategy.strategy.Marshaling;
public class Context {
    private Person person;

    public void marshal(Marshaling marshaling){
        marshaling.marshal(person);
    }



    public Context(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
