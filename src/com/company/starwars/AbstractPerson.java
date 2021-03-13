package com.company.starwars;

public abstract class AbstractPerson {

    String name;

    public AbstractPerson() {
    }

    public AbstractPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
