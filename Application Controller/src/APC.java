import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class APC {

    public static void main(String[] args) {

        Account player = new Account();
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int balance = 0;
        int howMuch = 0;

        System.out.println("Welcome to the bank of Legaia! Would you like to make a deposit or a withdrawal today?");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");

        while (choice != 1 && choice != 2) {
            choice = parseInt(in.nextLine());
        }

        System.out.println("How much?");
        howMuch = in.nextInt();
        balance = player.getBalance();

        Controller.decideWhich(choice, balance, howMuch);
    }

}
