package Collections;

import java.util.*;

public class Collections {

    public static void main(String[] args) {

        //LIST BEGIN ----------------------------------------------

        //Create the ArrayList
        ArrayList<String> characterNames = new ArrayList<String>();

        //Add characters to the ArrayList
        characterNames.add("Vahn");
        characterNames.add("Noa");
        characterNames.add("Gala");
        characterNames.add("Noa");

        //Print the entire ArrayList
        System.out.println(characterNames);

        //Remove Noa duplicate from the ArrayList
        characterNames.remove(3);

        //Print the entire ArrayList
        System.out.println(characterNames);

        //LIST END ------------------------------------------------
        System.out.println("\n");
        //SET BEGIN -----------------------------------------------

        //Create the Set
        HashSet<String> weapons = new HashSet<String>();

        //Add weapons to the Set
        weapons.add("Chaos Breaker");
        weapons.add("Golden Claw");
        weapons.add("Great Axe");

        //Add duplicates to the Set
        weapons.add("Chaos Breaker");
        weapons.add("Golden Claw");
        weapons.add("Great Axe");

        //Print the entire Set
        System.out.println(weapons);

        //SET END -------------------------------------------------
        System.out.println("\n");
        //MAP BEGIN -----------------------------------------------

        //Create descriptions for cities in the world.
        Map<String, String> cities = new HashMap<>();

        //Add cities to the Map
        cities.put("Rim Elm", "This is your hometown");
        cities.put("Hunter's Fountain", "The hunter's gather here for respite.");
        cities.put("Drake Castle", "The kingdom's castle. Named for the line of kings that have lived here for centuries.");
        cities.put("Snowdrift Cave", "A cave in the far northwest of the kingdom. Since it's on the other side of Mt. Rikuroa, no one really visits it.");

        //Print the entire Map
        System.out.println("Four places you will visit on your journey are:");

        for (String s : cities.keySet()) {
            System.out.println("Place: " + s + ".\nDescription: " + cities.get(s) + "\n");
        }

        //Remove Drake Castle from the Map
        cities.replace("Drake Castle", "The drawbridge to Drake Castle has been raised. You can no longer enter.");

        for (String s : cities.keySet()) {
            System.out.println("Place: " + s + ".\nDescription: " + cities.get(s) + "\n");
        }


        //MAP END -------------------------------------------------
        System.out.println("\n");
        //QUEUE BEGIN ---------------------------------------------

        //Create the Queue
        Queue<String> letter = new LinkedList<String>();

        //Add pages to the Queue
        letter.add("Hello Mei,\nI am at Byron Monastery and have met a monk named Gala.");
        letter.add("Master Zopu is sending us to West Voz Forest to revive the Genesis Tree.");
        letter.add("Once we finish here, I hope to be able to return to Rim Elm and visit everyone before we continue on our journey.");

        //Use the queue to read the letter
        for (int i = -1; i <= letter.size(); i++) {
            System.out.println(letter.poll());
        }

        //QUEUE END -----------------------------------------------
        System.out.println("\n");
        //TREESET BEGIN -------------------------------------------

        //Create the TreeSet
        TreeSet<String> inventory = new TreeSet<String>();

        //Add items to the TreeSet. Sorting an inventory alphabetically would be helpful.
        inventory.add("Healing Leaf");
        inventory.add("Door of Wind");
        inventory.add("Magin Fruit");
        inventory.add("Healing Fruit");
        inventory.add("Door of Light");
        inventory.add("Miracle Water");


        //Print the entire TreeSet
        System.out.println(inventory);

        //TREESET END ---------------------------------------------
    }

}