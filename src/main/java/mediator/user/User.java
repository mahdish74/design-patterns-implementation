package mediator.user;

import mediator.mediator.Server;

public class User implements Client {
    private final String username;
    private final Server server;

    public User(Server server, String username) {
        this.username = username;
        this.server = server;
        server.register(this);
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void SendMessage(String to, String message) {
        server.broadcast(username, to, message);
    }

    @Override
    public void receiveMessage(String from, String message) {
        System.out.println("\n\n in " + username+ " system ");
        System.out.println(" (^_^)  from "  + from);
        System.out.println(message);
    }
}
