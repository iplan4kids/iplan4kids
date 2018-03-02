<%@ page import="gr.ntua.ece.softeng17b.data.Provider" %>
<%@ page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    Provider prov = (Provider)session.getAttribute("provider");
%>

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
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Ιστορικό</a>
                    </li>
                    <li>
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Αναφορά</a>
                    </li>
                    <li>
                        <a class="dropdown-toggle" data-toggle="dropdown" href="/app/provider/addEvent">Προσθήκη Νέου</a>
                    </li>
                    <li>
                        <a class="dropdown-toggle" data-toggle="dropdown" href="/app/provider/buySub">Ανανέωσε</a>
                    </li>
                  </ul>
                <!-- Right part of Navbar -->
                <ul class="nav navbar-nav navbar-right">
                      	<li class="dropdown">
        							<a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span> ${provider.getUsername()}
        							<span class="caret"></span></a>
        								  <ul class="dropdown-menu">
        									 <li><a href="#"><span class="octicon octicon-file"></span>Τα στοιχεία μου</a></li>

        								  </ul>
        						</li>
        				</ul>
				<!-- <ul class="nav navbar-nav navbar-right">
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
                </ul> -->
            </div>
        </div>
    </nav>


    <!-- -------------------------------------- MAIN PAGE ----------------------------------------------- -->

    <div class="row">
      <div class="col-sm-12">
        <div class="profile-header">
          <div class="col-sm-3 left">
            <span class="glyphicon glyphicon-user"></span>
          </div>
          <div class="center col-sm-6">
            ${provider.getUsername()}
          </div>
        </div>
      </div>
    </div>

    <div class="row" style="padding-bottom: 154px">
      <div class="container">
        <table class="profile table">
          <tr>
            <td>Επωνυμία εταιρίας:</td>
            <td>${provider.getCompany_name()}</td>
          </tr>
          <tr>
            <td>Όνομα Υπεύθυνου:</td>:</td>
            <td>${provider.getFirst_name()}</td>
          </tr>
          <tr>
            <td>Επώνυμο Υπεύθυνου:</td>
            <td>${provider.getLast_name()}</td>
          </tr>
          <tr>
            <td>Τηλέφωνο Εταιρίας:</td>
            <td>${provider.getPhone()}</td>
          </tr>
          <tr>
            <td>Τηλέφωνο Υπεύθυνου:</td>
            <td>${provider.getM_phone()}</td>
          </tr>
          <tr>
            <td>Email:</td>
            <td>${provider.getEmail()}</td>
          </tr>
          <tr>
            <td>ΑΦΜ:</td>
            <td>${provider.getAfm()}</td>
          </tr>
          <tr>
            <td>IBAN:</td>
            <td>${provider.getIban()}</td>
          </tr>
          <tr>
            <td>Οδός:</td>
            <td>${provider.getAddress()}</td>
          </tr>
          <tr>
            <td>Αριθμός:</td>
            <td>${provider.getAddress_num()}</td>
          </tr>
          <tr>
            <td>Πόλη:</td>
            <td>${provider.getCity()}</td>
          </tr>
          <tr>
            <td>Τ.Κ:</td>
            <td>${provider.getPostal_code()}</td>
          </tr>
          <tr>
            <td>Ενεργή συνδρομή εώς:</td>
            <td><%if (prov.getSubscription().getTime() > Calendar.getInstance().getTime().getTime()){%>
                ${provider.getSubscription()}<%} else{%>Έχει λήξει<%}%>
            </td>
          </tr>

        </table>
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
    <script src = "../pages/scripts.js" type = "text/javascript"></script>
    </body>

</html>
