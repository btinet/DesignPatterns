package edu.inflk.patterns.director;

import edu.inflk.patterns.builder.CarBuilder;
import edu.inflk.patterns.builder.DogBuilder;
import edu.inflk.patterns.builder.HumanBuilder;
import edu.inflk.patterns.entity.Weapon;
import edu.inflk.patterns.template.AgentType;
import edu.inflk.patterns.template.Agent;

public class AgentDirector {

    public Agent createBond (HumanBuilder builder)
    {
        builder
                .setFirstname("James")
                .setLastname("Bond")
                .addVehicle(new VehicleDirector().createRaceCar(new CarBuilder()))
                .addEquipment(new Weapon("Wasserpistole"))
                .setType(AgentType.EXPERT)
        ;

        return builder.createHuman();
    }

    public Agent createGoldfinger (HumanBuilder builder)
    {
        builder
                .setFirstname("George")
                .setLastname("Goldfinger")
        ;

        return builder.createHuman();
    }

    public Agent createRex (DogBuilder builder)
    {
        builder
                .setNickname("Rex")
        ;

        return builder.createDog();
    }

}
