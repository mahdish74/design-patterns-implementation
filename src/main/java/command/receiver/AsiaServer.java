package command.receiver;

public class AsiaServer implements Receiver {
    @Override
    public void startup() {
        System.out.println("AsiaServer started");
    }

    @Override
    public void showdown() {
        System.out.println("AsiaServer showdown");

    }

    @Override
    public void connect() {
        System.out.println("AsiaServer connected");
    }

    @Override
    public void disconnect() {
        System.out.println("AsiaServer connected");
    }
}
