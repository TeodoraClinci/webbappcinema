<%@ page import="appLayer.reservationInfo" %><%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 5/14/2019
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Reservation Page</title>
    <link rel="stylesheet" href="css/reservation.css">
</head>
<body>
<%
    reservationInfo x= new reservationInfo();
    x.setMovie(request.getParameter("movie_name"));
    %>

<body onload="onLoaderFunc()">
<form class="confirm-reservation" action="reservation.jsp" method="doPost">

<div class="inputForm">
    <center>
        Name *: <input type="text" name="name" id="Username" required>
        Number of Seats *: <input type="number" name="numSeats" id="Numseats" required>
        <br/><br/>
        <input type="submit" class="reservation" value="Start Selecting">
    </center>
</div>
</form>


<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js'></script>
<script src='https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js'></script>



<script  src="js/reservation.js"></script>





</div>

</body>
</html>
