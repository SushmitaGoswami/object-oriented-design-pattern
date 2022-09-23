package org.sushmita.design_patterns_oops.abstract_factory;

public class AbstractUIFactory {
    public enum UIType{
        WINDOWS,
        LINUX,
        MACOS;
    }
    public static UIFactory createUIFactory(UIType type){
        switch (type){
            case WINDOWS -> {
                return new WindowsUIFactory();
            }
            case LINUX -> {
                return new LinuxUIFactory();
            }
            case MACOS -> {
                return new MacUIFactory();
            }
            default -> throw new IllegalArgumentException("Invalid OS!");
        }
    }
}
