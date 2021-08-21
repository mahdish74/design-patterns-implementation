package facade.client;

import facade.facade.ShapeMaker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main_(String[] args) {
       /* ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();*/

    }

    public static void main(String[] args) throws Exception {
        java.net.URL url=new URL("https://www.google.com/");
        BufferedReader input= new BufferedReader(new InputStreamReader(url.openStream()));
        String a;
        while ((a=input.readLine()) != null){
            System.out.println(a);
        }
        input.close();
    }
}
