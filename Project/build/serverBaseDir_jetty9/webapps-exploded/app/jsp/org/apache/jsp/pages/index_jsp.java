package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import gr.ntua.ece.softeng17b.conf.*;
import gr.ntua.ece.softeng17b.data.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"el\">\n");
      out.write("<head>\n");
      out.write("    <title>Iplan4kids</title>\n");
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
      out.write("    <link rel=\"stylesheet\" href=\"styles.css\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">    \n");
      out.write("      \n");
      out.write("    <!-- ------------------------------------- PAGE HEADER -------------------------------------------------- -->\n");
      out.write("    <div class=\"pageHeader row\">\t\t\n");
      out.write("\t\t<div class=\"JumboLogo\" >\n");
      out.write("\t\t\t<img  src=\"../images/iplan.png\"/>\n");
      out.write("\t\t\t<h2 style=\"margin:auto 0;\">Iplan4kids<strong><sub style=\"font-size:15px;weight:strong;\"> by Iplan</sub></strong></h2>            \n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("    <!-- -------------------------------------- NAVIGATION BAR ----------------------------------------------- -->\n");
      out.write("    <nav class=\"navbar navbar-inverse\">\n");
      out.write("        <div class=\"container-fluid\"> \n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <a class=\"navbar-left\" href=\"#\">\n");
      out.write("                    <img src=\"../images/iplan.png\" align=\"center\" width=\"50\">\n");
      out.write("                </a>\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">iplan4Kids</a>\n");
      out.write("            </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Δραστηριότητες\n");
      out.write("                        <span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#\">Page 1-1</a></li>\n");
      out.write("                            <li><a href=\"#\">Page 1-2</a></li>\n");
      out.write("                            <li><a href=\"#\">Page 1-3</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Πάροχοι\n");
      out.write("                        <span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#\">Page 1-1</a></li>\n");
      out.write("                            <li><a href=\"#\">Page 1-2</a></li>\n");
      out.write("                            <li><a href=\"#\">Page 1-3</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Επικοινωνία\n");
      out.write("                        <span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#\">Page 1-1</a></li>\n");
      out.write("                            <li><a href=\"#\">Page 1-2</a></li>\n");
      out.write("                            <li><a href=\"#\">Page 1-3</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <a class=\" btn btn-success navbar-btn\" href=\"/app/pages/boobs3_register.html\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-wrench\"></span>\n");
      out.write("                        Εγγραφή\n");
      out.write("                    </a>\n");
      out.write("                    <button class=\"btn btn-primary navbar-btn\" data-toggle=\"modal\" data-target=\"#myModal\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-log-in\"></span>\n");
      out.write("                        Σύνδεση\n");
      out.write("                    </button>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <!-- -------------------------------------- CAROUSEL ----------------------------------------------- -->\n");
      out.write("    <div class=\"carouselContainer\">\n");
      out.write("            <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <!-- Indicators -->\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                </ol>\n");
      out.write("            \n");
      out.write("                <!-- Wrapper for slides -->\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("            \n");
      out.write("                <div class=\"item active\">\n");
      out.write("                    <img src=\"../images/test_image.jpg\" alt=\"Image1\" style=\"width:100%;\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                    <h3>asdfsd</h3>\n");
      out.write("                    <p>adsasdfasdf</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"../images/test_image.jpg\" alt=\"Image2\" style=\"width:100%;\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                    <h3>asdfasdf</h3>\n");
      out.write("                    <p>adsfasdfasdf</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img src=\"../images/test_image.jpg\" alt=\"Image3\" style=\"width:100%;\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                    <h3>sdfasdf</h3>\n");
      out.write("                    <p>asdfasdf</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("                <!-- Left and right controls -->\n");
      out.write("                <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- -------------------------------------- MAIN PAGE ----------------------------------------------- -->\n");
      out.write("\n");
      out.write("    \n");
      out.write("        <h2>MAIN PAGE</h2>\n");
      out.write("        <a>BLA BLA BLA BLA</a>\n");
      out.write("    \n");
      out.write("     \n");
      out.write("    <!-- -------------------------------------- PAGE FOOTER ----------------------------------------------- --> \n");
      out.write("    <footer class=\"text-center\">\n");
      out.write("        <a class=\"up-arrow\" href=\"#myPage\" data-toggle=\"tooltip\" title=\"Μετάβαση στη κορυφή της σελίδας\">\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-up\"></span>\n");
      out.write("            </a><br><br>\n");
      out.write("            <p> Created and maintained by iplan <br>\n");
      out.write("                Copyright &copy usage under terms and conditions of texnologia logismikou 2017-2018</p> \n");
      out.write("    </footer>\n");
      out.write("    \n");
      out.write("    <!-- -------------------------------------- BOOTSTRAP MODALS ----------------------------------------------- --> \n");
      out.write("    <div class=\"modal\" id=\"myModal\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">            \n");
      out.write("                <!-- Modal Header -->\n");
      out.write("                    <div class=\"modal-header \">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                        <h4 class=\"text-center modal-title\">Συνδεθείτε</h4>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("\t\t\t<form action=\"/app/login\" method=\"POST\">\n");
      out.write("                    <!-- Modal body -->\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t \n");
      out.write("                    \t<div>Email</div>\n");
      out.write("                        \t<input type=\"text\" class=\"form-control\" name=\"username\">\n");
      out.write("                    \t<div>Κωδικός</div>\n");
      out.write("                    \t<input type=\"text\" class=\"form-control\" name=\"password\">\n");
      out.write("                </div>\n");
      out.write("                    <!-- Modal footer -->\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <div class=\"text-center\">\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-success\" value=\"Συνδεση\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\t\t\t</form>\n");
      out.write("                <div class=\"mx-auto form-group\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                                    <a href=\"https://phpoll.com/recover\" tabindex=\"5\" class=\"forgot-password\">Ξέχασες τον κωδικό?</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- -------------------------------------- SCRIPTS ----------------------------------------------- -->\n");
      out.write("    <script src = \"scripts.js\" type = \"text/javascript\"></script>\n");
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
}
