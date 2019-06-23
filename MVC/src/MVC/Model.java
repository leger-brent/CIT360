package MVC;


public class Model {
    Hero Vahn = new Hero("Vahn", 100, 20, 20, "Vahn is a well-rounded fighter. He uses a combination of power and speed to overcome his opponents.");
    Hero Noa = new Hero("Noa", 100, 10, 30, "Noa strength lies in her lightning fast reflexes. What she lacks in muscle, she makes up for with speed.");
    Hero Gala = new Hero("Gala", 100, 30, 10, "Gala overpowers his opponents through brute strength. Calm and collected, he delivers the most powerful blows.");

    public Hero getHero(int i) {

        if (i == 1) {
            Hero thisHero = Vahn;
            return thisHero;
        }
        else if (i == 2) {
            Hero thisHero = Noa;
            return thisHero;
        } else {
            Hero thisHero = Gala;
            return thisHero;
        }
    }
}
