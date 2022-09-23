package org.sushmita.design_patterns_oops.composite;

public class ToDo implements ToDoList{
    private String text;

    public ToDo(String text) {
        this.text = text;
    }

    @Override
    public String text() {
        return text;
    }
}
