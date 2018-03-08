<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<%@ page import="gr.ntua.ece.softeng17b.data.Client" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<% if (session.getAttribute("client") == null){
    session.setAttribute("notloggedIn","list-item");
    session.setAttribute("loggedIn","none");
}
else{
    session.setAttribute("loggedIn","list-item");
    session.setAttribute("notloggedIn","none");
}%>

<!DOCTYPE html>
<html lang="el">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="<c:url value='/images/iplan.png' />" sizes="32x32">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/octicons/4.4.0/font/octicons.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="pages/styles.css" type="text/css">
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
            <a class="navbar-left" href="/app/">
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
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Δραστηριότητες
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Κατηγορία 1</a></li>
                        <li><a href="#">Κατηγορία 2</a></li>
                        <li><a href="#">Κατηγορία 3</a></li>
                    </ul>
                </li>
            </ul>
            <!-- Right part of Navbar -->
            <ul id="logregprof" class="nav navbar-nav navbar-right">
                <li class="notlogged" style="display:${notloggedIn}" ><a href="register.jsp"><span class="glyphicon glyphicon-user"></span> Εγγραφή </a></li>
                <li class="notlogged" style="display:${notloggedIn}"><a href="#" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-log-in"></span> Σύνδεση </a></li>
                <li class="dropdown"><a id="logged1" style="display:${loggedIn}" href="#"><span class="glyphicon glyphicon-piggy-bank"></span> Πορτοφόλι (<% if (session.getAttribute("client") == null){ %>%WALLET_POINTS%<%} else {%> <%=String.format("%.2f",((Client) session.getAttribute("client")).getWallet())%> <% }%>)</a></li>

                <li class="dropdown">
                    <a id="logged2" class="dropdown-toggle" style="display:${loggedIn}" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span><% if (session.getAttribute("client") == null){ %> %USERNAME% <%} else { %> ${client.getUsername()} <% }%><span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a id="profile" href="/app/myProfile"><span class="glyphicon glyphicon-file"></span>Τα στοιχεία μου</a></li>
                        <li><a id="wallet" href="/app/buyPoints"><span class="glyphicon glyphicon-piggy-bank"></span>Αγορά πόντων</a></li>
                        <li ><a  href="/app/logoutStrong"><span id="logout" class="glyphicon glyphicon-log-out"></span>Αποσύνδεση</a></li>
                    </ul>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <div class="search-form">
                    <form class="navbar-form" action="/app/events" method="get" role="search">
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="Search" name="searchtext" id="srch-term" value="">
                            <div class="input-group-btn">
                                <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                            </div>
                        </div>
                    </form>
                </div>
            </ul>
        </div>
    </div>
</nav>

<!-- -------------------------------------- NAVIGATION BAR ----------------------------------------------- -->
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-register1">
                <div class="panel-heading">
                    <div class="row">
                        <p style="color: black;font-size: 18px;font-weight:bold;">Σύστημα ΖΙΑΣ</p>
                    </div>
                    <hr>
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-12">
                            <form id="points-form" class="form-horizontal" action="/app/buyPoints/buy" method="post" role="form" style="display: block;">
                                <div class="form-group">
                                    <div class="col-sm-3">
                                        <label for="amount">ΠΟΣΟ</label>
                                    </div>
                                    <div class="col-sm-9">
                                        <input type="number" step="1" name="money" id="amount" tabindex="1" class="form-control" placeholder="" value="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-3">
                                        <label for="amount">ΕΠΙΛΟΓΗ</label>
                                    </div>
                                    <div class="col-sm-9">
                                        <select id="card" class="form-control" name="card">
                                            <option value="visa">VISA</option>
                                            <option value="mastercard">MASTERCARD</option>
                                            <option value="american">AMERICAN EXPRESS</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-12">
                                        <label for="card_num">ΑΡΙΘΜΟΣ ΚΑΡΤΑΣ</label>
                                    </div>
                                    <div class="col-sm-12">
                                        <input type="text" name="card_num" id="card_num" tabindex="1" class="form-control" placeholder="" value="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div id="button-row" class="row">
                                        <div class="">
                                            <button type="submit" name="points-submit" id="points-submit" class="form-control btn btn-register1">ΑΓΟΡΑ</button>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- -------------------------------------- PAGE FOOTER ----------------------------------------------- -->
<footer class="text-center">
    <a class="up-arrow" href="#myPage" data-toggle="tooltip" title="Μετάβαση στη κορυφή της σελίδας">
        <span class="glyphicon glyphicon-chevron-up"></span>
    </a><br><br>
    <p> Created and maintained by iplan <br>
        Copyright &copy usage under terms and conditions of texnologia logismikou 2017-2018</p>
</footer>

<!-- -------------------------------------- BOOTSTRAP MODALS ----------------------------------------------- -->
<div class="modal" id="myModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <!-- Modal Header -->
            <div class="modal-header ">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="text-center modal-title">Συνδεθείτε</h4>
            </div>

            <!-- Modal body -->
            <form action="/app/login" method="POST">
                <!-- Modal body -->
                <div class="modal-body">

                    <div>Email</div>
                    <input type="text" class="form-control" name="username">
                    <div>Κωδικός</div>
                    <input type="text" class="form-control" name="password">
                </div>
                <!-- Modal footer -->
                <div class="modal-footer">
                    <div class="text-center">
                        <input type="submit" class="btn btn-success" value="Συνδεση">
                    </div>
                </div>
            </form>
            <div class="form-group">
                <div class="row">
                    <div class="text-center">
                        <a href="https://phpoll.com/recover" tabindex="5" class="forgot-password">Ξέχασες τον κωδικό?</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src = "pages/scripts.js" type = "text/javascript"></script>
</body>
</html>
