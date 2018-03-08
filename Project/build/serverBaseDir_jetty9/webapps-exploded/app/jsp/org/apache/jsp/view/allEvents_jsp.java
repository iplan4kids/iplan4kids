package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import gr.ntua.ece.softeng17b.data.Client;

public final class allEvents_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 if (session.getAttribute("client") == null){
    session.setAttribute("notloggedIn","list-item");
    session.setAttribute("loggedIn","none");
}
else{
    session.setAttribute("loggedIn","list-item");
    session.setAttribute("notloggedIn","none");
}
      out.write("\r\n");
      out.write("\r\n");

    String text;
    if (session.getAttribute("fromSearch") == null){
        text="";
    }
    else {
        text = (String) session.getAttribute("fromSearch");
    }
    System.out.println(text);


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"el\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Iplan4kids</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" sizes=\"32x32\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/octicons/4.4.0/font/octicons.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.0/jquery-ui.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet prefetch\" href=\"https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("    <style class=\"cp-pen-styles\"></style>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"pages/styles.css\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\r\n");
      out.write("\r\n");
      out.write("<!-- ------------------------------------- PAGE HEADER -------------------------------------------------- -->\r\n");
      out.write("<div class=\"pageHeader row\">\r\n");
      out.write("    <div class=\"JumboLogo\" >\r\n");
      out.write("        <img  src=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("        <h2 style=\"margin:auto 0; color:white\">Iplan4kids<strong><sub style=\"font-size:15px; color:white\"> by Iplan</sub></strong></h2>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- -------------------------------------- NAVIGATION BAR ----------------------------------------------- -->\r\n");
      out.write("<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <a class=\"navbar-left\" href=\"/app/\">\r\n");
      out.write("                <img src=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\" align=\"center\" width=\"50\"/>\r\n");
      out.write("            </a>\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("            <!-- Left part of Navbar -->\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-left\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"/app/events\"> Δραστηριότητες </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- Right part of Navbar -->\r\n");
      out.write("            <ul id=\"logregprof\" class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                <li class=\"notlogged\" style=\"display:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notloggedIn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" ><a href=\"/app/register\"><span class=\"glyphicon glyphicon-user\"></span> Εγγραφή </a></li>\r\n");
      out.write("                <li class=\"notlogged\" style=\"display:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notloggedIn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\"><span class=\"glyphicon glyphicon-log-in\"></span> Σύνδεση </a></li>\r\n");
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
      out.write(")</a></li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
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
      out.write("<span class=\"caret\"></span></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a id=\"profile\" href=\"/app/myProfile\"><span class=\"glyphicon glyphicon-file\"></span>Τα στοιχεία μου</a></li>\r\n");
      out.write("                        <li><a id=\"wallet\" href=\"/app/buyPoints\"><span class=\"glyphicon glyphicon-piggy-bank\"></span>Αγορά πόντων</a></li>\r\n");
      out.write("                        <li ><a  href=\"/app/logoutStrong\"><span id=\"logout\" class=\"glyphicon glyphicon-log-out\"></span>Αποσύνδεση</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                <div class=\"search-form\">\r\n");
      out.write("                    <form class=\"navbar-form\" action=\"/app/events\" method=\"get\" role=\"search\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"searchtext\" id=\"srch-term\" value=");
      out.print(text);
      out.write(">\r\n");
      out.write("                            <div class=\"input-group-btn\">\r\n");
      out.write("                                <button class=\"btn btn-default\" type=\"submit\"><i class=\"glyphicon glyphicon-search\"></i></button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     <!-- -------------------------------------- MAIN PAGE ----------------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("    <div class = \"row mainBody\" style=\"padding-bottom:154px \">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-sm-3\"> \r\n");
      out.write("            <h2 align=\"center\" class=\"newsHeader\">Φίλτρα Αναζήτησης</h2>                            \r\n");
      out.write("            <div class=\"panel filters\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div style=\"margin: 10px;\" class=\"row filterContainer\" >\r\n");
      out.write("\r\n");
      out.write("                    <label>Επιλογή Κατηγορίας:</label>\r\n");
      out.write("                    <div class=\"checkbox\" >\r\n");
      out.write("                        <label><input id=\"category1\" type=\"checkbox\" value=\"1\">Αθλητισμός</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"checkbox\">\r\n");
      out.write("                        <label><input id=\"category2\" type=\"checkbox\" value=\"2\">Θέατρο</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"checkbox\">\r\n");
      out.write("                        <label><input id=\"category3\" type=\"checkbox\" value=\"3\">Μουσική</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"checkbox\">\r\n");
      out.write("                        <label><input id=\"category4\" type=\"checkbox\" value=\"4\">Βιβλίο</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"checkbox\">\r\n");
      out.write("                        <label><input id=\"category5\" type=\"checkbox\" value=\"5\">Άλλες Δραστηριότητες</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                        <label style=\"display: inline;\"  for=\"amount\">\r\n");
      out.write("                            <input type=\"text\" id=\"amount\" readonly=\"\" style=\" margin-bottom:15px; border:0; color:#222; font-weight:bold;\">\r\n");
      out.write("                        </label>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div style=\"margin-bottom: 10px;\" class=\"filters-container\" id=\"slider-range\" ></div>\r\n");
      out.write("                    <!-- \r\n");
      out.write("                    <label>Επιλογή Ημερομηνιας:</label>\r\n");
      out.write("                    -->\r\n");
      out.write("                    <input style=\"display: none; margin-left: 5px; margin-bottom:10px; margin-top:10px;\"  placeholder=\"Ημερομηνία\" type=\"date\" id=\"filterdate\" min=\"\" class=\"form-control \" name=\"date\" value=\"\">\r\n");
      out.write("                    <label>Επιλογή Τοποθεσίας:</label>\r\n");
      out.write("                    <div class=\"radio\">\r\n");
      out.write("                        <label><input id=\"myLocation\" type=\"radio\" name=\"optradio\">Το σπίτι μου</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"radio\">\r\n");
      out.write("                        <label><input id=\"currentLocation\" type=\"radio\" name=\"optradio\">Εδώ που είμαι αυτή την στιγμή</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <label>Χιλιομετρική Απόσταση:</label>\r\n");
      out.write("\t\t\t\t\t<input style=\"margin-left: 5px; margin-bottom:10px; margin-top:10px;\"  placeholder=\"Αριθμός Χιλιομέτρων\" type=\"number\" id=\"numberOfKm\" min=\"0\" step=\"1\" class=\"form-control \" name=\"\" value=\"0\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                    <button class=\"btn submitButton\" onclick=\"applyFilters()\">Εφαρμογή Φίλτρων</button>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-9\">\r\n");
      out.write("            <h2 align=\"center\" class=\"newsHeader\">Δραστηριότητες</h2>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"panel activities\" >\r\n");
      out.write("            \r\n");
      out.write("            <!-- 1o Event -->\r\n");
      out.write("                <div class=\"row\" id=\"allEvents\">\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("                  \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("    \r\n");
      out.write("    <!-- -------------------------------------- PAGE FOOTER ----------------------------------------------- --> \r\n");
      out.write("    <footer class=\"text-center\">\r\n");
      out.write("        <a class=\"up-arrow\" href=\"#myPage\" data-toggle=\"tooltip\" title=\"Μετάβαση στη κορυφή της σελίδας\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-up\"></span>\r\n");
      out.write("            </a><br><br>\r\n");
      out.write("            <p> Created and maintained by iplan <br>\r\n");
      out.write("                Copyright &copy usage under terms and conditions of texnologia logismikou 2017-2018</p> \r\n");
      out.write("    </footer>\r\n");
      out.write("    \r\n");
      out.write("    <!-- -------------------------------------- BOOTSTRAP MODALS ----------------------------------------------- -->\r\n");
      out.write("<div style=\"align:center;\" class=\"modal\" id=\"myModal\">\r\n");
      out.write("    <div style=\"width:500px; margin:auto; \" class=\"panel panel-register1\">\r\n");
      out.write("        <div class=\"panel-heading\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <button style=\"margin-right:10px;\" type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                <h4 style=\"margin-left: 18px;\" class=\"text-center modal-title\"> Συνδεθείτε</h4>\r\n");
      out.write("                <br>\r\n");
      out.write("                <div class=\"col-xs-4\">\r\n");
      out.write("                    <a href=\"#\" class=\"active\" id=\"login1-form-link\">Χρήστης</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xs-4\">\r\n");
      out.write("                    <a href=\"#\" id=\"login2-form-link\">Διαχειριστής</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xs-4\">\r\n");
      out.write("                    <a href=\"#\" id=\"login-form-link\">Πάροχος</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"panel-body\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("\r\n");
      out.write("                    <!----------------------------------------------------------- CLIENT LOGIN ------------------------------------------------------------------------>\r\n");
      out.write("\r\n");
      out.write("                    <form id=\"login1-form\" action=\"/app/loginClient\" method=\"post\" role=\"form\" style=\"display: block;\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input type=\"text\" name=\"username\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Όνομα χρήστη\" value=\"\" style=\"\" required=\"required\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input type=\"password\" name=\"password\" id=\"password\" tabindex=\"1\" class=\"form-control\" placeholder=\"Κωδικός\" value=\"\" style=\"\" required=\"required\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <span id=\"clientwrong\" style=\"display:none; color:red;\" class=\"help-block\">*Μη έγκυρος συνδυασμός όνοματος χρήστη και συνθηματικού.</span>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <div id=\"button-row\" class=\"row\">\r\n");
      out.write("                                <div class=\"\">\r\n");
      out.write("                                    <button type=\"submit\" name=\"register1-submit\" id=\"register1-submit\" class=\"form-control btn btn-register1\">ΣΥΝΔΕΣΗ</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <!----------------------------------------------------------- ADMIN LOGIN ------------------------------------------------------------------------>\r\n");
      out.write("\r\n");
      out.write("                    <form id=\"login2-form\" action=\"/app/login/admin\" method=\"post\" role=\"form\" style=\"display: none;\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input type=\"text\" name=\"username\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Όνομα διαχειριστή\" value=\"\" style=\"\" required=\"required\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input type=\"password\" name=\"password\" id=\"password\" tabindex=\"1\" class=\"form-control\" placeholder=\"Κωδικός\" value=\"\" style=\"\" required=\"required\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <span id=\"adminwrong\" style=\"display:none; color:red;\" class=\"help-block\">*Μη έγκυρος συνδυασμός όνοματος διαχειριστή και συνθηματικού.</span>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <div id=\"button-row\" class=\"row\">\r\n");
      out.write("                                <div class=\"\">\r\n");
      out.write("                                    <button type=\"submit\" name=\"register1-submit\" id=\"register1-submit\" class=\"form-control btn btn-register1\">ΣΥΝΔΕΣΗ</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <!----------------------------------------------------------- PROVIDER LOGIN ------------------------------------------------------------------------>\r\n");
      out.write("\r\n");
      out.write("                    <form id=\"login-form\" action=\"/app/login/provider\" method=\"post\" role=\"form\" style=\"display: none;\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input type=\"text\" name=\"username\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Όνομα παρόχου\" value=\"\" style=\"\" required=\"required\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input type=\"password\" name=\"password\"  id=\"password\" tabindex=\"1\" class=\"form-control\" placeholder=\"Κωδικός\" value=\"\" style=\"\" required=\"required\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <span id=\"providerwrong\" style=\"display:none; color:red;\" class=\"help-block\">*Μη έγκυρος συνδυασμός όνοματος παρόχου και συνθηματικού.</span>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <div id=\"button-row\" class=\"row\">\r\n");
      out.write("                                <div class=\"\">\r\n");
      out.write("                                    <button type=\"submit\" name=\"register-submit\" id=\"register-submit\" class=\"form-control btn btn-register\">ΣΥΝΔΕΣΗ</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    <!-- -------------------------------------- SCRIPTS ----------------------------------------------- -->\r\n");
      out.write("    <script src = \"pages/scripts.js\" type = \"text/javascript\"></script>\r\n");
      out.write("    <script src = \"pages/allEvents.js\" type = \"text/javascript\"></script>\r\n");
      out.write("    <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBMp5eP199GDotlWhbsMppKyTSVKQJlS4o&language=el&libraries=places\" async defer></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
