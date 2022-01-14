package state.statemachine;

import state.state.State;

public class StateMachine {
    private State nextState;


    public StateMachine(State currentState) {
        this.nextState = currentState;
    }

    public void change() {
        nextState.change(this);
    }

    public void setNextState(State nextState) {
        this.nextState = nextState;
    }
}
