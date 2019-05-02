package threads_executors_runnables;

import java.util.ArrayList;

public class Battle implements Runnable {

    ArrayList<Monsters> monsterFighting;
    ArrayList<Monsters> monsterDefeated;
    private Heroes h;
    private Monsters m;

    public synchronized ArrayList<Monsters> getMonsterFighting() {
        return monsterFighting;
    }


    public synchronized void setMonsterFighting(ArrayList<Monsters> monsterFighting) {
        this.monsterFighting = monsterFighting;
    }


    public synchronized ArrayList<Monsters> getMonsterDefeated() {
        return monsterDefeated;
    }


    public synchronized void setMonsterDefeated(ArrayList<Monsters> monsterDefeated) {
        this.monsterDefeated = monsterDefeated;
    }

    public synchronized Heroes getH() {
        return h;
    }


    public synchronized void setH(Heroes h) {
        this.h = h;
    }


    public synchronized Monsters getM() {
        return m;
    }


    public synchronized void setM(Monsters m) {
        this.m = m;
    }


    public void run() {
        // TODO Auto-generated method stub
        int damage = 0;
        int hp = 0;
        int hSpeedCounter = 0;
        int mSpeedCounter = 0;
        int max = 6;
        int min = 2;
        int range = max - min;
        boolean hAttack = true;
        int round = 1;

        System.out.println(h.getName() + " has begun to fight " + m.getName() + "!");

        while (h.alive && m.alive) {
            System.out.println("\nRound " + round);

            //Determines who attacks and increments the speed counter of the loser
            if ((m.getSpeed() + mSpeedCounter) > (h.getSpeed() + hSpeedCounter)) {
                hAttack = false;
            } else if ((m.getSpeed() + mSpeedCounter < h.getSpeed() + hSpeedCounter)) {
                hAttack = true;
            }

            if (hAttack) {
                damage = h.getAttack() - m.getDefense() + (int) ((Math.random() * range) + min);
                System.out.println(h.getName() + " attacks!");
                System.out.println(h.getName() + " did " + damage + " damage to " + m.getName() + ".");
                hp = m.getHp() - damage;
                m.setHp(hp);
                hSpeedCounter = 0;
                mSpeedCounter = mSpeedCounter + 2;
                System.out.println(h.getName() + " HP: " + h.getHp());
                if (m.getHp() <= 0) {
                    m.setHp(0);
                    System.out.println(m.getName() + " HP: " + m.getHp() + "\n");
                } else {
                    System.out.println(m.getName() + " HP: " + m.getHp() + "\n");
                }
                if (m.getHp() <= 0) {
                    m.setAlive(false);
                    System.out.println(m.getName() + " has been KO'd");
                    h.setMonsters_defeated(h.getMonsters_defeated() + 1);
                    monsterDefeated.add(m);
                    monsterFighting.remove(m);
                }
            } else if (!hAttack) {
                damage = m.getAttack() - h.getDefense() + (int) ((Math.random() * range) + min);
                System.out.println(m.getName() + " attacks!");
                System.out.println(m.getName() + " did " + damage + " damage to " + h.getName() + ".");
                hp = h.getHp() - damage;
                h.setHp(hp);
                mSpeedCounter = 0;
                hSpeedCounter = hSpeedCounter + 2;
                System.out.println(h.getName() + " HP: " + h.getHp());
                System.out.println(m.getName() + " HP: " + m.getHp() + "\n");
                if (h.getHp() <= 0) {
                    h.setAlive(false);
                    System.out.println(h.getName() + " has been KO'd");
                }
            }
            round = round + 1;
            if (h.isAlive() && m.isAlive()) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        System.out.println("The battle is over between " + h.getName() + " and " + m.getName() + ".\n");
        h.fighting.set(false);
        m.fighting.set(false);
    }
}