package abstractfactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder=factory.newDocumentBuilder();
        byte[] test=("<person>" +
                "<name>mahdi</name>" +
                "<family>shojaie</family>" +
                "</person>").getBytes();
        Document parse=documentBuilder.parse(new ByteArrayInputStream(test));
        parse.getDocumentElement().normalize();

        System.out.println(parse.getDocumentElement().getTagName());
    }
}
