package observer.client;

import observer.observer.Email;
import observer.observer.Sms;
import observer.subject.MessageSender;

public class Main {
    public static void main(String[] args) {
        MessageSender messageSender = new MessageSender();
        messageSender.addObserver(new Email());
        messageSender.addObserver(new Sms());
        messageSender.sendMessage("hello ...");
    }
}
