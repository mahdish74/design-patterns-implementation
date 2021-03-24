package behavioral.observer;


public interface Observer {
    Long getId();

    void update(Message message);
}
