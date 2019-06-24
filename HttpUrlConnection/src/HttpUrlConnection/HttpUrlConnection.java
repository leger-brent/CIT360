package HttpUrlConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class HttpUrlConnection {


    public static void main(String[] args){

        try {
            URL url = new URL("https://en.wikipedia.org/wiki/Legend_of_Legaia");
            URLConnection urlcon = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    urlcon.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
