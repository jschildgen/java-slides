package com.example.javafx;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

// sample(Person)
public class Person {
    private StringProperty name = new SimpleStringProperty();

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }
}
// end-sample
