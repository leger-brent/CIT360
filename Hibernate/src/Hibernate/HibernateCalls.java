package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class HibernateCalls {

    SessionFactory factory = null;
    Session session = null;

    private static HibernateCalls single_instance = null;

    private HibernateCalls() {
        factory = HibernateUtils.getSessionFactory();
    }

    public static HibernateCalls getInstance() {
        if (single_instance == null) {
            single_instance = new HibernateCalls();
        }
        return single_instance;
    }

    public List<HeroEntity> getHeroes() {
        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from Hibernate.HeroEntity";
            List<HeroEntity> h = (List<HeroEntity>)session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return h;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

    public int addHero(String heroName, String heroHome, String heroElement, Integer heroHealth, Integer heroAttack, Integer heroSpeed) {

        int id = 0;

        try {
            session = factory.openSession();
            session.getTransaction().begin();

           HeroEntity hero = new HeroEntity();
           hero.setHeroName(heroName);
           hero.setHeroHome(heroHome);
           hero.setHeroElement(heroElement);
           hero.setHeroHealth(heroHealth);
           hero.setHeroAttack(heroAttack);
           hero.setHeroSpeed(heroSpeed);
           session.save(hero);
           session.getTransaction().commit();
           id = hero.getIdhero();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            System.out.println(heroName + " has been added to the database!");
            session.close();
            return id;
        }
    }

    public HeroEntity getHero(int id) {
        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from Hibernate.HeroEntity where id=" + id;
            HeroEntity h = (HeroEntity)session.createQuery(sql).getSingleResult();
            session.getTransaction().commit();
            return h;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }
}
