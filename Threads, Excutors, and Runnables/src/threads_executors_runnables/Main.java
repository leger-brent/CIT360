package threads_executors_runnables;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void spawn(ArrayList<Monsters> m, int h) {
        for (int i = 0; i < h; i++) {
            Monsters random = new Monsters();
            m.add(random);
        }
    }

    public static int index(int i) {
        if (i == 0) {
            return 0;
        }
        i = (int) (Math.random() * i);
        return i;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Create ArrayList

        ArrayList<Heroes> fighting = new ArrayList<Heroes>();
        ArrayList<Monsters> monsterFighting = new ArrayList<Monsters>();
        ArrayList<Monsters> monsterDefeated = new ArrayList<Monsters>();
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Heroes Vahn = new Heroes("Vahn", 6, 5, 20);
        Heroes Noa = new Heroes("Noa", 9, 3, 15);
        Heroes Gala = new Heroes("Gala", 3, 6, 24);

        fighting.add(Vahn);
        fighting.add(Noa);
        fighting.add(Gala);

        spawn(monsterFighting, 10);

        while (monsterFighting.size() > 0) {
            int hIndex = index(fighting.size());
            int mIndex = index(monsterFighting.size());
            if ((fighting.get(hIndex).fighting.compareAndSet(false, true))) {
                if (monsterFighting.size() > 0) {
                    if ((monsterFighting.get(mIndex).fighting.compareAndSet(false, true))) {
                        Battle battle = new Battle();
                        battle.setH(fighting.get(hIndex));
                        battle.setM(monsterFighting.get(mIndex));
                        battle.setMonsterFighting(monsterFighting);
                        battle.setMonsterDefeated(monsterDefeated);
                        executor.execute(battle);
                    }
                }
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        executor.shutdown();
        try {
            executor.awaitTermination(24L, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("You have defeated all of the monsters!");
        System.out.println("Final Stats:");
        for (int i = 0; i < fighting.size(); i++) {
            System.out.println(fighting.get(i).getName() + " defeated " + fighting.get(i).getMonsters_defeated() + " monsters!");
        }
        System.out.println(monsterDefeated.size());
    }
}