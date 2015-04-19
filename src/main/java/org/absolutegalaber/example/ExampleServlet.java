package org.absolutegalaber.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Josip.Mihelko @ Gmail
 */
@WebServlet("/exampleServlet")
public class ExampleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>ExampleServlet</h1>");
        writer.println("<p>This output comes from ExampleServlet :)</p>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
