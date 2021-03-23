package proxy;

public class Proxy implements Real {
    RealImpl real=new RealImpl();

    @Override
    public void doSomeThing() {
        real.doSomeThing();;
    }
}
