package org.sushmita.design_patterns_oops.command;

public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("No Command to execute");
    }

    @Override
    public void unExecute() {
        System.out.println("No Command to un execute");
    }
}
