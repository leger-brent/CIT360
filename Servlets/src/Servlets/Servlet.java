package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter output = response.getWriter();

        String hero = request.getParameter("hero");

        if (hero.equals("Vahn")) {
            output.println("You have selected " + hero + ", a well-rounded fighter. He uses a combination of power and speed to overcome his opponents.");
        } else if (hero.equals("Noa")) {
            output.println("You have selected " + hero + ". Noa's strength lies in her lightning fast reflexes. What she lacks in muscle, she makes up for with speed.");
        } else {
            output.println("You have selected " + hero + ". Gala overpowers his opponents through brute strength. Calm and collected, he delivers the most powerful blows.");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
