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

<!-- -------------------------------------- CAROUSEL ----------------------------------------------- -->
<div class="carouselContainer">
    <div id="myCarousel" class="adam carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner">

            <div class="item active">
                <img src="<c:url value='/images/kids_cooking.jpg'/>" alt="Image1" style="width:100%;">
                <div class="carousel-caption">
                    <h3>asdfsd</h3>
                    <p>adsasdfasdf</p>
                </div>
            </div>
            <div class="item">
                <img src="<c:url value='/images/painting.jpg'/>" alt="Image2" style="width:100%;">
                <div class="carousel-caption">
                    <h3>sdfasdf</h3>
                    <p>asdfasdf</p>
                </div>
            </div>
            <div class="item">
                <img src="<c:url value='/images/swimming.jpg'/>" alt="Image3" style="width:100%;">
                <div class="carousel-caption">
                    <h3>asdfsd</h3>
                    <p>adsasdfasdf</p>
                </div>
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

<!-- -------------------------------------- MAIN PAGE ----------------------------------------------- -->

<div class = "row mainBody">

    <!-- Η εταιρεία -->

    <div align="center" class="col-sm-3">
        <div class="panel ourCompany">
            <h2 align="center">H εταιρεία</h2>
            <div class="panel-thumbnail"><img src="<c:url value='/images/ourCompany_image.jpg'/>" class="img-responsive img-rounded"></div>
            <div class="panel-body">
                <p>asdsdsa s d as d  asd  asdasda sd a sdasdasdas da sd a sd asd
                    adsasdas ddasd as d as da sd asd as dasdasd a dsads  as da sddas
                    as dasda sdda ds d ass d a sd a sd asdasd  dsa d as dsa sdasd asd
                    asdasdadsd dasdasd asd d adsdsdas dd sd s da ds asdasd ds ads asd
                </p>
            </div>
        </div>
    </div>

    <!-- Ανακοινώσεις -->

    <div align="center "class="col-sm-6">
        <h2 align="center" class="newsHeader">Ανακοινώσεις</h2>
        <div class="panel news">


            <div class="panel-body latestNode">
                <div class="latestVd">
                    <img src="<c:url value='/images/announcement_image.png'/>" class="img-responsive"><div class="latestOverlay"></div>
                </div>
                <div class="latestTxt">
                    <div>Ανακοίνωση !!!!!!!!!!!!!!!!!</div>
                </div>
                <div class="date">
                    28/1/2018
                </div>
            </div>

            <div class="panel-body latestNode">
                <div class="latestVd">
                    <img src="<c:url value='/images/announcement_image.png'/>" class="img-responsive"><div class="latestOverlay"></div>
                </div>
                <div class="latestTxt">
                    <div>Ανακοίνωση !!!!!!!!!!!!!!!!!</div>
                </div>
                <div class="date">
                    28/1/2018
                </div>
            </div>

            <div class="panel-body latestNode">
                <div class="latestVd">
                    <img src="<c:url value='/images/announcement_image.png'/>" class="img-responsive"><div class="latestOverlay"></div>
                </div>
                <div class="latestTxt">
                    <div>Ανακοίνωση !!!!!!!!!!!!!!!!!</div>
                </div>
                <div class="date">
                    28/1/2018
                </div>
            </div>

            <div class="panel-body latestNode">
                <div class="latestVd">
                    <img src="<c:url value='/images/announcement_image.png'/>" class="img-responsive"><div class="latestOverlay"></div>
                </div>
                <div class="latestTxt">
                    <div>Ανακοίνωση !!!!!!!!!!!!!!!!!</div>
                </div>
                <div class="date">
                    28/1/2018
                </div>
            </div>

            <div class="panel-body latestNode">
                <div class="latestVd">
                    <img src="<c:url value='/images/announcement_image.png'/>" class="img-responsive"><div class="latestOverlay"></div>
                </div>
                <div class="latestTxt">
                    <div>Ανακοίνωση !!!!!!!!!!!!!!!!!</div>
                </div>
                <div class="date">
                    28/1/2018
                </div>
            </div>

        </div>
    </div>

    <!-- Η εφαρμογή μας -->

    <div class="col-sm-3">
        <div class="panel panel-default ourWebApp">
            <h2 align="center">H εφαρμογή</h2>
            <div class="panel-thumbnail"><img src="<c:url value='/images/ourWebApp_image.jpg'/>" class="img-responsive img-rounded"></div>
            <div class="panel-body">
                <p>asdsdsa s d as d  asd  asdasda sd a sdasdasdas da sd a sd asd
                    adsasdas ddasd as d as da sd asd as dasdasd a dsads  as da sddas
                    as dasda sdda ds d ass d a sd a sd asdasd  dsa d as dsa sdasd asd
                    asdasdadsd dasdasd asd d adsdsdas dd sd s da ds asdasd ds ads asd
                </p>
            </div>
        </div>
    </div>

</div>

<!-- -------------------------------------- CONTACT FORM ----------------------------------------------- -->
<div class="container contactForm">
    <h3 class="text-center">Επικοινωνία</h3>
    <p class="text-center"><em>Στείλτε μας ένα email</em></p>
    <div class="row test">
        <div class="col-md-4">
            <p>Στοιχεία Επικοινωνίας</p>
            <p><span class="glyphicon glyphicon-map-marker"></span>Ζωγράφου, GR</p>
            <p><span class="glyphicon glyphicon-phone"></span>Τηλέφωνο: +30 210 7777777</p>
            <p><span class="glyphicon glyphicon-envelope"></span>Email: iplan@mail.com</p>
        </div>
        <div class="col-md-8">
            <div class="row">
                <div class="col-sm-6 form-group">
                    <input class="form-control" id="name" name="name" placeholder="Όνομα" type="text" required>
                </div>
                <div class="col-sm-6 form-group">
                    <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
                </div>
            </div>
            <textarea class="form-control" id="comments" name="comments" placeholder="Σχόλιο" rows="5"></textarea>
            <div class="row sendButtonRow">
                <div class= "form-group">
                    <button class="btn submitButton pull-right" type="submit">Αποστολή</button>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- -------------------------------------- GOOGLE MAP ----------------------------------------------- -->
<div id="googleMap"></div>
<script>
    function myMap() {
        var myCenter = new google.maps.LatLng(37.9792194, 23.783086499999968);
        var mapProp = {center:myCenter, zoom:16, scrollwheel:false, draggable:false, mapTypeId:google.maps.MapTypeId.ROADMAP};
        var map = new google.maps.Map(document.getElementById("googleMap"),mapProp);
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

<!-- -------------------------------------- BOOTSTRAP MODALS ----------------------------------------------- -->
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

<!-- -------------------------------------- SCRIPTS ----------------------------------------------- -->
<script src = "pages/scripts.js" type = "text/javascript"></script>
</body>

</html>
