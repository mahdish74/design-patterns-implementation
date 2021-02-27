package visitor.visitors;

import visitor.elements.Element;
import visitor.elements.PersonElement;

import java.io.File;
import java.io.FileWriter;
import java.net.URL;


public class SavePersonVisitorImpl implements Visitor {

    @Override
    public void visit(Element element) {
        PersonElement personElement = (PersonElement) element;
        saveFile(personElement);
    }

    private void saveFile(PersonElement personElement) {

        try {
            File file = new File("file.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(personElement.getName() + " " + personElement.getFamily());
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
