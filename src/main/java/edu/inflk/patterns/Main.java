package edu.inflk.patterns;

import edu.inflk.patterns.builder.HumanBuilder;
import edu.inflk.patterns.builder.DogBuilder;
import edu.inflk.patterns.director.AgentDirector;
import edu.inflk.patterns.entity.*;
import edu.inflk.patterns.template.Agent;
import edu.inflk.patterns.template.Equipment;
import edu.inflk.patterns.template.Vehicle;

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

        /* Builder

        Mit einem Builder kann ein Objekt bedarfsorientiert zusammengebaut werden. Der Vorteil ist außerdem, dass auf
        unübersichtliche Constructors im Client Code verzichtet werden kann. Im Folgenden werden zwei unterschiedliche
        Agenten erzeugt. Der Builder instantiiert mit create[...]() ein neues Objekt, das von Agent erbt.
         */

        // Agent vom Typ Agent mit einem Auto instantiieren
        Agent agent1 = new HumanBuilder().setFirstname("James").setLastname("Bond").addVehicle(new Car()).addEquipment(new Weapon("Pistole")).createHuman();

        // Agent vom Typ Dog instantiieren
        Agent agent2 = new DogBuilder().setNickname("Rex").createDog();

        /*
        Über eine Anweisungsklasse könnten wir auch eine Charakterbibliothek erstellen.
         */

        AgentDirector director = new AgentDirector();
        HumanBuilder humanBuilder = new HumanBuilder();

        // Ein paar Fahrzeuge hinzufügen
        humanBuilder
                .addVehicle(new Car())
                .addVehicle(new Boat())
        ;

        Agent agent3 = director.createGoldfinger(humanBuilder);

        humanBuilder.reset(); // Builder zurücksetzen, damit keine Fahrgemeinschaften entstehen.
        Agent agent4 = director.createBond(humanBuilder);

        /* Class Templates

        Human und Dog erben von Agent und haben dieselben Methoden. Da Agent dem Muster einer Vorlage (Template) folgt,
        gibt es:

        1. Abstrakte Methoden, die jede Unterklasse zwingend selbst implementieren muss
        2. Leere Methoden, die optional überschrieben werden können

        Dadurch ist sichergestellt, dass jede erbende Klasse dieselben Methoden hat, auch wenn diese nicht implementiert
        sind.

        Die folgende Ausgabe zeigt, dass ein Mensch, aber auch ein Hund ein Geheimagent sein kann. Ein Mensch ist in der
        Lage ein Auto zu fahren und einen Ausrüstungsgegenstand zu benutzen. Ein Hund soll das nicht können, dennoch
        hat er die Methoden dazu. Diese Methoden sind jedoch 'leer'.
         */

        agentList.add(agent1);
        agentList.add(agent2);
        agentList.add(agent3);
        agentList.add(agent4);

        // Für jeden Agenten Methoden ausführen
        for (Agent agent:
             agentList) {

            System.out.println("Agenteneigenschaften:");
            System.out.println("---------------------");

            System.out.println(agent);
            agent.doAction();

            // Alle Fahrzeuge ausgeben
            for (Vehicle vehicle :
                 agent.getVehicles()   ) {
                System.out.printf("%s: %s %n",vehicle.getVehicleType(),vehicle);
            }

            // Alle Ausrüstungsgegenstände ausgeben
            for (Equipment equipment :
                    agent.getEquipment()   ) {
                System.out.println("Ausrüstung: " + equipment);
            }

            System.out.println("=====================");
            System.out.println();

        }

    }

}
