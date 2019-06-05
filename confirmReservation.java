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
 * Created by Boss on 5/17/2019.
 */
@WebServlet(name = "confirmReservation")
public class confirmReservation extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out1 = response.getWriter();

        String[] seats= request.getParameterValues("seats");

       reservationInfo x = new reservationInfo();
        x.setSeats(seats);

        String out=x.printInfo();
        out1.println(out);


           if(seats.length != x.getNumSeats() ) {
               request.setAttribute("name",x.getName());
               request.setAttribute("numSeats",x.getNumSeats());
               request.setAttribute("errorMessage", "Incorect number of seats");
               request.getRequestDispatcher("/reservation.jsp").forward(request,response);
           }



           //TODO: trimite locurile catre clasa care se ocupa de rezervare si verifica daca numarul de locuri rezervate este egal cu cel rezervate


        //Daca totul este ok

      //  request.getRequestDispatcher("/confirmReservation").forward(request,response);
    }
}
