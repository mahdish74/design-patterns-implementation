package strategy.strategy;

import jdk.jfr.Label;
import strategy.context.Context;
import strategy.model.Person;

@FunctionalInterface
public interface Marshaling {
    void marshal(Person person);
}
