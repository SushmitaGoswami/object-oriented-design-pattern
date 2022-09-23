package org.sushmita.design_patterns_oops.abstract_factory;

public class LinuxUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Terminal createTerminal() {
        return new LinuxTerminal();
    }
}
