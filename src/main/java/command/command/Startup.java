package command.command;

import command.receiver.Receiver;
import state.state.C;

public class Startup extends Command {

    public Startup(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.startup();
        receiver.disconnect();
    }
}
