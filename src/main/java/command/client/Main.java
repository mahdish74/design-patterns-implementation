package command.client;

import command.CommandRunner;
import command.command.Command;
import command.command.ShutdownCommand;
import command.command.Startup;
import command.receiver.Receiver;
import command.receiver.UsServer;

public class Main {

    public static void main(String[] args) {
        Receiver us = new UsServer();
        Command shutdown = new ShutdownCommand(us);
        Command startup = new Startup(us);

        CommandRunner commandRunner = new CommandRunner();

        commandRunner.run(startup);
        System.out.println("-------------------------------------------------------");
        commandRunner.run(shutdown);
    }
}
