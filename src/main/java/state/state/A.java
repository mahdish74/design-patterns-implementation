package state.state;

import state.statemachine.StateMachine;

public class A implements State {

    public void change(StateMachine machine) {
        machine.setNextState(new B());
        System.out.println("a to b");
    }
}
