package mediator.client;

import mediator.mediator.Server;
import mediator.user.Client;
import mediator.user.Group;
import mediator.user.User;

public class Main {

    public static void main(String[] args) {
        Server server = new Server();
        User mahdi = new User(server,"mehdi");
        User parham = new User(server,"parham");
        User ali = new User(server,"ali");
        Group cmsDeveloper = new Group(server,"cmsDeveloper");
        cmsDeveloper.register(mahdi);
        cmsDeveloper.register(parham);
        cmsDeveloper.register(ali);

        mahdi.SendMessage(cmsDeveloper.getUsername(),"hello");






    }
}
