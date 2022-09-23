package org.sushmita.design_patterns_oops.abstract_factory;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Terminal createTerminal() {
        return new WindowsTerminal();
    }
}
