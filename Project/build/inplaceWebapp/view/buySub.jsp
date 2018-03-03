<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


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
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span> Όνομα Παρόχου
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#"><span class="octicon octicon-file"></span>Τα στοιχεία μου</a></li>

                    </ul>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <div class="search-form">
                    <form class="navbar-form" role="search">
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="Search" name="srch-term" id="srch-term">
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
                            <form id="renew-form" class="form-horizontal" action="/app/provider/renew" method="post" role="form" style="display: block;">
                                <div class="form-group">
                                    <div class="col-sm-3">
                                        <label for="amount">ΣΥΝΔΡΟΜΗ</label>
                                    </div>
                                    <div class="col-sm-9">
                                        <select id="amount" class="form-control" name="amount">
                                            <option value="1">1 Μήνας</option>
                                            <option value="2">2 Μήνες</option>
                                            <option value="3">3 Μήνες</option>
                                            <option value="6">6 Μήνες</option>
                                            <option value="12">12 Μήνες</option>
                                        </select>
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
                                            <button type="submit" name="register1-submit" id="renew-submit" class="form-control btn btn-register1">ΑΓΟΡΑ</button>
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

<script src = "../pages/scripts.js" type = "text/javascript"></script>
</body>
</html>
