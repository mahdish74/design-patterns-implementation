package command.command;

import command.receiver.Receiver;

public abstract class Command {
    final Receiver receiver;

    protected Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
