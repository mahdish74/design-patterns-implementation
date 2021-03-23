package command.receiver;

public class UsServer implements Receiver {
    @Override
    public void startup() {
        System.out.println("UsServer started");
    }

    @Override
    public void showdown() {
        System.out.println("UsServer showdown");

    }

    @Override
    public void connect() {
        System.out.println("UsServer connected");
    }

    @Override
    public void disconnect() {
        System.out.println("UsServer connected");
    }}
