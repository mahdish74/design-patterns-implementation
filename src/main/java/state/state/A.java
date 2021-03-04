package state.state;

import state.statemachine.StateMachine;

public class A implements State {

    public void change(StateMachine stateMachine) {
        stateMachine.setCurrentState(new B());
        System.out.println("a to b");
    }
}
