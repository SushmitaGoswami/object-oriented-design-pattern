package org.sushmita.design_patterns_oops.state;

public class Gate {
    private State currentState;

    public Gate(){
        this.currentState = new CloseGateState(this);
    }

    public void setCurrentState(State state){
        this.currentState = state;
    }

    public void enter(){
        this.currentState.enter();
    }

    public void pay(){
        this.currentState.pay();
    }
}
