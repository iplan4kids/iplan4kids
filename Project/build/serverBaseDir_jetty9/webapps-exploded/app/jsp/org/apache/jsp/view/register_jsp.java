package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import gr.ntua.ece.softeng17b.data.Client;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 if (session.getAttribute("client") == null){
	session.setAttribute("notloggedIn","list-item");
	session.setAttribute("loggedIn","none");
}
else{
	session.setAttribute("loggedIn","list-item");
	session.setAttribute("notloggedIn","none");
}
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"el\">\n");
      out.write("<head>\n");
      out.write("    <title>Bootstrap Example</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" sizes=\"32x32\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/octicons/4.4.0/font/octicons.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("     <link rel=\"stylesheet\" href=\"pages/styles.css\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">    \n");
      out.write("      \n");
      out.write("    <!-- ------------------------------------- PAGE HEADER -------------------------------------------------- -->\n");
      out.write("    <div class=\"pageHeader row\">\t\t\n");
      out.write("\t\t<div class=\"JumboLogo\" >\n");
      out.write("\t\t\t<img  src=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\" />\n");
      out.write("\t\t\t<h2 style=\"margin:auto 0; color:white\">Iplan4kids<strong><sub style=\"font-size:15px; color:white\"> by Iplan</sub></strong></h2>            \n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("    <!-- -------------------------------------- NAVIGATION BAR ----------------------------------------------- -->\n");
      out.write("\t<nav class=\"navbar navbar-inverse\">\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<a class=\"navbar-left\" href=\"/app/\">\n");
      out.write("\t\t\t\t\t<img src=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\" align=\"center\" width=\"50\"/>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("\t\t\t\t<!-- Left part of Navbar -->\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a href=\"/app/events\"> Δραστηριότητες </a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<!-- Right part of Navbar -->\n");
      out.write("\t\t\t\t<ul id=\"logregprof\" class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t<li class=\"notlogged\" style=\"display:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notloggedIn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" ><a href=\"/app/register\"><span class=\"glyphicon glyphicon-user\"></span> Εγγραφή </a></li>\n");
      out.write("\t\t\t\t\t<li class=\"notlogged\" style=\"display:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notloggedIn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\"><span class=\"glyphicon glyphicon-log-in\"></span> Σύνδεση </a></li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a id=\"logged1\" style=\"display:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loggedIn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" href=\"#\"><span class=\"glyphicon glyphicon-piggy-bank\"></span> Πορτοφόλι (");
 if (session.getAttribute("client") == null){ 
      out.write("%WALLET_POINTS%");
} else {
      out.write(' ');
      out.print(String.format("%.2f",((Client) session.getAttribute("client")).getWallet()));
      out.write(' ');
 }
      out.write(")</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t<a id=\"logged2\" class=\"dropdown-toggle\" style=\"display:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loggedIn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>");
 if (session.getAttribute("client") == null){ 
      out.write(" %USERNAME% ");
} else { 
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${client.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
 }
      out.write("<span class=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"profile\" href=\"/app/myProfile\"><span class=\"glyphicon glyphicon-file\"></span>Τα στοιχεία μου</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"wallet\" href=\"/app/buyPoints\"><span class=\"glyphicon glyphicon-piggy-bank\"></span>Αγορά πόντων</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li ><a  href=\"/app/logoutStrong\"><span id=\"logout\" class=\"glyphicon glyphicon-log-out\"></span>Αποσύνδεση</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t<div class=\"search-form\">\n");
      out.write("\t\t\t\t\t\t<form class=\"navbar-form\" role=\"search\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"srch-term\" id=\"srch-term\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-default\" type=\"submit\"><i class=\"glyphicon glyphicon-search\"></i></button>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- -------------------------------------- MAIN PAGE ----------------------------------------------- -->\n");
      out.write("\n");
      out.write("    <div  class=\"container\" style=\"padding-bottom: 154px\">\n");
      out.write("    \t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-register1\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<p style=\"color: black;font-size: 18px;font-weight:bold;\">Φόρμα Εγγραφής</p>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"active\" id=\"register1-form-link\">Χρήστης</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" id=\"register-form-link\">Πάροχος</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<hr>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t\t\t\t<form id=\"register1-form\" action=\"/app/registerClient\" method=\"post\" role=\"form\" style=\"display: block;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Εισάγεται το όνομα σας\" name=\"first_name\" id=\"first_name\" tabindex=\"1\" class=\"form-control\" placeholder=\"Όνομα\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Εισάγεται το Επώνυμο σας\" name=\"last_name\" id=\"last_name\" tabindex=\"1\" class=\"form-control\" placeholder=\"Επώνυμο\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"tel\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Εισάγεται το τηλέφωνο σας κινητο(69ΧΧΧΧΧΧΧΧ) ή σταθερό(210ΧΧΧΧΧΧΧ) 10 ψηφία συνολικά\" pattern=\"^\\d{10}$\" name=\"m_phone\" id=\"m_phone\" tabindex=\"1\" class=\"form-control\" placeholder=\"Τηλέφωνο\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"email\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"info@gmail.com\" name=\"email\" id=\"email\" tabindex=\"1\" class=\"form-control\" placeholder=\"Email\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input id=\"autocomplete\" placeholder=\"Τοποθεσία\" type=\"text\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Εισάγεται την οδό σας καθώς και το νούμερο και επιλέξτε\" class=\"form-control\" name=\"\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span id=\"geowrong\" style=\"color:red;\" class=\"help-block\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\"  name=\"postal_code\" id=\"postal_code\" class=\"form-control\" placeholder=\"Ταχυδρομικός Κωδικας\" value=\"\" required=\"required\" hidden>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"city\" id=\"locality\" class=\"form-control\" placeholder=\"Περιοχή\" value=\"\" required=\"required\" hidden>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"address\" id=\"route\" class=\"form-control\" placeholder=\"Oδός\" value=\"\" required=\"required\" hidden>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"address_num\" id=\"street_number\" class=\"form-control\" placeholder=\"Αριθμός Οδού\" value=\"\" required=\"required\" hidden>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"latitude\" id=\"lat\" class=\"form-control\" placeholder=\"Γεωγραφικό πλάτος\" value=\"\" required=\"required\" hidden>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"longtitude\" id=\"lng\" class=\"form-control\" placeholder=\"Γεωγραφικό μήκος\" value=\"\" required=\"required\" hidden>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Εισάγεται username\" name=\"username\" pattern=\"[a-zA-Z0-9]+\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Username\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Επιλέξτε κωδικό τον κωδικό πρόσβασης σας\" name=\"password\" onkeyup='check();' id=\"password\" tabindex=\"1\" class=\"form-control\" placeholder=\"Κωδικός\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Επιβεβαιώστε τον κωδικό που εισαγάγατε παραπάνω\" name=\"confirm_password\" onkeyup='check();' id=\"confirm_password\" tabindex=\"1\" class=\"form-control\" placeholder=\"Επιβεβαίωση Κωδικού\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"button-row\" class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" name=\"register1-submit\" id=\"register1-submit\" class=\"form-control btn btn-register1\">ΕΓΓΡΑΦΗ</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t<form id=\"register-form\" action=\"/app/registerProvider\" method=\"post\" role=\"form\" style=\"display: none;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Πλήρης ονομασία επιχείρησης\" name=\"company_name\" id=\"company_name\" tabindex=\"1\" class=\"form-control\" placeholder=\"Επωνυμία Επιχείρησης\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Εισάγεται το όνομα του υπεύθυνου\" name=\"first_name\" id=\"first_name\" tabindex=\"1\" class=\"form-control\" placeholder=\"Όνομα Yπεύθυνου\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Εισάγεται το επώνυμο του υπεύθυνου\" name=\"last_name\" id=\"last_name\" tabindex=\"1\" class=\"form-control\" placeholder=\"Επώνυμο Υπεύθυνου\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"email\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Εισάγεται το email επικοινωνίας\" name=\"email\" id=\"email\" tabindex=\"1\" class=\"form-control\" placeholder=\"Email\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"tel\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Εισάγεται το τηλέφωνο του υπεύθυνου κινητο(69ΧΧΧΧΧΧΧΧ) ή σταθερό(210ΧΧΧΧΧΧΧ) 10 ψηφία συνολικά\" pattern=\"^\\d{10}$\" name=\"phone\" id=\"tel\" tabindex=\"1\" class=\"form-control\" placeholder=\"Τηλέφωνο\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"tel\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Εισάγεται το τηλέφωνο σας κινητο(69ΧΧΧΧΧΧΧΧ) ή σταθερό(210ΧΧΧΧΧΧΧ) 10 ψηφία συνολικά\" pattern=\"^\\d{10}$\" name=\"m_phone\" id=\"m_phone\" tabindex=\"1\" class=\"form-control\" placeholder=\"Κινητό Τηλέφωνο\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Εισάγεται το A.Φ.Μ σας 9 ψηφία συνολικά\" pattern=\"^\\d{9}$\" name=\"afm\" id=\"afm\" tabindex=\"1\" class=\"form-control\" placeholder=\"Α.Φ.Μ\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Εισάγεται το IBAN σας GR-....\" name=\"iban\" id=\"iban\" tabindex=\"1\" class=\"form-control\" placeholder=\"ΙΒΑΝ\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\"><div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input id=\"autocomplete2\" placeholder=\"Τοποθεσία\" type=\"text\" class=\"form-control\" name=\"\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span id=\"geowrong2\" style=\"color:red;\" class=\"help-block\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"postal_code\" id=\"postal_code\" class=\"form-control\" placeholder=\"Ταχυδρομικός Κωδικας\" value=\"\" required=\"required\" hidden>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"city\" id=\"locality\" class=\"form-control\" placeholder=\"Περιοχή\" value=\"\" required=\"required\" hidden>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"address\" id=\"route\" class=\"form-control\" placeholder=\"Oδός\" value=\"\" required=\"required\" hidden>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"address_num\" id=\"street_number\" class=\"form-control\" placeholder=\"Αριθμός Οδού\" value=\"\" required=\"required\" hidden>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"latitude\" id=\"lat\" class=\"form-control\" placeholder=\"Γεωγραφικό πλάτος\" value=\"\" required=\"required\" hidden>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"longtitude\" id=\"lng\" class=\"form-control\" placeholder=\"Γεωγραφικό μήκος\" value=\"\" required=\"required\" hidden>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Εισάγεται username\" name=\"username\" pattern=\"[a-zA-Z0-9]+\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Username\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Επιλέξτε κωδικό τον κωδικό πρόσβασης σας\" name=\"password\" onkeyup='check1();' id=\"password1\" tabindex=\"1\" class=\"form-control\" placeholder=\"Κωδικός\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Επιβεβαιώστε τον κωδικό που εισαγάγατε παραπάνω\" name=\"confirm_password\" onkeyup='check1();' id=\"confirm_password1\" tabindex=\"1\" class=\"form-control\" placeholder=\"Επιβεβαίωση Κωδικού\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"button-row\" class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" name=\"register-submit\" id=\"register-submit\" class=\"form-control btn btn-register\">ΕΓΓΡΑΦΗ</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("    <!-- -------------------------------------- PAGE FOOTER ----------------------------------------------- --> \n");
      out.write("    <footer class=\"text-center\">\n");
      out.write("        <a class=\"up-arrow\" href=\"#myPage\" data-toggle=\"tooltip\" title=\"Μετάβαση στη κορυφή της σελίδας\">\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-up\"></span>\n");
      out.write("            </a><br><br>\n");
      out.write("            <p> Created and maintained by iplan <br>\n");
      out.write("                Copyright &copy usage under terms and conditions of texnologia logismikou 2017-2018</p> \n");
      out.write("    </footer>\n");
      out.write("    \n");
      out.write("    <!-- -------------------------------------- BOOTSTRAP MODALS ----------------------------------------------- -->\n");
      out.write("\t<div style=\"align:center;\" class=\"modal\" id=\"myModal\">\n");
      out.write("\t\t<div style=\"width:500px; margin:auto; \" class=\"panel panel-register1\">\n");
      out.write("\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<button style=\"margin-right:10px;\" type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\t\t\t\t\t<h4 style=\"margin-left: 18px;\" class=\"text-center modal-title\"> Συνδεθείτε</h4>\n");
      out.write("\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"active\" id=\"login1-form-link\">Χρήστης</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" id=\"login2-form-link\">Διαχειριστής</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" id=\"login-form-link\">Πάροχος</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<hr>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!----------------------------------------------------------- CLIENT LOGIN ------------------------------------------------------------------------>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<form id=\"login1-form\" action=\"/app/loginClient\" method=\"post\" role=\"form\" style=\"display: block;\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Όνομα χρήστη\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" id=\"password\" tabindex=\"1\" class=\"form-control\" placeholder=\"Κωδικός\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<span id=\"clientwrong\" style=\"display:none; color:red;\" class=\"help-block\">*Μη έγκυρος συνδυασμός όνοματος χρήστη και συνθηματικού.</span>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"button-row\" class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" name=\"register1-submit\" id=\"register1-submit\" class=\"form-control btn btn-register1\">ΣΥΝΔΕΣΗ</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t<!----------------------------------------------------------- ADMIN LOGIN ------------------------------------------------------------------------>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<form id=\"login2-form\" action=\"/app/login/admin\" method=\"post\" role=\"form\" style=\"display: none;\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Όνομα διαχειριστή\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" id=\"password\" tabindex=\"1\" class=\"form-control\" placeholder=\"Κωδικός\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<span id=\"adminwrong\" style=\"display:none; color:red;\" class=\"help-block\">*Μη έγκυρος συνδυασμός όνοματος διαχειριστή και συνθηματικού.</span>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"button-row\" class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" name=\"register1-submit\" id=\"register1-submit\" class=\"form-control btn btn-register1\">ΣΥΝΔΕΣΗ</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t<!----------------------------------------------------------- PROVIDER LOGIN ------------------------------------------------------------------------>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<form id=\"login-form\" action=\"/app/login/provider\" method=\"post\" role=\"form\" style=\"display: none;\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Όνομα παρόχου\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\"  id=\"password\" tabindex=\"1\" class=\"form-control\" placeholder=\"Κωδικός\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<span id=\"providerwrong\" style=\"display:none; color:red;\" class=\"help-block\">*Μη έγκυρος συνδυασμός όνοματος παρόχου και συνθηματικού.</span>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"button-row\" class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" name=\"register-submit\" id=\"register-submit\" class=\"form-control btn btn-register\">ΣΥΝΔΕΣΗ</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("    <!-- -------------------------------------- SCRIPTS ----------------------------------------------- -->\n");
      out.write("\t<script src = \"pages/scripts.js\" type = \"text/javascript\"></script>\n");
      out.write("\t<script src = \"pages/register.js\" type = \"text/javascript\"></script>\n");
      out.write("\t<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCIiqpp38PgqgG9teEQZToa_PCO2M7kGzc&language=el&libraries=places&callback=initAutocomplete\" async defer></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/images/iplan.png");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/images/iplan.png");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/images/iplan.png");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }
}
