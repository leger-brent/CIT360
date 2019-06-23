package Hibernate;

import java.util.List;

public class Hibernate {

    public static void main(String[] args) {


        HibernateCalls hi = HibernateCalls.getInstance();

        List<HeroEntity> h = hi.getHeroes();
        for (HeroEntity i : h) {
            System.out.println(i);
        }

        int id = hi.addHero("Gala","Biron Monastery","Lightning",100,30,10);

        System.out.println(hi.getHero(id));
    }

}