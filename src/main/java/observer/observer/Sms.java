package observer.observer;

import java.util.Observable;
import java.util.Observer;

public class Sms implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("sms was send " + arg);
    }
}
