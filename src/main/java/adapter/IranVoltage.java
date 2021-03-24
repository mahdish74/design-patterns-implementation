package adapter;

import bridge.engine.V6;

public class IranVoltage implements Voltage {
    private final int value;

    public IranVoltage() {
        this.value = 220;
    }

    @Override
    public int getValue() {
        return value;
    }
}
