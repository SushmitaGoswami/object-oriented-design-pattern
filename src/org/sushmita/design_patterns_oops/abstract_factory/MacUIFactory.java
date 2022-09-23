package org.sushmita.design_patterns_oops.abstract_factory;

public class MacUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Terminal createTerminal() {
        return new MacTerminal();
    }
}
