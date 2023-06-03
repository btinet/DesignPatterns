package edu.inflk.patterns.entity;

import edu.inflk.patterns.template.AgentTemplate;

public class Dog extends AgentTemplate {

    protected String nickname;

    public Dog (String nickname)
    {
        this.nickname = nickname;
    }

    // Die folgenden zwei Methoden müssen zwanghaft implementiert werden
    @Override
    public void doAction() {
        System.out.println("Ich bin ein Hund und kann bellen.");
    }

    @Override
    public String toString() {
        return this.nickname;
    }

    // Dog darf KEIN Autos fahren, also überschreiben wir auch nicht die leeren Methoden der Oberklasse.

}
