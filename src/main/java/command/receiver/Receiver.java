package command.receiver;

public interface Receiver {
   void startup();
   void showdown();
   void connect();
   void disconnect();
}
