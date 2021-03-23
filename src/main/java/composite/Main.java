package composite;

import java.util.EnumMap;

public class Main {

    public static void main(String[] args) {
        Employee ceo=new Employee("eb","ceo");
        Employee tl=new Employee("mm","tl");
        Employee po=new Employee("ab","po");
        ceo.add(tl);
        ceo.add(po);

        Employee programmer1=new Employee("ms","programmer");
        Employee programmer2=new Employee("ph","programmer");
        tl.add(programmer1);
        tl.add(programmer2);

        Employee tester1=new Employee("nt","tester");
        Employee tester2=new Employee("y","tester");
        po.add(tester1);
        ceo.add(tester2);

        System.out.println(ceo.toString());

    }

}
