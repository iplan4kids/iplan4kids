<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ page import="gr.ntua.ece.softeng17b.conf.*" %>
<%@ page import="gr.ntua.ece.softeng17b.data.*" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html lang="el">
<head>
    <title>Iplan4kids</title>
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
    <link rel="stylesheet" href="styles.css" type="text/css">
</head>

<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">    
      
    <!-- ------------------------------------- PAGE HEADER -------------------------------------------------- -->
    <div class="pageHeader row">		
		<div class="JumboLogo" >
			<img  src="../images/iplan.png"/>
			<h2 style="margin:auto 0;">Iplan4kids<strong><sub style="font-size:15px;weight:strong;"> by Iplan</sub></strong></h2>            
		</div>
	</div>

    <!-- -------------------------------------- NAVIGATION BAR ----------------------------------------------- -->
    <nav class="navbar navbar-inverse">
        <div class="container-fluid"> 
            <div class="navbar-header">
                <a class="navbar-left" href="#">
                    <img src="../images/iplan.png" align="center" width="50">
                </a>
                <a class="navbar-brand" href="#">iplan4Kids</a>
            </div>
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Δραστηριότητες
                        <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Page 1-1</a></li>
                            <li><a href="#">Page 1-2</a></li>
                            <li><a href="#">Page 1-3</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Πάροχοι
                        <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Page 1-1</a></li>
                            <li><a href="#">Page 1-2</a></li>
                            <li><a href="#">Page 1-3</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Επικοινωνία
                        <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Page 1-1</a></li>
                            <li><a href="#">Page 1-2</a></li>
                            <li><a href="#">Page 1-3</a></li>
                        </ul>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <a class=" btn btn-success navbar-btn" href="/app/pages/boobs3_register.html">
                        <span class="glyphicon glyphicon-wrench"></span>
                        Εγγραφή
                    </a>
                    <button class="btn btn-primary navbar-btn" data-toggle="modal" data-target="#myModal">
                        <span class="glyphicon glyphicon-log-in"></span>
                        Σύνδεση
                    </button>
                </ul>
            </div>
    </nav>

    <!-- -------------------------------------- CAROUSEL ----------------------------------------------- -->
    <div class="carouselContainer">
            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
                </ol>
            
                <!-- Wrapper for slides -->
                <div class="carousel-inner">
            
                <div class="item active">
                    <img src="../images/test_image.jpg" alt="Image1" style="width:100%;">
                    <div class="carousel-caption">
                    <h3>asdfsd</h3>
                    <p>adsasdfasdf</p>
                    </div>
                </div>
            
                <div class="item">
                    <img src="../images/test_image.jpg" alt="Image2" style="width:100%;">
                    <div class="carousel-caption">
                    <h3>asdfasdf</h3>
                    <p>adsfasdfasdf</p>
                    </div>
                </div>
                
                <div class="item">
                    <img src="../images/test_image.jpg" alt="Image3" style="width:100%;">
                    <div class="carousel-caption">
                    <h3>sdfasdf</h3>
                    <p>asdfasdf</p>
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

    
        <h2>MAIN PAGE</h2>
        <a>BLA BLA BLA BLA</a>
    
     
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
                <div class="mx-auto form-group">
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
    <script src = "scripts.js" type = "text/javascript"></script>
    </body>

</html>
