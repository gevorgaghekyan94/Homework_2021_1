package com.company.starwars;

public class LukeSkywalker extends AbstractPerson implements Relation {

    public LukeSkywalker() {
        super("Luke Skywalker");
    }

    @Override
    public void relationTo(AbstractPerson abstractPerson) {
        if (abstractPerson instanceof DarthVader)
            System.out.println("Luke, I am your father.");
        else if (abstractPerson instanceof Leia)
            System.out.println("Luke, I am your sister.");
        else if (abstractPerson instanceof Han)
            System.out.println("Luke, I am your brother in law.");
        else if (abstractPerson instanceof R2D2)
            System.out.println("Luke, I am your droid.");
    }
}
