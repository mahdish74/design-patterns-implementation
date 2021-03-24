package adapter;

public class USAVoltage implements Voltage {
    private final int value;

    public USAVoltage() {
        value = 110;
    }

    @Override
    public int getValue() {
        return value;
    }
}
