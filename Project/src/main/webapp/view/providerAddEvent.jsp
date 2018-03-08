<%@ page import="gr.ntua.ece.softeng17b.data.Provider" %>
<%@ page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String blocked;
    Provider prov = (Provider) session.getAttribute("provider");
    if(prov.getSubscription().getTime() < Calendar.getInstance().getTime().getTime()){
        blocked = "disabled";
    }
    else{
        blocked = "";
    }
%>

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
    <link rel="stylesheet" href="<c:url value='/pages/styles.css' />" type="text/css">
    <script src="https://cdn.jsdelivr.net/timepicker.js/latest/timepicker.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/timepicker.js/latest/timepicker.min.css"/>
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
                    <a href="/app/provider/">Ιστορικό</a>
                </li>
                <li>
                    <a href="/app/provider/">Αναφορά</a>
                </li>
                <li class="active">
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

<div  class="container" style="padding-bottom: 154px">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-register1">
                <div class="panel-heading">
                    <div class="row">
                        <p style="color: black;font-size: 18px;font-weight:bold;">Δημιουργία Νέας Δραστηριότητας</p>
                    </div>
                    <hr>
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-12">
                            <form id="register1-form" action="/app/provider/addEvent/addImages" method="post" role="form" style="display: block;" >
                                <span class="help-block" ${error}  >${error}</span>
                                <div class="form-group">
                                    <input placeholder="Ονομασία δραστηριότητας" type="text" class="form-control" name="title" value="" required="required">
                                </div>
                                <span id="helpdate" class="help-block"></span>
                                <div class="form-group">
                                    <input placeholder="Ημερομηνία" type="date" id="checkdate" min="" class="form-control" name="date" value="">
                                </div>
                                <div class="form-group">
                                    <input type="text" id="time" name="time" class="form-control" placeholder="Time">
                                </div>
                                <div class="form-group">
                                    <input placeholder="Διάρκεια Δραστηριότητας σε λεπτά" type="number" min="0" class="form-control" name="duration" value="" required="required">
                                </div>
                                <div class="form-group">
                                    <input id="autocomplete" onFocus="" placeholder="Τοποθεσία" type="text" class="form-control" name="" value="">
                                </div>
                                <span id="geowrong" style="color:red;" class="help-block"></span>
                                <div class="form-group">
                                    <input type="text" name="postal_code" id="postal_code" class="form-control" placeholder="Ταχυδρομικός Κωδικας" value="" required="required" >
                                </div>
                                <div class="form-group">
                                    <input type="text" name="city" id="locality" class="form-control" placeholder="Περιοχή" value="" required="required" >
                                </div>
                                <div class="form-group">
                                    <input type="text" name="address" id="route" class="form-control" placeholder="Oδός" value="" required="required" >
                                </div>
                                <div class="form-group">
                                    <input type="text" name="address_num" id="street_number" class="form-control" placeholder="Αριθμός Οδού" value="" required="required" >
                                </div>
                                <div class="form-group">
                                    <input type="hidden" name="lat" id="lat" class="form-control" placeholder="Γεωγραφικό πλάτος" value="" required="required" >
                                </div>
                                <div class="form-group">
                                    <input type="hidden" name="lng" id="lng" class="form-control" placeholder="Γεωγραφικό μήκος" value="" required="required" >
                                </div>
                                <div class="form-group">
                                    <input placeholder="Αριθμός Εισιτηρίων" type="number" min="0" class="form-control" name="tickets" value="" required="required">
                                </div>

                                <div class="form-group">
                                    <input placeholder="Τιμή" type="number" min="0"  class="form-control" name="price" value="" required="required">
                                </div>

                                <div class="form-group">
                                    <textarea name="description" style="resize:none; font-size: 16px;" rows="3" class="form-control" placeholder="Περιγραφή" required="required"></textarea>
                                </div>

                                <div style="margin-bottom: 15px;" class="row">

                                    <div class="form-group">
                                        <h style="margin-left: 20px;">Επιλογή Κατηγοριών:</h>
                                        <div class="items-collection">

                                            <div class="items col-xs-3 col-sm-3 col-md-3 col-lg-3">
                                                <div class="info-block block-info clearfix">
                                                    <div data-toggle="buttons" class="btn-group bizmoduleselect">
                                                        <label class="btn btn-default">
                                                            <div class="itemcontent">
                                                                <input type="checkbox" name="" id="sports-checkbox" value="">

                                                                <h5>Αθλητισμός</h5>
                                                            </div>
                                                        </label>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="items col-xs-3 col-sm-3 col-md-3 col-lg-3">
                                                <div class="info-block block-info clearfix">
                                                    <div data-toggle="buttons" class="btn-group itemcontent">
                                                        <label class="btn btn-default">
                                                            <div class="itemcontent">
                                                                <input type="checkbox" name="" id="theatre-checkbox" value="">

                                                                <h5>Θέατρο</h5>
                                                            </div>
                                                        </label>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="items col-xs-3 col-sm-3 col-md-3 col-lg-3">
                                                <div class="info-block block-info clearfix">
                                                    <div data-toggle="buttons" class="btn-group itemcontent">
                                                        <label class="btn btn-default">
                                                            <div class="itemcontent">
                                                                <input type="checkbox" name="" id="music-checkbox" value="">

                                                                <h5>Μουσική</h5>
                                                            </div>
                                                        </label>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="items col-xs-3 col-sm-3 col-md-3 col-lg-3">
                                                <div class="info-block block-info clearfix">
                                                    <div data-toggle="buttons" class="btn-group itemcontent">
                                                        <label class="btn btn-default">
                                                            <div class="itemcontent">
                                                                <input type="checkbox" name="" id="workshop-checkbox" value="">

                                                                <h5>Εργαστήρι</h5>
                                                            </div>
                                                        </label>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="items col-xs-3 col-sm-3 col-md-3 col-lg-3">
                                                <div class="info-block block-info clearfix">
                                                    <div data-toggle="buttons" class="btn-group itemcontent">
                                                        <label class="btn btn-default">
                                                            <div class="itemcontent">
                                                                <input type="checkbox" name="" id="other-checkbox" value="">

                                                                <h5>Άλλες</h5>
                                                            </div>
                                                        </label>
                                                    </div>
                                                </div>
                                            </div>


                                        </div>
                                    </div>


                                </div>
                                <input type="hidden" class="form-control" name="sports" id="sports" value="0">
                                <input type="hidden" class="form-control" name="music" id="music" value="0">
                                <input type="hidden" class="form-control" name="theatre" id="theatre" value="0">
                                <input type="hidden" class="form-control" name="workshop" id="workshop" value="0">
                                <input type="hidden" class="form-control" name="other" id="other" value="0">

                                <div class="form-group">
                                    <div id="button-row" class="row">
                                        <div class="">
                                            <button type="submit" name="register1-submit" id="register1-submit" class="form-control btn btn-register" <%=blocked%>>Ανέβασμα δραστηριότητας</button>
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

<!-- -------------------------------------- SCRIPTS ----------------------------------------------- -->
<script src = "<c:url value='/pages/scripts.js' />" type = "text/javascript"></script>
<script src ="<c:url value='/pages/registerevent.js' />" type = "text/javascript"></script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCIiqpp38PgqgG9teEQZToa_PCO2M7kGzc&language=el&libraries=places&callback=initAutocomplete" async defer></script>
<link type="text/css" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500">

</body>

</html>
