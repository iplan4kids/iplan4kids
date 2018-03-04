package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_spring_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_url_var_value_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"el\">\n");
      out.write("<head>\n");
      out.write("    <title>Bootstrap Example</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/octicons/4.4.0/font/octicons.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    ");
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      if (_jspx_meth_spring_url_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${myCss}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">    \n");
      out.write("      \n");
      out.write("    <!-- ------------------------------------- PAGE HEADER -------------------------------------------------- -->\n");
      out.write("    <div class=\"pageHeader row\">\t\t\n");
      out.write("\t\t<div class=\"JumboLogo\" >\n");
      out.write("\t\t\t<img  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${myImages}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/iplan.png\"/>\n");
      out.write("\t\t\t<h2 style=\"margin:auto 0; color:white\">Iplan4kids<strong><sub style=\"font-size:15px; color:white\"> by Iplan</sub></strong></h2>            \n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("    <!-- -------------------------------------- NAVIGATION BAR ----------------------------------------------- -->\n");
      out.write("    <nav class=\"navbar navbar-inverse\">\n");
      out.write("        <div class=\"container-fluid\"> \n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <a class=\"navbar-left\" href=\"/app/\">\n");
      out.write("                    <img src=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${myImages}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/iplan.png align=\"center\" width=\"50\">\n");
      out.write("                </a>\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>  \n");
      out.write("                    <span class=\"icon-bar\"></span>                     \n");
      out.write("                </button>               \n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                <!-- Left part of Navbar -->\n");
      out.write("                <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a href=\"/app/events\"> Δραστηριότητες </a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("                </ul>\n");
      out.write("                <!-- Right part of Navbar -->\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"/app/register\"><span class=\"glyphicon glyphicon-user\"></span> Εγγραφή </a></li>\n");
      out.write("                    <li><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\"><span class=\"glyphicon glyphicon-log-in\"></span> Σύνδεση </a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <div class=\"search-form\">\n");
      out.write("                        <form class=\"navbar-form\" role=\"search\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"srch-term\" id=\"srch-term\">\n");
      out.write("                                <div class=\"input-group-btn\">\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"submit\"><i class=\"glyphicon glyphicon-search\"></i></button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- -------------------------------------- MAIN PAGE ----------------------------------------------- -->\n");
      out.write("\n");
      out.write("    <div  class=\"container\">\n");
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
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"first_name\" id=\"first_name\" tabindex=\"1\" class=\"form-control\" placeholder=\"Όνομα\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"last_name\" id=\"last_name\" tabindex=\"1\" class=\"form-control\" placeholder=\"Επώνυμο\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"tel\" pattern=\"^\\d{10}$\" name=\"m_phone\" id=\"m_phone\" tabindex=\"1\" class=\"form-control\" placeholder=\"Τηλέφωνο\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"email\" name=\"email\" id=\"email\" tabindex=\"1\" class=\"form-control\" placeholder=\"Email\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" pattern=\"^\\d{5}$\" name=\"postal_code\" id=\"postal_code\" tabindex=\"1\" class=\"form-control\" placeholder=\"Ταχυδρομικός Κωδικας\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"city\" id=\"city\" tabindex=\"1\" class=\"form-control\" placeholder=\"Περιοχή\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"address\" id=\"address\" tabindex=\"1\" class=\"form-control\" placeholder=\"Oδός\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"address_num\" pattern=\"[a-zA-Z0-9]+\" id=\"address_num\" tabindex=\"1\" class=\"form-control\" placeholder=\"Αριθμός Οδού\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" pattern=\"[a-zA-Z0-9]+\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Username\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" onkeyup='check();' id=\"password\" tabindex=\"1\" class=\"form-control\" placeholder=\"Κωδικός\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"confirm_password\" onkeyup='check();' id=\"confirm_password\" tabindex=\"1\" class=\"form-control\" placeholder=\"Επιβεβαίωση Κωδικού\" value=\"\" style=\"\" required=\"required\">\n");
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
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"company_name\" id=\"company_name\" tabindex=\"1\" class=\"form-control\" placeholder=\"Επωνυμία Επιχείρησης\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"first_name\" id=\"first_name\" tabindex=\"1\" class=\"form-control\" placeholder=\"Όνομα Yπεύθυνου\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"last_name\" id=\"last_name\" tabindex=\"1\" class=\"form-control\" placeholder=\"Επώνυμο Υπεύθυνου\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"email\" name=\"email\" id=\"email\" tabindex=\"1\" class=\"form-control\" placeholder=\"Email\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"tel\" pattern=\"^\\d{10}$\" name=\"phone\" id=\"phone\" tabindex=\"1\" class=\"form-control\" placeholder=\"Τηλέφωνο\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"tel\" pattern=\"^\\d{10}$\" name=\"m_phone\" id=\"m_phone\" tabindex=\"1\" class=\"form-control\" placeholder=\"Κινητό Τηλέφωνο\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" pattern=\"^\\d{9}$\" name=\"afm\" id=\"afm\" tabindex=\"1\" class=\"form-control\" placeholder=\"Α.Φ.Μ\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"iban\" id=\"iban\" tabindex=\"1\" class=\"form-control\" placeholder=\"ΙΒΑΝ\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" pattern=\"^\\d{5}$\" name=\"postal_code\" id=\"postal_code\" tabindex=\"1\" class=\"form-control\" placeholder=\"Ταχυδρομικός Κωδικας\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"city\" id=\"city\" tabindex=\"1\" class=\"form-control\" placeholder=\"Περιοχή\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"address\" id=\"address\" tabindex=\"1\" class=\"form-control\" placeholder=\"Oδός\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"address_num\" pattern=\"[a-zA-Z0-9]+\" id=\"address_num\" tabindex=\"1\" class=\"form-control\" placeholder=\"Αριθμός Οδού\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" pattern=\"[a-zA-Z0-9]+\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Username\" value=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" onkeyup='check1();' id=\"password1\" tabindex=\"1\" class=\"form-control\" placeholder=\"Κωδικός\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"confirm_password\" onkeyup='check1();' id=\"confirm_password1\" tabindex=\"1\" class=\"form-control\" placeholder=\"Επιβεβαίωση Κωδικού\" value=\"\" style=\"\" required=\"required\">\n");
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
      out.write("<div style=\"align:center;\" class=\"modal\" id=\"myModal\">\n");
      out.write("                <div style=\"width:500px; margin:auto; \" class=\"panel panel-register1\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <button style=\"margin-right:10px;\" type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                            <h4 style=\"margin-left: 18px;\" class=\"text-center modal-title\"> Συνδεθείτε</h4>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"col-xs-4\">\n");
      out.write("                                <a href=\"#\" class=\"active\" id=\"login1-form-link\">Χρήστης</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-4\">\n");
      out.write("                                <a href=\"#\" id=\"login2-form-link\">Διαχειριστής</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-4\">\n");
      out.write("                                <a href=\"#\" id=\"login-form-link\">Πάροχος</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <hr>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-12\">\n");
      out.write("\n");
      out.write("<!----------------------------------------------------------- CLIENT LOGIN ------------------------------------------------------------------------>\n");
      out.write("\n");
      out.write("                                <form id=\"login1-form\" action=\"/app/loginClient\" method=\"post\" role=\"form\" style=\"display: block;\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" name=\"username\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Όνομα χρήστη\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"password\" name=\"password\" id=\"password\" tabindex=\"1\" class=\"form-control\" placeholder=\"Κωδικός\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div id=\"button-row\" class=\"row\">\n");
      out.write("                                            <div class=\"\">\n");
      out.write("                                                <button type=\"submit\" name=\"register1-submit\" id=\"register1-submit\" class=\"form-control btn btn-register1\">ΕΓΓΡΑΦΗ</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("<!----------------------------------------------------------- ADMIN LOGIN ------------------------------------------------------------------------>\n");
      out.write("\n");
      out.write("                                <form id=\"login2-form\" action=\"/app/login/admin\" method=\"post\" role=\"form\" style=\"display: none;\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" name=\"username\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Όνομα διαχειριστή\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"password\" name=\"password\" id=\"password\" tabindex=\"1\" class=\"form-control\" placeholder=\"Κωδικός\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div id=\"button-row\" class=\"row\">\n");
      out.write("                                            <div class=\"\">\n");
      out.write("                                                <button type=\"submit\" name=\"register1-submit\" id=\"register1-submit\" class=\"form-control btn btn-register1\">ΕΓΓΡΑΦΗ</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("<!----------------------------------------------------------- PROVIDER LOGIN ------------------------------------------------------------------------>\n");
      out.write("\n");
      out.write("                                <form id=\"login-form\" action=\"/app/login/provider\" method=\"post\" role=\"form\" style=\"display: none;\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" name=\"username\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Όνομα παρόχου\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"password\" name=\"password\"  id=\"password\" tabindex=\"1\" class=\"form-control\" placeholder=\"Κωδικός\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div id=\"button-row\" class=\"row\">\n");
      out.write("                                            <div class=\"\">\n");
      out.write("                                                <button type=\"submit\" name=\"register-submit\" id=\"register-submit\" class=\"form-control btn btn-register\">ΕΓΓΡΑΦΗ</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- -------------------------------------- SCRIPTS ----------------------------------------------- -->\n");
      out.write("\t");
      if (_jspx_meth_spring_url_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <script src = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${myJs}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/scripts.js type = \"text/javascript\"></script>\n");
      out.write("\t<script src = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${myJs}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/register.js type = \"text/javascript\"></script>\n");
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

  private boolean _jspx_meth_spring_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent(null);
    _jspx_th_spring_url_0.setValue("/images");
    _jspx_th_spring_url_0.setVar("myImages");
    int[] _jspx_push_body_count_spring_url_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_0 = _jspx_th_spring_url_0.doStartTag();
      if (_jspx_th_spring_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_0.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_1 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_1.setParent(null);
    _jspx_th_spring_url_1.setValue("/pages/styles.css");
    _jspx_th_spring_url_1.setVar("myCss");
    int[] _jspx_push_body_count_spring_url_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_1 = _jspx_th_spring_url_1.doStartTag();
      if (_jspx_th_spring_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_1.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_2 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_2.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_2.setParent(null);
    _jspx_th_spring_url_2.setValue("/pages");
    _jspx_th_spring_url_2.setVar("myJs");
    int[] _jspx_push_body_count_spring_url_2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_2 = _jspx_th_spring_url_2.doStartTag();
      if (_jspx_th_spring_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_2.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_2);
    }
    return false;
  }
}
