package state.state;

import state.statemachine.StateMachine;

public interface State {
    void change(StateMachine machine);
}
