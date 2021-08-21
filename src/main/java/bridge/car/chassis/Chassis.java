package bridge.car.chassis;

import bridge.car.chassis.engine.Engine;

public abstract class Chassis {
    private final Engine engine;

    public Chassis(Engine engine) {
        this.engine = engine;
    }

    public abstract void move();
}
