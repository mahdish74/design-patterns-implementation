package bridge.car.chassis.client;

import bridge.car.chassis.Chassis;
import bridge.car.chassis.Gt;
import bridge.car.chassis.Mustang;
import bridge.car.chassis.engine.Engine;
import bridge.car.chassis.engine.Inline4;
import bridge.car.chassis.engine.V6;
import bridge.car.chassis.engine.V8;

public class Main {
    public static void main(String[] args) {
        Engine v6= new V6();
       // Engine inline =new Inline4();
        Chassis mustang = new Mustang(v6);
        mustang.move();

        Engine v8 = new V8();
        Chassis gt =new Gt(v8);
        gt.move();
    }

}
