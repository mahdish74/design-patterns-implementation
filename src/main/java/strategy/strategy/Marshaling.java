package strategy.strategy;

import strategy.model.Person;

@FunctionalInterface
public interface Marshaling {
    void marshal(Person person);
}
