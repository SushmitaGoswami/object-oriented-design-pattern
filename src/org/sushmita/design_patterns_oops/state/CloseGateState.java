package org.sushmita.design_patterns_oops.state;

public class CloseGateState implements State{

    private Gate gate;

    public CloseGateState(Gate gate){
        this.gate = gate;
    }

    @Override
    public void enter() {
        System.out.println("Pay to Enter");
    }

    @Override
    public void pay() {
        boolean success = false;
        // success = make payment
        success = true;
        if(success){
            this.gate.setCurrentState(new OpenGateState(this.gate));
            System.out.println("Payment is successful!");
        }else{
            this.gate.setCurrentState(this);
            System.out.println("Payment failed!");
        }
    }
}
