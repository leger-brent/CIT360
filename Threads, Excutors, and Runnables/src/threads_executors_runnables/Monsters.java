package threads_executors_runnables;

import java.util.concurrent.atomic.AtomicBoolean;

public class Monsters {
    int max = 8;
    int min = 4;
    int range = max - min + 1;

    String name = "Theeder";
    int hp = 25;
    int speed = (int) (Math.random() * range + min);
    int defense = (int) (Math.random() * range + min);
    int attack = (int) (Math.random() * range + min);
    boolean alive = true;
    AtomicBoolean fighting = new AtomicBoolean(false);

    public Monsters() {
        super();
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDefense() {
        return defense;
    }

    public int getAttack() {
        return attack;
    }
}