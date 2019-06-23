package MVC;

public class MVC {
    public static void main(String[] args)
    {
        View theView = new View();
        Model theModel = new Model();
        Controller.Control(theModel,theView);
    }
}
