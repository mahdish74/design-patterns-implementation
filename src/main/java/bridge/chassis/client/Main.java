package bridge.chassis.client;

import bridge.chassis.Chassis;
import bridge.chassis.Gt;
import bridge.chassis.Mustang;
import bridge.engine.Engine;
import bridge.engine.V6;
import bridge.engine.V8;

public class Main {
    public static void main(String[] args) {
        Engine v6= new V6();
        Chassis mustang=new Mustang(v6);
        mustang.move();

        Engine v8= new V8();
        Chassis gt=new Gt(v8);
        gt.move();
    }

}
