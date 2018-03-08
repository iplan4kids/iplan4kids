package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import gr.ntua.ece.softeng17b.data.Provider;
import gr.ntua.ece.softeng17b.data.Event;
import gr.ntua.ece.softeng17b.data.Client;
import gr.ntua.ece.softeng17b.data.DataAccess;
import gr.ntua.ece.softeng17b.conf.Configuration;
import java.util.Optional;

public final class eventPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

    Event ev = null;
    System.out.println(session.getAttribute("event"));
    if (session.getAttribute("event") == null){

    }
    else {
        ev = (Event) session.getAttribute(("event"));
    }
    double lng = ev.getPlace().getLongitude();
    double lat = ev.getPlace().getLatitude();


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"el\">\n");
      out.write("<head>\n");
      out.write("    <title>Iplan4kids</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"");
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
      out.write("    <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\n");
      out.write("\n");
      out.write("<!-- ------------------------------------- PAGE HEADER -------------------------------------------------- -->\n");
      out.write("<div class=\"pageHeader row\">\n");
      out.write("    <div class=\"JumboLogo\" >\n");
      out.write("        <img  src=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\" />\n");
      out.write("        <h2 style=\"margin:auto 0; color:white\">Iplan4kids<strong><sub style=\"font-size:15px; color:white\"> by Iplan</sub></strong></h2>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- -------------------------------------- NAVIGATION BAR ----------------------------------------------- -->\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <a class=\"navbar-left\" href=\"/app/\">\n");
      out.write("                <img src=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\" align=\"center\" width=\"50\"/>\n");
      out.write("            </a>\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("            <!-- Left part of Navbar -->\n");
      out.write("            <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"/app/events\"> Δραστηριότητες </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <!-- Right part of Navbar -->\n");
      out.write("            <ul id=\"logregprof\" class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li class=\"notlogged\" style=\"display:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notloggedIn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" ><a href=\"/app/register\"><span class=\"glyphicon glyphicon-user\"></span> Εγγραφή </a></li>\n");
      out.write("                <li class=\"notlogged\" style=\"display:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notloggedIn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\"><span class=\"glyphicon glyphicon-log-in\"></span> Σύνδεση </a></li>\n");
      out.write("                <li class=\"dropdown\"><a id=\"logged1\" style=\"display:");
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
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a id=\"logged2\" class=\"dropdown-toggle\" style=\"display:");
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
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a id=\"profile\" href=\"/app/myProfile\"><span class=\"glyphicon glyphicon-file\"></span>Τα στοιχεία μου</a></li>\n");
      out.write("                        <li><a id=\"wallet\" href=\"/app/buyPoints\"><span class=\"glyphicon glyphicon-piggy-bank\"></span>Αγορά πόντων</a></li>\n");
      out.write("                        <li ><a  href=\"/app/logoutStrong\"><span id=\"logout\" class=\"glyphicon glyphicon-log-out\"></span>Αποσύνδεση</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <div class=\"search-form\">\n");
      out.write("                    <form class=\"navbar-form\" action=\"/app/events\" method=\"get\" role=\"search\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"searchtext\" id=\"srch-term\" value=\"\">\n");
      out.write("                            <div class=\"input-group-btn\">\n");
      out.write("                                <button class=\"btn btn-default\" type=\"submit\"><i class=\"glyphicon glyphicon-search\"></i></button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("     <!-- -------------------------------------- MAIN PAGE ----------------------------------------------- -->\n");
      out.write("\n");
      out.write("    <div class = \"row mainBody\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <div class=\"panel eventProfileBox\">\n");
      out.write("\n");
      out.write("                <div class=\"panel-thumbnail\">\n");
      out.write("                    <p id=\"profileHeafer\" style=\"text-align: center; font-size: 5vh;  font-weight: bold;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${event.getTitle()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                    <div class=\"carouselContainer\">\n");
      out.write("                        <div style=\"border-radius: 6px; overflow: hidden;\" id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                            <!-- Indicators -->\n");
      out.write("                            <ol class=\"carousel-indicators\">\n");
      out.write("                                <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                                <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                                <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                            </ol>\n");
      out.write("\n");
      out.write("                            <!-- Wrapper for slides -->\n");
      out.write("                            <div class=\"carousel-inner\">\n");
      out.write("\n");
      out.write("                                <div class=\"item active\">\n");
      out.write("                                    <img src=\"../images/federer.jpg\" alt=\"Image1\" style=\"width:100%;\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <img src=\"../images/federer.jpg\" alt=\"Image2\" style=\"width:100%;\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <img src=\"../images/federer.jpg\" alt=\"Image3\" style=\"width:100%;\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Left and right controls -->\n");
      out.write("                            <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("                                <span class=\"sr-only\">Previous</span>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("                                <span class=\"sr-only\">Next</span>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                   <p>Στοιχεία Επικοινωνίας</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<p><span class=\"glyphicon glyphicon-phone\"></span>Τηλέφωνο: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prov.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\t\t\t\t\t<p><span class=\"glyphicon glyphicon-envelope\"></span>Email: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prov.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-9\"> \n");
      out.write("                <h2 align=\"center\"><strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${event.getTitle()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong></h2>\n");
      out.write("\t\t\t\t<h4 align=\"left\"><b>Πλήρης Περιγραφή:</b></h4>\n");
      out.write("\t\t\t\t<p> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${event.getDescription()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t<div align=\"right\" >\n");
      out.write("                    <strong>Τιμή:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${event.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" πόντοι</strong>\n");
      out.write("\t\t\t\t<button  class=\"btn btn-success\" href=\"#\" data-toggle=\"modal\" data-target=\"#buyModal\"><span class=\"glyphicon glyphicon-euro\"></span> Αγορά </button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<br>\n");
      out.write("\t\t\t\t<hr style=\"height:1px;border:none;color:#333;background-color:#333;\" />\n");
      out.write("\t\t\t\t<div style=\"margin-bottom: 40px; padding-bottom: 40px; position:relative;\" id=\"googleMap_event\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("    </div>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("    <!-- -------------------------------------- GOOGLE MAP ----------------------------------------------- -->\n");
      out.write("  <!-- <div id=\"googleMap\"></div>  -->\n");
      out.write("    <script>\n");
      out.write("    function myMap() {\n");
      out.write("        var myCenter = new google.maps.LatLng(");
      out.print(lat);
      out.write(',');
      out.write(' ');
      out.print(lng);
      out.write(");\n");
      out.write("    var mapProp = {center:myCenter, zoom:16, scrollwheel:false, draggable:false, mapTypeId:google.maps.MapTypeId.ROADMAP};\n");
      out.write("    var map = new google.maps.Map(document.getElementById(\"googleMap_event\"),mapProp);\n");
      out.write("    var marker = new google.maps.Marker({position:myCenter});\n");
      out.write("    marker.setMap(map);\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("    <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBVCx5csUzQV85Fz9f2LscVZQRckJvhLb8&callback=myMap\"></script>\n");
      out.write("    <!-- -------------------------------------- PAGE FOOTER ----------------------------------------------- --> \n");
      out.write("    <footer class=\"text-center\">\n");
      out.write("        <a class=\"up-arrow\" href=\"#myPage\" data-toggle=\"tooltip\" title=\"Μετάβαση στη κορυφή της σελίδας\">\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-up\"></span>\n");
      out.write("            </a><br><br>\n");
      out.write("            <p> Created and maintained by iplan <br>\n");
      out.write("                Copyright &copy usage under terms and conditions of texnologia logismikou 2017-2018</p> \n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <div style=\"align:center;\" class=\"modal\" id=\"myModal\">\n");
      out.write("        <div style=\"width:500px; margin:auto; \" class=\"panel panel-register1\">\n");
      out.write("            <div class=\"panel-heading\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <button style=\"margin-right:10px;\" type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    <h4 style=\"margin-left: 18px;\" class=\"text-center modal-title\"> Συνδεθείτε</h4>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"col-xs-4\">\n");
      out.write("                        <a href=\"#\" class=\"active\" id=\"login1-form-link\">Χρήστης</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-4\">\n");
      out.write("                        <a href=\"#\" id=\"login2-form-link\">Διαχειριστής</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-4\">\n");
      out.write("                        <a href=\"#\" id=\"login-form-link\">Πάροχος</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("\n");
      out.write("                        <!----------------------------------------------------------- CLIENT LOGIN ------------------------------------------------------------------------>\n");
      out.write("\n");
      out.write("                        <form id=\"login1-form\" action=\"/app/loginClient\" method=\"post\" role=\"form\" style=\"display: block;\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" name=\"username\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Όνομα χρήστη\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"password\" name=\"password\" id=\"password\" tabindex=\"1\" class=\"form-control\" placeholder=\"Κωδικός\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("                            </div>\n");
      out.write("                            <span id=\"clientwrong\" style=\"display:none; color:red;\" class=\"help-block\">*Μη έγκυρος συνδυασμός όνοματος χρήστη και συνθηματικού.</span>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div id=\"button-row\" class=\"row\">\n");
      out.write("                                    <div class=\"\">\n");
      out.write("                                        <button type=\"submit\" name=\"register1-submit\" id=\"register1-submit\" class=\"form-control btn btn-register1\">ΣΥΝΔΕΣΗ</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                        <!----------------------------------------------------------- ADMIN LOGIN ------------------------------------------------------------------------>\n");
      out.write("\n");
      out.write("                        <form id=\"login2-form\" action=\"/app/login/admin\" method=\"post\" role=\"form\" style=\"display: none;\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" name=\"username\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Όνομα διαχειριστή\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"password\" name=\"password\" id=\"password\" tabindex=\"1\" class=\"form-control\" placeholder=\"Κωδικός\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("                            </div>\n");
      out.write("                            <span id=\"adminwrong\" style=\"display:none; color:red;\" class=\"help-block\">*Μη έγκυρος συνδυασμός όνοματος διαχειριστή και συνθηματικού.</span>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div id=\"button-row\" class=\"row\">\n");
      out.write("                                    <div class=\"\">\n");
      out.write("                                        <button type=\"submit\" name=\"register1-submit\" id=\"register1-submit\" class=\"form-control btn btn-register1\">ΣΥΝΔΕΣΗ</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                        <!----------------------------------------------------------- PROVIDER LOGIN ------------------------------------------------------------------------>\n");
      out.write("\n");
      out.write("                        <form id=\"login-form\" action=\"/app/login/provider\" method=\"post\" role=\"form\" style=\"display: none;\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" name=\"username\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Όνομα παρόχου\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"password\" name=\"password\"  id=\"password\" tabindex=\"1\" class=\"form-control\" placeholder=\"Κωδικός\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("                            </div>\n");
      out.write("                            <span id=\"providerwrong\" style=\"display:none; color:red;\" class=\"help-block\">*Μη έγκυρος συνδυασμός όνοματος παρόχου και συνθηματικού.</span>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div id=\"button-row\" class=\"row\">\n");
      out.write("                                    <div class=\"\">\n");
      out.write("                                        <button type=\"submit\" name=\"register-submit\" id=\"register-submit\" class=\"form-control btn btn-register\">ΣΥΝΔΕΣΗ</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- -------------------------------------- BUY MODAL ----------------------------------------------- -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div style=\"overflow: hidden;\" class=\"modal\" id=\"buyModal\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <!-- Modal Header -->\n");
      out.write("                <div class=\"modal-header \">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    <h4 class=\"text-center modal-title\">Αγορά Εισιτηρίων</h4>\n");
      out.write("                </div>\n");
      out.write("                <!-- Modal body -->\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <div id=\"icantBuy\" style=\"display: none;\" >\n");
      out.write("                        <h4 style=\"margin-bottom: 10px;\" class=\"text-center modal-title\">Δεν είστε συνδεδεμένος,συνδεθείτε ή κάντε εγγραφή:</h4>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div style=\"text-align: center;\" class=\"col-lg-12\">\n");
      out.write("                                <button onclick=\"location.href='/app/register';\" style=\"text-align: center; display:table-cell; vertical-align:middle;\" class=\"btn btn-sq-lg btn-success\">\n");
      out.write("                                    <span style=\"margin-top: 10px;\"class=\"glyphicon glyphicon-user gi-5x\"></span><br/>\n");
      out.write("                                    <h2 style=\"margin-top: 5px;\"> Eγγραφή</h2> <br>\n");
      out.write("                                </button>\n");
      out.write("                                <button style=\"text-align: center; display:table-cell; vertical-align:middle;\" data-dismiss=\"modal\" data-toggle=\"modal\" data-target=\"#myModal\"  class=\"btn btn-sq-lg btn-primary\">\n");
      out.write("                                <span  style=\"margin-top: 10px;\" class=\"glyphicon glyphicon-log-in gi-5x\"></span><br/>\n");
      out.write("                                <h2 style=\"margin-top: 5px;\"> Σύνδεση</h2> <br>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"icanBuy\" style=\"display: inline;\">\n");
      out.write("                        <form id=\"buy-form\" action=\"/app/login/provider\" method=\"post\" role=\"form\">\n");
      out.write("                            <span class=\"help-block\">Αριθμός εισιτηρίων</span>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"number\" name=\"ticketsnumber\" min=\"1\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Αριθμός Εισιτηρίων\" value=\"\" style=\"\" required=\"required\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label style=\"padding-left: 0px;\" class=\"col-xs-3 control-label\">Όροι συναλλαγής:</label>\n");
      out.write("                                <div class=\"col-xs-9\">\n");
      out.write("                                    <div style=\"border: 1px solid #e5e5e5; height: 200px; overflow: auto; padding: 10px; border-radius: 4px;\">\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, veniam numquam has te. No suas nonumes recusabo mea, est ut graeci definitiones. His ne melius vituperata scriptorem, cum paulo copiosae conclusionemque at. Facer inermis ius in, ad brute nominati referrentur vis. Dicat erant sit ex. Phaedrum imperdiet scribentur vix no, ad latine similique forensibus vel.</p>\n");
      out.write("                                        <p>Dolore populo vivendum vis eu, mei quaestio liberavisse ex. Electram necessitatibus ut vel, quo at probatus oportere, molestie conclusionemque pri cu. Brute augue tincidunt vim id, ne munere fierent rationibus mei. Ut pro volutpat praesent qualisque, an iisque scripta intellegebat eam.</p>\n");
      out.write("                                        <p>Mea ea nonumy labores lobortis, duo quaestio antiopam inimicus et. Ea natum solet iisque quo, prodesset mnesarchum ne vim. Sonet detraxit temporibus no has. Omnium blandit in vim, mea at omnium oblique.</p>\n");
      out.write("                                        <p>Eum ea quidam oportere imperdiet, facer oportere vituperatoribus eu vix, mea ei iisque legendos hendrerit. Blandit comprehensam eu his, ad eros veniam ridens eum. Id odio lobortis elaboraret pro. Vix te fabulas partiendo.</p>\n");
      out.write("                                        <p>Natum oportere et qui, vis graeco tincidunt instructior an, autem elitr noster per et. Mea eu mundi qualisque. Quo nemore nusquam vituperata et, mea ut abhorreant deseruisse, cu nostrud postulant dissentias qui. Postea tincidunt vel eu.</p>\n");
      out.write("                                        <p>Ad eos alia inermis nominavi, eum nibh docendi definitionem no. Ius eu stet mucius nonumes, no mea facilis philosophia necessitatibus. Te eam vidit iisque legendos, vero meliore deserunt ius ea. An qui inimicus inciderint.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-xs-6 col-xs-offset-3\">\n");
      out.write("                                    <div class=\"checkbox\">\n");
      out.write("                                        <label>\n");
      out.write("                                            <input type=\"checkbox\" name=\"agree\" value=\"agree\" /> Αποδέχομαι τους όρους\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div id=\"button-row\" class=\"row\">\n");
      out.write("                                    <div class=\"\">\n");
      out.write("                                        <button type=\"submit\" name=\"register-submit\" id=\"register-submit\" class=\"form-control btn btn-warning\">Αγορά</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- -------------------------------------- SCRIPTS ----------------------------------------------- -->\n");
      out.write("<script src = \"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\" type = \"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
    _jspx_th_c_url_1.setValue("/pages/styles.css");
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

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("/images/iplan.png");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("/pages/scripts.js");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }
}
