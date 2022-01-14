package state.state;

import state.statemachine.StateMachine;

public class B implements State {
    public void change(StateMachine machine) {
        machine.setNextState(new C());
        System.out.println("b to c");
    }
}
