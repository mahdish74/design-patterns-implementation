package visitor.client;

import visitor.elements.Element;
import visitor.elements.PersonElement;
import visitor.visitors.SavePersonVisitorImpl;
import visitor.visitors.ShowPersonVisitorImpl;

public class Main {

    public static void main(String[] args) {
        Element element = new PersonElement("mahdi","shojaei");
        element.accept(new SavePersonVisitorImpl());
        element.accept(new ShowPersonVisitorImpl());

    }

}
