package edu.inflk.patterns;

import edu.inflk.patterns.builder.HumanBuilder;
import edu.inflk.patterns.builder.DogBuilder;
import edu.inflk.patterns.entity.*;
import edu.inflk.patterns.template.Agent;

import java.util.ArrayList;

public class Main {

    /**
     * Client Code
     * @param args Argumente, die über die Konsole übergeben werden können.
     *             z. B.: java -jar app.jar argument1 argument2
     */
    public static void main(String[] args)
    {

        // Liste für die Sammlung von Agenten instantiieren
        ArrayList<Agent> agentList = new ArrayList<>();

        // Agent vom Typ Agent mit einem Auto instantiieren
        agentList.add(new HumanBuilder().setFirstname("James").setLastname("Bond").setCar(new Car()).addEquipment(new Weapon("Pistole")).createHuman());

        // Agent vom Typ Dog instantiieren
        agentList.add(new DogBuilder().setNickname("Rex").createDog());

        // Für jeden Agenten Methoden ausführen
        for (Agent agent:
             agentList) {

            System.out.println("Agenteneigenschaften:");
            System.out.println("---------");

            System.out.println(agent);
            agent.doAction();
            System.out.println(agent.getCar(0));
            System.out.println(agent.getEquipment(0));

            System.out.println("=========");

        }

    }
}