package webapp;

import com.daoimpl.PersonDaoImpl;
import com.entities.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Created by Boss on 5/14/2019.
 */
@WebServlet(name = "create")
public class create extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String username = request.getParameter("user");
            String password = request.getParameter("pass");

        Person person = new Person(firstname,lastname,username,password);
        try {
            person.addPersonToDatabase();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
