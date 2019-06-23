package MVC;

public class Controller {

    public static void Control(Model m, View v) {

        Hero theHero;
        int choice;
        int secondChoice;

        do {
            choice = v.initialView();
            theHero = m.getHero(choice);
            do {
                secondChoice = v.heroView();
                if (secondChoice == 1) {
                    readBio(theHero);
                }
                if (secondChoice == 2) {
                    viewStats(theHero);
                }
            } while (secondChoice == 1 || secondChoice == 2);
            if (secondChoice == 3) {
                v.selected(theHero);
            }
        } while (secondChoice == 4);
    }

    //read bio
    public static void readBio(Hero h) {
        String bio = h.getBio();
        System.out.println("\n" + bio + "\n");
    }

    //view stats
    public static void viewStats(Hero h) {
        System.out.println("\n" + "Health: " + h.getHealth() + "\nAttack: " + h.getAttack() + "\nSpeed: " + h.getSpeed() + "\n");
    }


}
