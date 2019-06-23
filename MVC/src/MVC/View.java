package MVC;

import java.util.Scanner;

public class View {

    Scanner in = new Scanner(System.in);
    int choice;

    public int initialView() {
        System.out.println("Welcome to the fighting dome! Which Hero would you like to select?\n1. Vahn\n2. Noa\n3. Gala");

        while (choice != 1 && choice != 2 && choice != 3) {
            choice = in.nextInt();
        }
        return choice;
    }

    public int heroView() {
     System.out.println("Which of the following would you like to do?\n1. Read Bio\n2. View Stats\n3. Confirm choice\n4. Go back");
     choice = 0;
     while (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
            choice = in.nextInt();
        }
        return choice;
    }

    public void selected(Hero h)
    {
        System.out.println("You have selected " + h.getName() + "!");
    }
}
