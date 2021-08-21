package bridge.car.chassis;

import bridge.car.chassis.engine.Engine;

public class Gt extends Chassis {
    public Gt(Engine engine) {
        super(engine);
    }

    @Override
    public void move() {
        System.out.println("Gt move");
    }
}
