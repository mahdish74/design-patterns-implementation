package singleton;


public class Main {
    public static void main(String[] args) {
        System.out.println(SimpleSingletonClass.getInstance().getMessage());
        System.out.println(LazySingletonClass.getInstance().getMessage());
    }
}
