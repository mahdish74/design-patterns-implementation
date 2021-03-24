package adapter;

public class Adapter {

    public  int convert(Voltage voltage) {
        if (voltage.getValue() == 220) {
            return voltage.getValue() - 110;
        } else {
            return voltage.getValue() + 110;
        }
    }

}
