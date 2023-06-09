package edu.utsa.cs3443.project.model;

import androidx.annotation.NonNull;

import edu.utsa.cs3443.project.controller.IncomeController;

public abstract class Category {
    private String name;

    public Category(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract double getValue();

    public abstract void setValue(double value);
   // public abstract void setValue(double value, IncomeController.Time time);
}
