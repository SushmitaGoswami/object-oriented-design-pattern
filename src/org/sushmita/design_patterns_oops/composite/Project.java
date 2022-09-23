package org.sushmita.design_patterns_oops.composite;

import java.util.List;

public class Project implements ToDoList{
    private List<ToDo> toDoList;

    public Project(List<ToDo> toDoList){
        this.toDoList = toDoList;
    }
    @Override
    public String text() {
       String text = "<html><body><ul>";
       for(ToDo toDo : toDoList){
           text = text+"<li>";
           text += toDo.text();
           text = text + "</li>";
       }
       text +="</ul></body></html>";

       return text;
    }
}
