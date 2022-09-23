package org.sushmita.design_patterns_oops.command;

public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void unExecute() {
        light.on();
    }
}
