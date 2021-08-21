package singleton.subclass;

import java.sql.SQLOutput;

public class SubClassSingleton {
    private static SubClassSingleton instance;
    protected SubClassSingleton (){

    }

    static {
       String os = System.getProperty("os.name");
        if (os.equals("Linux")){
            instance=new SingletonLinux();
        }else if (os.equals("win")){
            instance=new SingletonWindows();
        }
    }

    public static SubClassSingleton getInstance() {
        return instance;
    }

    public void sayHello(){
        System.out.println("hello");
    }
}
