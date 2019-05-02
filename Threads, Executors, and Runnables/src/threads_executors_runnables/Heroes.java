package threads_executors_runnables;

import java.util.concurrent.atomic.AtomicBoolean;

public class Heroes {

    String name;
    int hp = 999;
    int speed;
    int defense;
    int attack;
    int monsters_defeated = 0;
    boolean alive = true;
    AtomicBoolean fighting = new AtomicBoolean(false);

    public Heroes(String name, int speed, int defense, int attack) {
        super();
        this.name = name;
        this.speed = speed;
        this.defense = defense;
        this.attack = attack;
    }

    public synchronized String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getMonsters_defeated() {
        return monsters_defeated;
    }

    public void setMonsters_defeated(int monsters_defeated) {
        this.monsters_defeated = monsters_defeated;
    }
}