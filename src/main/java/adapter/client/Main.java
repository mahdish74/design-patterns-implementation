package adapter.client;

import adapter.Adapter;
import adapter.IranVoltage;
import adapter.Voltage;

public class Main {
    public static void main(String[] args) {
        Voltage iran=new IranVoltage();
        Adapter adapter=new Adapter();
        System.out.println(adapter.convert(iran));
    }
}
