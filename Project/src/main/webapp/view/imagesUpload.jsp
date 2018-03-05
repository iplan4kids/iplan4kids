<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="el">
<head>
    <title>Iplan4kids</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href=""<c:url value='/images/iplan.png' />"">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/octicons/4.4.0/font/octicons.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../pages/styles.css" type="text/css">
</head>

<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">

<!-- ------------------------------------- PAGE HEADER -------------------------------------------------- -->
<div class="pageHeader row">
    <div class="JumboLogo" >
        <img  src="<c:url value='/images/iplan.png' />" />
        <h2 style="margin:auto 0; color:white">Iplan4kids<strong><sub style="font-size:15px; color:white"> by Iplan</sub></strong></h2>
    </div>
</div>

<!-- -------------------------------------- NAVIGATION BAR ----------------------------------------------- -->
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-left" href="/app/provider/">
                <img src="<c:url value='/images/iplan.png' />" align="center" width="50"/>
            </a>
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <!-- Left part of Navbar -->
            <ul class="nav navbar-nav navbar-left">
                <li>
                    <a href="#">Ιστορικό</a>
                </li>
                <li>
                    <a href="#">Αναφορά</a>
                </li>
                <li>
                    <a href="/app/provider/addEvent">Προσθήκη Νέου</a>
                </li>
                <li>
                    <a href="/app/provider/buySub">Ανανέωσε</a>
                </li>
            </ul>
            <!-- Right part of Navbar -->
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span> ${provider.getUsername()}
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/app/provider/myProfile"><span class="glyphicon glyphicon-file"></span>Τα στοιχεία μου</a></li>
                        <li ><a  href="/app/logoutStrong"><span id="logout" class="glyphicon glyphicon-log-out"></span>Αποσύνδεση</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- -------------------------------------- MAIN PAGE ----------------------------------------------- -->

<h2 style="text-align:center">Παρακαλώ αν επιθυμείτε να ανεβάσετε φωτογραφίες για τη δραστηριότητα σας, μπορείτε να τις επιλέξετε παρακάτω. Διαφορετικά απλώς πατήστε το κουμπί και θα μεταβείτε στη προηγούμενη φόρμα</h2>

<form id="register1-form" action="/app/provider/addEvent/upload" method="post" role="form" style="display: block;" enctype="multipart/form-data">
    <div class="input-group">
        <label  class="input-group-btn">
            <span style=" height: 45px; text-align: center; display:table-cell; vertical-align:middle;" class="btn btn-warning">
                Browse&hellip; <input type="file" name="images" accept=".jpg" style="display: none;" multiple>
            </span>
        </label>
        <input type="text" class="form-control" multiple>
    </div>
    <span class="help-block">
        Try selecting one or more files and watch the feedback
        Please submit .jpg images
    </span>
    <div class="form-group">
        <div id="button-row" class="row">
            <div class="">
                <button type="submit" name="register-submit" id="register-submit" class="form-control btn btn-register" <%=blocked%>>Ανέβασμα δραστηριότητας</button>
            </div>
        </div>
    </div>
</form>



<!-- -------------------------------------- PAGE FOOTER ----------------------------------------------- -->
<footer class="text-center">
    <a class="up-arrow" href="#myPage" data-toggle="tooltip" title="Μετάβαση στη κορυφή της σελίδας">
        <span class="glyphicon glyphicon-chevron-up"></span>
    </a><br><br>
    <p> Created and maintained by iplan <br>
        Copyright &copy usage under terms and conditions of texnologia logismikou 2017-2018</p>
</footer>



<!-- -------------------------------------- SCRIPTS ----------------------------------------------- -->
<script src = "../pages/scripts.js" type = "text/javascript"></script>
</body>

</html>