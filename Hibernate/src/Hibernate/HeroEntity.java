package Hibernate;

import javax.persistence.*;

@Entity
@Table(name = "hero")
public class HeroEntity {
    private int idhero;
    private String heroName;
    private String heroHome;
    private String heroElement;
    private int heroHealth;
    private int heroAttack;
    private int heroSpeed;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idhero")
    public int getIdhero() {
        return idhero;
    }

    public void setIdhero(int idhero) {
        this.idhero = idhero;
    }

    @Column(name = "heroName")
    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    @Column(name = "heroHome")
    public String getHeroHome() {
        return heroHome;
    }

    public void setHeroHome(String heroHome) {
        this.heroHome = heroHome;
    }

    @Column(name = "heroElement")
    public String getHeroElement() {
        return heroElement;
    }

    public void setHeroElement(String heroElement) {
        this.heroElement = heroElement;
    }

    @Column(name = "heroHealth")
    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    @Column(name = "heroAttack")
    public int getHeroAttack() {
        return heroAttack;
    }

    public void setHeroAttack(int heroAttack) {
        this.heroAttack = heroAttack;
    }

    @Column(name = "heroSpeed")
    public int getHeroSpeed() {
        return heroSpeed;
    }

    public void setHeroSpeed(int heroSpeed) {
        this.heroSpeed = heroSpeed;
    }

    @Override
    public String toString() {
        return "HeroEntity{" +
                "idhero=" + idhero +
                ", heroName='" + heroName + '\'' +
                ", heroHome='" + heroHome + '\'' +
                ", heroElement='" + heroElement + '\'' +
                ", heroHealth=" + heroHealth +
                ", heroAttack=" + heroAttack +
                ", heroSpeed=" + heroSpeed +
                '}';
    }
}
