public class Deposit implements Handler {
    public int bank(Integer balance, Integer amount){
        int newBalance = balance + amount;
        System.out.println("You deposited " + amount + ". Your balance is now " + newBalance + ".");
        return newBalance;
    }
}
