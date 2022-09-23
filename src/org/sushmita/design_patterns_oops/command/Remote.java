package org.sushmita.design_patterns_oops.command;

import java.util.List;

public class Remote {
    private LightOnCommand lightOnCommand;
    private LightOffCommand lightOffCommand;
    private LightDimUpCommand lightDimUpCommand;
    private LightDimDownCommand lightDimDownCommand;


    public Remote(LightOnCommand onCommand, LightOffCommand offCommand, LightDimUpCommand dimUpCommand, LightDimDownCommand dimDownCommand){
        this.lightOnCommand = onCommand;
        this.lightOffCommand = offCommand;
        this.lightDimUpCommand = dimUpCommand;
        this.lightDimDownCommand = dimDownCommand;
    }

    public void lightOn(){
        this.lightOnCommand.execute();
    }

    public void lightOff(){
        this.lightOffCommand.execute();
    }
    public void lightDimUp(){
        this.lightDimUpCommand.execute();
    }
    public void lightDimDown(){
        this.lightDimDownCommand.execute();
    }

}
