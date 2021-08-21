package bridge.car.chassis;

import bridge.car.chassis.engine.Engine;

public class Mustang extends Chassis{
    public Mustang(Engine engine) {
        super(engine);
    }

    @Override
    public void move() {
        System.out.println("mustang move");
    }
}
