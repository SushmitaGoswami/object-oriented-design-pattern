package org.sushmita.design_patterns_oops.template;

public class User extends Record {
    @Override
    void beforeSave() {
        System.out.println("Before Save - User");
    }

    @Override
    void afterSave() {
        System.out.println("After Save - User");
    }
}
