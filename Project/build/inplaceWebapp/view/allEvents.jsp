<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="gr.ntua.ece.softeng17b.data.Client" %>
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
    <title>Iplan4kids</title>
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
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.0/jquery-ui.min.js"></script>
    <link rel="stylesheet prefetch" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <style class="cp-pen-styles"></style>
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
                <li>
                    <a href="/app/events"> Δραστηριότητες </a>
                </li>
            </ul>
            <!-- Right part of Navbar -->
            <ul id="logregprof" class="nav navbar-nav navbar-right">
                <li class="notlogged" style="display:${notloggedIn}" ><a href="/app/register"><span class="glyphicon glyphicon-user"></span> Εγγραφή </a></li>
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


     <!-- -------------------------------------- MAIN PAGE ----------------------------------------------- -->

    <div class = "row mainBody">

        <div class="col-sm-3"> 
            <h2 align="center" class="newsHeader">Φίλτρα Αναζήτησης</h2>                            
            <div class="panel filters">


                <div style="margin: 10px;" class="row filterContainer" >

                    <label>Επιλογή Κατηγορίας:</label>
                    <div class="checkbox" >
                        <label><input id="category1" type="checkbox" value="1">Αθλητισμός</label>
                    </div>
                    <div class="checkbox">
                        <label><input id="category2" type="checkbox" value="2">Θέατρο</label>
                    </div>
                    <div class="checkbox">
                        <label><input id="category3" type="checkbox" value="3">Μουσική</label>
                    </div>
                    <div class="checkbox">
                        <label><input id="category4" type="checkbox" value="4">Βιβλίο</label>
                    </div>
                    <div class="checkbox">
                        <label><input id="category5" type="checkbox" value="5">Άλλες Δραστηριότηες</label>
                    </div>

                        <label style="display: inline;"  for="amount">
                            <input type="text" id="amount" readonly="" style=" margin-bottom:15px; border:0; color:#222; font-weight:bold;">
                        </label>


                    <div style="margin-bottom: 10px;" class="filters-container" id="slider-range" ></div>
                    <label>Επιλογή Ημερομηνιας:</label>
                    <input style="margin-left: 5px; margin-bottom:10px; margin-top:10px;"  placeholder="Ημερομηνία" type="date" id="filterdate" min="" class="form-control " name="date" value="">
                    <label>Επιλογή Τοποθεσίας:</label>
                    <div class="radio">
                        <label><input id="myLocation" type="radio" name="optradio">Το σπίτι μου</label>
                    </div>
                    <div class="radio">
                        <label><input id="currentLocation" type="radio" name="optradio">Εδώ που είμαι αυτή την στιγμή</label>
                    </div>

                    <button class="btn submitButton" onclick="applyFilters()">Εφαρμογή Φίλτρων</button>
                </div>


            </div>
        </div>
        <div class="col-sm-9">
            <h2 align="center" class="newsHeader">Δραστηριότητες</h2>

            <div class="panel activities" style="padding-bottom:154px ">
            
            <!-- 1o Event -->
                <div class="row" id="allEvents">

                    

                </div>
            </div>
            <!-- ----------------------------------- PAGIFICATION ------------------------------------- -->
            <div class="row pager">
                <ul class="pagination">
                    <li><a href="#">&laquo;</a></li>
                    <li><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li><a href="#">&raquo;</a></li>
                </ul>
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

    <!-- -------------------------------------- SCRIPTS ----------------------------------------------- -->
    <script src = "pages/scripts.js" type = "text/javascript"></script>
    <script src = "pages/allEvents.js" type = "text/javascript"></script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBMp5eP199GDotlWhbsMppKyTSVKQJlS4o&language=el&libraries=places" async defer></script>
    </body>

</html>