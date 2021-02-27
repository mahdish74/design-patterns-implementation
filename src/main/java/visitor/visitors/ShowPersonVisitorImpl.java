package visitor.visitors;

import visitor.elements.Element;
import visitor.elements.PersonElement;

public class ShowPersonVisitorImpl implements Visitor {
    @Override
    public void visit(Element element) {
        PersonElement personElement = (PersonElement) element;
        show(personElement);
    }

    private void show(PersonElement personElement) {
        System.out.println("name is :" + personElement.getName() + " " + personElement.getFamily());
    }
}
