package visitor.elements;

import visitor.visitors.Visitor;

public class PersonElement implements Element {
    private String name;
    private String family;

    public PersonElement(String name, String family) {
        this.name = name;
        this.family = family;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
