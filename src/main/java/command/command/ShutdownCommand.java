package command.command;

import command.receiver.Receiver;

public class ShutdownCommand extends Command {
    public ShutdownCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.showdown();
        receiver.disconnect();
    }
}
