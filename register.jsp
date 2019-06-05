<%--
  Created by IntelliJ IDEA.
  User: Boss
  Date: 4/25/2019
  Time: 8:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Page</title>
    <link rel="stylesheet" href="css/register.css">
</head>
<body>


<div class="login-page">
    <h1 class="cinemaName">Nume Cinema</h1>
    <div class="form">
        <form class="register-form" action="create" method="doGet">

            <input type="text" name="firstname" placeholder="firstname"/>
            <input type="text" name="lastname" placeholder="lastname"/>
            <input type="text" name="user" placeholder="username"/>
            <input type="password" name="pass" placeholder="password"/>
            <input type="submit" class='button' value="create" />
            <p class="message">Already registered? <a>Sign In</a></p>
        </form>
        <form class="login-form" action="login" method="doGet">
            <input type="text" name="username" placeholder="username"/>
            <input type="password" name="password" placeholder="password"/>
            <input type="submit" class='button' value="login" />
            <p class="message">Not registered? <a>Create an account</a></p>
        </form>
    </div>
    <div class="errorMessage">${errorMessage}</div>
</div>
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>



<script  src="js/index.js"></script>

</body>
</html>
