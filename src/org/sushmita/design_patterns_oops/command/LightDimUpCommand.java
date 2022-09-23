package org.sushmita.design_patterns_oops.command;

public class LightDimUpCommand implements Command{
    private Light light;

    public LightDimUpCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.dimUp();
    }

    @Override
    public void unExecute() {
        light.dimDown();
    }
}
