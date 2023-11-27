package edu.inflk.patterns.template;

public enum AgentType {

    BEGINNER ("Agent für einfache Aufträge"),
    INTERMEDIATE ("Agent für mittlere Aufträge"),
    EXPERT ("Agent für schwierige Aufträge");

    private final String label;

    AgentType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    @Override
    public java.lang.String toString() {
        return this.getLabel();
    }

}
