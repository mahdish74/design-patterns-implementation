package observer.subject;

import java.util.Observable;

public class MessageSender extends Observable {
    public void sendMessage(String msg) {
        setChanged();
        notifyObservers(msg);
    }

}
