package visitor.visitors;

import visitor.elements.CarElement;
import visitor.elements.Element;
import visitor.elements.PersonElement;

public class ShowVisitorImpl implements Visitor {
    @Override
    public void visit(Element element) {
        if (element instanceof PersonElement) {
            PersonElement personElement = (PersonElement) element;
            show(personElement);
        } else {
            CarElement carElement = (CarElement) element;
            show(carElement);
        }
    }

    private void show(CarElement carElement) {
        System.out.println("car is :" + carElement.getBrand() + " " + carElement.getName());
    }

    private void show(PersonElement personElement) {
        System.out.println("name is :" + personElement.getName() + " " + personElement.getFamily());
    }
}
