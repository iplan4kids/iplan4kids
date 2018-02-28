<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="el">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
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
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="/app/register"><span class="glyphicon glyphicon-user"></span> Εγγραφή </a></li>
                    <li><a href="#" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-log-in"></span> Σύνδεση </a></li>
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

    <div  class="container" style="padding-bottom: 154px">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-register1">
					<div class="panel-heading">
						<div class="row">
							<p style="color: black;font-size: 18px;font-weight:bold;">Φόρμα Εγγραφής</p>
							<div class="col-xs-6">
								<a href="#" class="active" id="register1-form-link">Χρήστης</a>
							</div>
							<div class="col-xs-6">
								<a href="#" id="register-form-link">Πάροχος</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="register1-form" action="/app/registerClient" method="post" role="form" style="display: block;">
									<div class="form-group">
										<input type="text" name="first_name" id="first_name" tabindex="1" class="form-control" placeholder="Όνομα" value="" required="required">
									</div>
									<div class="form-group">
										<input type="text" name="last_name" id="last_name" tabindex="1" class="form-control" placeholder="Επώνυμο" value="" required="required">
									</div>
									<div class="form-group">
										<input type="tel" pattern="^\d{10}$" name="m_phone" id="m_phone" tabindex="1" class="form-control" placeholder="Τηλέφωνο" value="" required="required">
									</div>
									<div class="form-group">
										<input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="Email" value="" required="required">
									</div>
									<div class="form-group">
										<input id="autocomplete" placeholder="Τοποθεσία" type="text" class="form-control" name="" value="">
									</div>
									<span id="geowrong" style="color:red;" class="help-block"></span>
									<div class="form-group">
										<input type="text" name="postal_code" id="postal_code" class="form-control" placeholder="Ταχυδρομικός Κωδικας" value="" required="required" disabled>
									</div>
									<div class="form-group">
										<input type="text" name="city" id="locality" class="form-control" placeholder="Περιοχή" value="" required="required" disabled>
									</div>
									<div class="form-group">
										<input type="text" name="address" id="route" class="form-control" placeholder="Oδός" value="" required="required" disabled>
									</div>
									<div class="form-group">
										<input type="text" name="address_num" id="street_number" class="form-control" placeholder="Αριθμός Οδού" value="" required="required" disabled>
									</div>
									<div class="form-group">
										<input type="text" name="lat" id="lat" class="form-control" placeholder="Γεωγραφικό πλάτος" value="" required="required" disabled>
									</div>
									<div class="form-group">
										<input type="text" name="lng" id="lng" class="form-control" placeholder="Γεωγραφικό μήκος" value="" required="required" disabled>
									</div>
									<div class="form-group">
										<input type="text" name="username" pattern="[a-zA-Z0-9]+" id="username" tabindex="1" class="form-control" placeholder="Username" value="" required="required">
									</div>
									<div class="form-group">
										<input type="password" name="password" onkeyup='check();' id="password" tabindex="1" class="form-control" placeholder="Κωδικός" value="" style="" required="required">
									</div>
									<div class="form-group">
										<input type="password" name="confirm_password" onkeyup='check();' id="confirm_password" tabindex="1" class="form-control" placeholder="Επιβεβαίωση Κωδικού" value="" style="" required="required">
									</div>
									<div class="form-group">
										<div id="button-row" class="row">
											<div class="">
												<button type="submit" name="register1-submit" id="register1-submit" class="form-control btn btn-register1">ΕΓΓΡΑΦΗ</button>
											</div>
										</div>
									</div>
								</form>
								<form id="register-form" action="/app/registerProvider" method="post" role="form" style="display: none;">
									<div class="form-group">
										<input type="text" name="company_name" id="company_name" tabindex="1" class="form-control" placeholder="Επωνυμία Επιχείρησης" value="">
									</div>
										<div class="form-group">
										<input type="text" name="first_name" id="first_name" tabindex="1" class="form-control" placeholder="Όνομα Yπεύθυνου" value="">
									</div>
									<div class="form-group">
										<input type="text" name="last_name" id="last_name" tabindex="1" class="form-control" placeholder="Επώνυμο Υπεύθυνου" value="">
									</div>
									<div class="form-group">
										<input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="Email" value="" required="required">
									</div>
									<div class="form-group">
										<input type="tel" pattern="^\d{10}$" name="tel" id="tel" tabindex="1" class="form-control" placeholder="Τηλέφωνο" value="" required="required">
									</div>
									<div class="form-group">
										<input type="tel" pattern="^\d{10}$" name="m_phone" id="m_phone" tabindex="1" class="form-control" placeholder="Κινητό Τηλέφωνο" value="" required="required">
									</div>
									<div class="form-group">
										<input type="text" pattern="^\d{9}$" name="afm" id="afm" tabindex="1" class="form-control" placeholder="Α.Φ.Μ" value="" required="required">
									</div>
									<div class="form-group">
										<input type="text" name="iban" id="iban" tabindex="1" class="form-control" placeholder="ΙΒΑΝ" value="" required="required">
									</div>
									<div class="form-group"><div class="form-group">
										<input id="autocomplete2" placeholder="Τοποθεσία" type="text" class="form-control" name="" value="">
									</div>
										<span id="geowrong2" style="color:red;" class="help-block"></span>
										<div class="form-group">
											<input type="text" name="postal_code" id="postal_code" class="form-control" placeholder="Ταχυδρομικός Κωδικας" value="" required="required" disabled>
										</div>
										<div class="form-group">
											<input type="text" name="city" id="locality" class="form-control" placeholder="Περιοχή" value="" required="required" disabled>
										</div>
										<div class="form-group">
											<input type="text" name="address" id="route" class="form-control" placeholder="Oδός" value="" required="required" disabled>
										</div>
										<div class="form-group">
											<input type="text" name="address_num" id="street_number" class="form-control" placeholder="Αριθμός Οδού" value="" required="required" disabled>
										</div>
										<div class="form-group">
											<input type="text" name="lat" id="lat" class="form-control" placeholder="Γεωγραφικό πλάτος" value="" required="required" disabled>
										</div>
										<div class="form-group">
											<input type="text" name="lng" id="lng" class="form-control" placeholder="Γεωγραφικό μήκος" value="" required="required" disabled>
										</div>
									<div class="form-group">
										<input type="text" name="username" pattern="[a-zA-Z0-9]+" id="username" tabindex="1" class="form-control" placeholder="Username" value="" required="required">
									</div>
									<div class="form-group">
										<input type="password" name="password1" onkeyup='check1();' id="password1" tabindex="1" class="form-control" placeholder="Κωδικός" value="" style="" required="required">
									</div>
									<div class="form-group">
										<input type="password" name="confirm_password1" onkeyup='check1();' id="confirm_password1" tabindex="1" class="form-control" placeholder="Επιβεβαίωση Κωδικού" value="" style="" required="required">
									</div>
									<div class="form-group">
										<div id="button-row" class="row">
											<div class="">
												<button type="submit" name="register-submit" id="register-submit" class="form-control btn btn-register">ΕΓΓΡΑΦΗ</button>
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
                                    <div class="form-group">
                                        <div id="button-row" class="row">
                                            <div class="">
                                                <button type="submit" name="register1-submit" id="register1-submit" class="form-control btn btn-register1">ΕΓΓΡΑΦΗ</button>
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
                                    <div class="form-group">
                                        <div id="button-row" class="row">
                                            <div class="">
                                                <button type="submit" name="register1-submit" id="register1-submit" class="form-control btn btn-register1">ΕΓΓΡΑΦΗ</button>
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
                                    <div class="form-group">
                                        <div id="button-row" class="row">
                                            <div class="">
                                                <button type="submit" name="register-submit" id="register-submit" class="form-control btn btn-register">ΕΓΓΡΑΦΗ</button>
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
	<script src = "pages/register.js" type = "text/javascript"></script>
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBMp5eP199GDotlWhbsMppKyTSVKQJlS4o&language=el&libraries=places&callback=initAutocomplete" async defer></script>
    </body>

</html>
