package iterator.client;

import iterator.container.MList;
import iterator.iterator.Iterator;

public class Main {


    public static void main(String[] args) {
        MList mList=new MList();
        for(Iterator iter = mList.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
