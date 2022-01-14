package memento;

public class Person {
    private String name;
    private  String family;

    public Person(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public Person() {
    }

    public PersonMemento save() {
        return new PersonMemento(name);
    }

    public void restore(PersonMemento personMemento) {
        this.name = personMemento.getName();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                '}';
    }
}
