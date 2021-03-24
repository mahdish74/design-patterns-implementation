package behavioral.observer;


public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void publish(Message message);
}
