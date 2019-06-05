package webapp;

import appLayer.reservationInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Boss on 5/14/2019.
 */
@WebServlet(name = "rezerva")
public class rezerva extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.getRequestDispatcher("/reservation.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         request.getRequestDispatcher("/reservationInfo.jsp").forward(request, response);

    }

    public void setAttributes(HttpServletRequest request){

        if(!request.getParameter("name").isEmpty()) {
            reservationInfo x = new reservationInfo();
            x.setName(request.getParameter("name"));
            x.setNumSeats(Integer.parseInt(request.getParameter("numSeats")));
        }
    }
}
