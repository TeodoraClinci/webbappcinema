<%@ page import="com.entities.Movie" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 4/25/2019
  Time: 8:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Nume Cinema</title>
      <link rel="stylesheet" href="css/index.css">
  </head>
  <body>
<%
  //  if(session.getAttribute("connected") == null)

%>
  <div class="background">
    <div class="searchBar">
            Search Bar
    </div>

    <div class="movies">
      <%
          Movie movi = new Movie();
          Movie movie[] = movi.generateMovies();

          PrintWriter output =response.getWriter();

          for(int i = 0; i < movie.length; i ++){
              output.println("<span class='"+"movieID"+"'>");
              output.println("<img src='"+movie[i].getImagePath()+"'>");
              output.println("<span class='"+"movieDetails"+"'>");
              output.println("<div class='"+"movieName"+"'>"+movie[i].getName()+"</div>");
              output.println("<div class='"+"details"+"'>"+movie[i].getDetails()+"</div>");

              output.println("<form class='"+"rezerva-form"+"' action='"+"rezerva"+"' method='"+"doGet"+"'>");
              output.println("<input type='"+"submit"+"' class='"+"button"+"' value='"+"rezerva"+"' />");
              output.println("<input type='hidden' name='movie_name' value='"+movie[i].getName()+"'/>");
              output.println("</form>");

              output.println("</span></span>");


          }


      %>
    </div>


  </div>


  </body>
</html>
