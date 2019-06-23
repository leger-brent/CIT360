import java.util.HashMap;

public class Controller {
    public static HashMap<Integer, Handler> which = new HashMap<>();

    public static void decideWhich(Integer operator, Integer balance, Integer amount) {
        which.put(1, new Deposit());
        which.put(2, new Withdraw());

        Handler handleIt = which.get(operator);
        handleIt.bank(balance, amount);
    }
}