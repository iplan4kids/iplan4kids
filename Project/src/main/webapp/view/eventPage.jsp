<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="gr.ntua.ece.softeng17b.data.Provider" %>
<%@page import="gr.ntua.ece.softeng17b.data.Event" %>
<%@ page import="gr.ntua.ece.softeng17b.data.Client" %>
<%@ page import="gr.ntua.ece.softeng17b.data.DataAccess" %>
<%@ page import="gr.ntua.ece.softeng17b.conf.Configuration" %>
<%@ page import="java.util.Optional" %>
<% if (session.getAttribute("client") == null){
    session.setAttribute("notloggedIn","list-item");
    session.setAttribute("loggedIn","none");
}
else{
    session.setAttribute("loggedIn","list-item");
    session.setAttribute("notloggedIn","none");
}%>


<%
    Event ev = null;
    System.out.println(session.getAttribute("event"));
    if (session.getAttribute("event") == null){

    }
    else {
        ev = (Event) session.getAttribute(("event"));
    }
    double lng = ev.getPlace().getLongitude();
    double lat = ev.getPlace().getLatitude();

%>


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
    <link rel="stylesheet" href="<c:url value='/pages/styles.css' />" type="text/css">
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

     <!-- -------------------------------------- MAIN PAGE ----------------------------------------------- -->

    <div class = "row mainBody">



        <div class="col-sm-3">
            <div class="panel eventProfileBox">

                <div class="panel-thumbnail">
                    <p id="profileHeafer" style="text-align: center; font-size: 5vh;  font-weight: bold;">${event.getTitle()}</p>
                    <div class="carouselContainer">
                        <div style="border-radius: 6px; overflow: hidden;" id="myCarousel" class="carousel slide" data-ride="carousel">
                            <!-- Indicators -->
                            <ol class="carousel-indicators">
                                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                                <li data-target="#myCarousel" data-slide-to="1"></li>
                                <li data-target="#myCarousel" data-slide-to="2"></li>
                            </ol>

                            <!-- Wrapper for slides -->
                            <div class="carousel-inner">

                                <div class="item active">
                                    <img src="../images/federer.jpg" alt="Image1" style="width:100%;">

                                </div>
                                <div class="item">
                                    <img src="../images/federer.jpg" alt="Image2" style="width:100%;">

                                </div>
                                <div class="item">
                                    <img src="../images/federer.jpg" alt="Image3" style="width:100%;">

                                </div>

                            </div>

                            <!-- Left and right controls -->
                            <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                                <span class="glyphicon glyphicon-chevron-left"></span>
                                <span class="sr-only">Previous</span>
                            </a>
                            <a class="right carousel-control" href="#myCarousel" data-slide="next">
                                <span class="glyphicon glyphicon-chevron-right"></span>
                                <span class="sr-only">Next</span>
                            </a>
                        </div>
                    </div>
                </div>
                <div class="panel-body">
                   <p>Στοιχεία Επικοινωνίας</p>
<%--
					<p><span class="glyphicon glyphicon-map-marker"></span>Mallorca, ES</p>
--%>
					<p><span class="glyphicon glyphicon-phone"></span>Τηλέφωνο: ${prov.getPhone()}</p>
					<p><span class="glyphicon glyphicon-envelope"></span>Email: ${prov.getEmail()}</p>
                </div>
            </div>
        </div>



        <div class="col-sm-9"> 
                <h2 align="center"><strong>${event.getTitle()}</strong></h2>
				<h4 align="left"><b>Πλήρης Περιγραφή:</b></h4>
				<p> ${event.getDescription()}
					</p>
				<div align="right" >
                    <strong>Τιμή:${event.getPrice()} πόντοι</strong>
				<button  class="btn btn-success" href="#" data-toggle="modal" data-target="#buyModal"><span class="glyphicon glyphicon-euro"></span> Αγορά </button>
				</div>
				<br>
				<hr style="height:1px;border:none;color:#333;background-color:#333;" />
				<div style="margin-bottom: 40px; padding-bottom: 40px; position:relative;" id="googleMap_event"></div>
        </div>




                
    </div>
		

    <!-- -------------------------------------- GOOGLE MAP ----------------------------------------------- -->
  <!-- <div id="googleMap"></div>  -->
    <script>
    function myMap() {
        var myCenter = new google.maps.LatLng(<%=lat%>, <%=lng%>);
    var mapProp = {center:myCenter, zoom:16, scrollwheel:false, draggable:false, mapTypeId:google.maps.MapTypeId.ROADMAP};
    var map = new google.maps.Map(document.getElementById("googleMap_event"),mapProp);
    var marker = new google.maps.Marker({position:myCenter});
    marker.setMap(map);
    }
    </script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVCx5csUzQV85Fz9f2LscVZQRckJvhLb8&callback=myMap"></script>
    <!-- -------------------------------------- PAGE FOOTER ----------------------------------------------- --> 
    <footer class="text-center">
        <a class="up-arrow" href="#myPage" data-toggle="tooltip" title="Μετάβαση στη κορυφή της σελίδας">
                <span class="glyphicon glyphicon-chevron-up"></span>
            </a><br><br>
            <p> Created and maintained by iplan <br>
                Copyright &copy usage under terms and conditions of texnologia logismikou 2017-2018</p> 
    </footer>

    <div style="align:center;" class="modal" id="myModal">
        <div style="width:500px; margin:auto; " class="panel panel-register1">
            <div class="panel-heading">
                <div class="row">
                    <button style="margin-right:10px;" type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 style="margin-left: 18px;" class="text-center modal-title"> Συνδεθείτε</h4>
                    <br>
                    <div class="col-xs-4">
                        <a href="#" class="active" id="login1-form-link">Χρήστης</a>
                    </div>
                    <div class="col-xs-4">
                        <a href="#" id="login2-form-link">Διαχειριστής</a>
                    </div>
                    <div class="col-xs-4">
                        <a href="#" id="login-form-link">Πάροχος</a>
                    </div>
                </div>
                <hr>
            </div>
            <div class="panel-body">
                <div class="row">
                    <div class="col-lg-12">

                        <!----------------------------------------------------------- CLIENT LOGIN ------------------------------------------------------------------------>

                        <form id="login1-form" action="/app/loginClient" method="post" role="form" style="display: block;">
                            <div class="form-group">
                                <input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Όνομα χρήστη" value="" style="" required="required">
                            </div>
                            <div class="form-group">
                                <input type="password" name="password" id="password" tabindex="1" class="form-control" placeholder="Κωδικός" value="" style="" required="required">
                            </div>
                            <span id="clientwrong" style="display:none; color:red;" class="help-block">*Μη έγκυρος συνδυασμός όνοματος χρήστη και συνθηματικού.</span>
                            <div class="form-group">
                                <div id="button-row" class="row">
                                    <div class="">
                                        <button type="submit" name="register1-submit" id="register1-submit" class="form-control btn btn-register1">ΣΥΝΔΕΣΗ</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                        <!----------------------------------------------------------- ADMIN LOGIN ------------------------------------------------------------------------>

                        <form id="login2-form" action="/app/login/admin" method="post" role="form" style="display: none;">
                            <div class="form-group">
                                <input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Όνομα διαχειριστή" value="" style="" required="required">
                            </div>
                            <div class="form-group">
                                <input type="password" name="password" id="password" tabindex="1" class="form-control" placeholder="Κωδικός" value="" style="" required="required">
                            </div>
                            <span id="adminwrong" style="display:none; color:red;" class="help-block">*Μη έγκυρος συνδυασμός όνοματος διαχειριστή και συνθηματικού.</span>
                            <div class="form-group">
                                <div id="button-row" class="row">
                                    <div class="">
                                        <button type="submit" name="register1-submit" id="register1-submit" class="form-control btn btn-register1">ΣΥΝΔΕΣΗ</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                        <!----------------------------------------------------------- PROVIDER LOGIN ------------------------------------------------------------------------>

                        <form id="login-form" action="/app/login/provider" method="post" role="form" style="display: none;">
                            <div class="form-group">
                                <input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Όνομα παρόχου" value="" style="" required="required">
                            </div>
                            <div class="form-group">
                                <input type="password" name="password"  id="password" tabindex="1" class="form-control" placeholder="Κωδικός" value="" style="" required="required">
                            </div>
                            <span id="providerwrong" style="display:none; color:red;" class="help-block">*Μη έγκυρος συνδυασμός όνοματος παρόχου και συνθηματικού.</span>
                            <div class="form-group">
                                <div id="button-row" class="row">
                                    <div class="">
                                        <button type="submit" name="register-submit" id="register-submit" class="form-control btn btn-register">ΣΥΝΔΕΣΗ</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>


    </div>




    <!-- -------------------------------------- BUY MODAL ----------------------------------------------- -->



    <div style="overflow: hidden;" class="modal" id="buyModal">
        <div class="modal-dialog">
            <div class="modal-content">
                <!-- Modal Header -->
                <div class="modal-header ">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="text-center modal-title">Αγορά Εισιτηρίων</h4>
                </div>
                <!-- Modal body -->
                <div class="modal-body">
                    <div id="icantBuy" style="display: none;" >
                        <h4 style="margin-bottom: 10px;" class="text-center modal-title">Δεν είστε συνδεδεμένος,συνδεθείτε ή κάντε εγγραφή:</h4>
                        <div class="row">
                            <div style="text-align: center;" class="col-lg-12">
                                <button onclick="location.href='/app/register';" style="text-align: center; display:table-cell; vertical-align:middle;" class="btn btn-sq-lg btn-success">
                                    <span style="margin-top: 10px;"class="glyphicon glyphicon-user gi-5x"></span><br/>
                                    <h2 style="margin-top: 5px;"> Eγγραφή</h2> <br>
                                </button>
                                <button style="text-align: center; display:table-cell; vertical-align:middle;" data-dismiss="modal" data-toggle="modal" data-target="#myModal"  class="btn btn-sq-lg btn-primary">
                                <span  style="margin-top: 10px;" class="glyphicon glyphicon-log-in gi-5x"></span><br/>
                                <h2 style="margin-top: 5px;"> Σύνδεση</h2> <br>
                                </button>
                            </div>
                        </div>
                    </div>
                    <div id="icanBuy" style="display: inline;">
                        <form id="buy-form" action="/app/login/provider" method="post" role="form">
                            <span class="help-block">Αριθμός εισιτηρίων</span>
                            <div class="form-group">
                                <input type="number" name="ticketsnumber" min="1" id="username" tabindex="1" class="form-control" placeholder="Αριθμός Εισιτηρίων" value="" style="" required="required">
                            </div>
                            <div class="form-group">
                                <label style="padding-left: 0px;" class="col-xs-3 control-label">Όροι συναλλαγής:</label>
                                <div class="col-xs-9">
                                    <div style="border: 1px solid #e5e5e5; height: 200px; overflow: auto; padding: 10px; border-radius: 4px;">
                                        <p>Lorem ipsum dolor sit amet, veniam numquam has te. No suas nonumes recusabo mea, est ut graeci definitiones. His ne melius vituperata scriptorem, cum paulo copiosae conclusionemque at. Facer inermis ius in, ad brute nominati referrentur vis. Dicat erant sit ex. Phaedrum imperdiet scribentur vix no, ad latine similique forensibus vel.</p>
                                        <p>Dolore populo vivendum vis eu, mei quaestio liberavisse ex. Electram necessitatibus ut vel, quo at probatus oportere, molestie conclusionemque pri cu. Brute augue tincidunt vim id, ne munere fierent rationibus mei. Ut pro volutpat praesent qualisque, an iisque scripta intellegebat eam.</p>
                                        <p>Mea ea nonumy labores lobortis, duo quaestio antiopam inimicus et. Ea natum solet iisque quo, prodesset mnesarchum ne vim. Sonet detraxit temporibus no has. Omnium blandit in vim, mea at omnium oblique.</p>
                                        <p>Eum ea quidam oportere imperdiet, facer oportere vituperatoribus eu vix, mea ei iisque legendos hendrerit. Blandit comprehensam eu his, ad eros veniam ridens eum. Id odio lobortis elaboraret pro. Vix te fabulas partiendo.</p>
                                        <p>Natum oportere et qui, vis graeco tincidunt instructior an, autem elitr noster per et. Mea eu mundi qualisque. Quo nemore nusquam vituperata et, mea ut abhorreant deseruisse, cu nostrud postulant dissentias qui. Postea tincidunt vel eu.</p>
                                        <p>Ad eos alia inermis nominavi, eum nibh docendi definitionem no. Ius eu stet mucius nonumes, no mea facilis philosophia necessitatibus. Te eam vidit iisque legendos, vero meliore deserunt ius ea. An qui inimicus inciderint.</p>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-xs-6 col-xs-offset-3">
                                    <div class="checkbox">
                                        <label>
                                            <input type="checkbox" name="agree" value="agree" /> Αποδέχομαι τους όρους
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div id="button-row" class="row">
                                    <div class="">
                                        <button type="submit" name="register-submit" id="register-submit" class="form-control btn btn-warning">Αγορά</button>
                                    </div>
                                </div>
                            </div>
                        </form>

                    </div>

                </div>
            </div>
        </div>
    </div>

    <!-- -------------------------------------- SCRIPTS ----------------------------------------------- -->
<script src = "<c:url value='/pages/scripts.js' />" type = "text/javascript"></script>
    </body>

</html>