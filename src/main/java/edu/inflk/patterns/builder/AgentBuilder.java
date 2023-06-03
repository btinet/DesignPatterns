package edu.inflk.patterns.builder;

import edu.inflk.patterns.entity.Agent;
import edu.inflk.patterns.template.VehicleTemplate;

public class AgentBuilder {
    private String firstname;
    private String lastname;
    private VehicleTemplate car;

    public AgentBuilder setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public AgentBuilder setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public AgentBuilder setCar(VehicleTemplate car) {
        this.car = car;
        return this;
    }

    public Agent createAgent() {
        return new Agent(firstname, lastname, car);
    }
}