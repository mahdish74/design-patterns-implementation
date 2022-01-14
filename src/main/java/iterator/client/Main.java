package iterator.client;

import iterator.container.MList;
import iterator.iterator.Iterator;

public class Main {


    public static void main(String[] args) {
        MList<String> myList = new MList<>();
        myList.add("mahdi");
        myList.add("hassan");
        myList.add("ali");
        myList.add("abass");
        Iterator container = myList.getIterator();
        while (container.hasNext()) {
            System.out.println(container.next());
        }
        System.out.println("---------------------------------");

        System.out.println( myList.get(0));
    }
}
