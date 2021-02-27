package visitor.elements;

import visitor.visitors.Visitor;

public interface Element {

    public void accept(Visitor visitor);

}
