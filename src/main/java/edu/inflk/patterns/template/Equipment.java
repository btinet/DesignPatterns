package edu.inflk.patterns.template;

import java.util.ArrayList;

public abstract class Equipment
{

    protected String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    public abstract String toString ();

}
