package visitor.client;

import visitor.elements.CarElement;
import visitor.elements.Element;
import visitor.elements.PersonElement;
import visitor.visitors.SaveVisitorImpl;
import visitor.visitors.ShowVisitorImpl;
import visitor.visitors.Visitor;

public class Main {

    public static void main(String[] args) {

        Visitor save = new SaveVisitorImpl();
        Visitor show = new ShowVisitorImpl();

        Element person = new PersonElement("Mahdi", "Shojaei");
        person.accept(new SaveVisitorImpl());
        person.accept(new ShowVisitorImpl());

        Element car =new CarElement("Tesla","Roadster");
        car.accept(save);
        car.accept(show);
    }

}
