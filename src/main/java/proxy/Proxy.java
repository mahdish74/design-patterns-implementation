package proxy;

import singleton.subclass.SingletonLinux;
import singleton.subclass.SingletonWindows;

public class Proxy implements Real {
    RealImpl real=new RealImpl();

    @Override
    public void doSomeThing() {
        String os = System.getProperty("os.name");
        if (os.equals("Linux")){
            real.doSomeThing();
        }else if (os.equals("win")){
            throw new RuntimeException("your os not support");
        }
    }
}
