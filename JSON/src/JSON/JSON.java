package JSON;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;

import java.io.FileWriter;
import java.io.IOException;

public class JSON {
    public static void main(String[] args) {
        JsonObject hero1Details = new JsonObject();
        hero1Details.put("name", "Vahn");
        hero1Details.put("home", "Rim Elm");
        hero1Details.put("element", "Fire");

        JsonObject hero1 = new JsonObject();
        hero1.put("Hero", hero1Details);

        JsonObject hero2Details = new JsonObject();
        hero2Details.put("name", "Noa");
        hero2Details.put("home", "Snowdrift Cave");
        hero2Details.put("element", "Wind");

        JsonObject hero2 = new JsonObject();
        hero2.put("Hero", hero2Details);

        JsonArray heroList = new JsonArray();
        heroList.add(hero1);
        heroList.add(hero2);

        //Write JSON file
        try (FileWriter file = new FileWriter("heroes.json")) {

            file.write(heroList.toJson());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
