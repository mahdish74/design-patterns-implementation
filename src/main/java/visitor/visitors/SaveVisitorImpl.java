package visitor.visitors;

import visitor.elements.CarElement;
import visitor.elements.Element;
import visitor.elements.PersonElement;

import java.io.File;
import java.io.FileWriter;


public class SaveVisitorImpl implements Visitor {

    @Override
    public void visit(Element element) {
        if (element instanceof PersonElement) {
            PersonElement personElement = (PersonElement) element;
            saveFile(personElement);
        } else {
            CarElement carElement = (CarElement) element;
            saveFile(carElement);
        }
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

    private void saveFile(CarElement carElement) {
        try {
            File file = new File("file.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(carElement.getBrand() + " " + carElement.getName());
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
