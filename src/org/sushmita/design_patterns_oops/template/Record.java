package org.sushmita.design_patterns_oops.template;

public abstract class Record {
    public void save(){
        this.beforeSave();
        System.out.println("Saving into db");
        this.afterSave();
    }

    abstract void beforeSave();
    abstract void afterSave();
}
