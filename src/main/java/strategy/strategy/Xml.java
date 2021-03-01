package strategy.strategy;

import strategy.context.Context;
import strategy.model.Person;

public class Xml implements Marshaling {
    @Override
    public void marshal(Person person) {
        String xml = "<person>\n" +
                "<name>" + person.getName() + "</name>\n" +
                "<family>" + person.getFamily() + "</family>\n" +
                "</person>";
        System.out.println(xml);
    }

}
