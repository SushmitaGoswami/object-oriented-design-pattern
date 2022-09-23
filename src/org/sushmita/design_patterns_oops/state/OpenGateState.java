package org.sushmita.design_patterns_oops.state;

public class OpenGateState implements State{

    private Gate gate;

    public OpenGateState(Gate gate){
        this.gate = gate;
    }
    @Override
    public void enter() {
        System.out.println("Entering through the gate");
        this.gate.setCurrentState(new CloseGateState(this.gate));
    }

    @Override
    public void pay() {
        System.out.println("No need to pay again!");
    }
}
