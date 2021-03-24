package bridge.chassis;

import bridge.engine.Engine;

public abstract class Chassis {
    private final Engine engine;

    public Chassis(Engine engine) {
        this.engine = engine;
    }

    public abstract void move();
}
