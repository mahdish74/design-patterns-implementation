package state.state;

import state.statemachine.StateMachine;

public class C implements State {
    public void change(StateMachine stateMachine) {
        System.out.println("c is final");
    }
}
