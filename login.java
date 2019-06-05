package webapp;

import appLayer.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Boss on 4/25/2019.
 */
@WebServlet(name = "login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*PrintWriter out = response.getWriter();
        out.print("login-name:"+request.getParameter("username")+" password:"+request.getParameter("password"));
*/

        request.setAttribute("username", request.getParameter("username"));
        request.setAttribute("password", request.getParameter("password"));

        User userObject = new User();


        if (userObject.validateUser(request.getParameter("username"), request.getParameter("password"))) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else {
            request.setAttribute("errorMessage", "Invalid Login, Try again");
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*PrintWriter out = response.getWriter();
        out.print("login-name:"+request.getParameter("username")+" password:"+request.getParameter("password"));*/

        request.setAttribute("username", request.getParameter("username"));
        request.setAttribute("password", request.getParameter("password"));

        User userObject = new User();


        if (userObject.validateUser(request.getParameter("username"), request.getParameter("password"))) {
            HttpSession session = request.getSession();
            session.setAttribute("username",request.getParameter("username"));
            session.setAttribute("connected","true");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else {
            request.setAttribute("errorMessage", "Invalid Login, Try again");
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        }
    }
}
