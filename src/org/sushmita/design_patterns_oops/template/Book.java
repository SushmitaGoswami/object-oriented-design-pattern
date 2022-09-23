package org.sushmita.design_patterns_oops.template;

public class Book extends Record{
    @Override
    void beforeSave() {
        System.out.println("Before Save - Book");
    }

    @Override
    void afterSave() {
        System.out.println("After Save - Book");
    }
}
