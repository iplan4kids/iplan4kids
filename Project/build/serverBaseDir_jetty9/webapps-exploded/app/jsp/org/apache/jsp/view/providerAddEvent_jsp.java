package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import gr.ntua.ece.softeng17b.data.Provider;
import java.util.Calendar;

public final class providerAddEvent_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String blocked;
    Provider prov = (Provider) session.getAttribute("provider");
    if(prov.getSubscription().getTime() < Calendar.getInstance().getTime().getTime()){
        blocked = "disabled";
    }
    else{
        blocked = "";
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"el\">\n");
      out.write("<head>\n");
      out.write("    <title>Bootstrap Example</title>\n");
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
      out.write("    <script src=\"http://cdn.jsdelivr.net/timepicker.js/latest/timepicker.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://cdn.jsdelivr.net/timepicker.js/latest/timepicker.min.css\"/>\n");
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
      out.write("            <a class=\"navbar-left\" href=\"/app/provider/\">\n");
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
      out.write("                    <a href=\"#\">Ιστορικό</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">Αναφορά</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"/app/provider/addEvent\">Προσθήκη Νέου</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"/app/provider/buySub\">Ανανέωσε</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <!-- Right part of Navbar -->\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provider.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                        <span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a href=\"/app/provider/myProfile\"><span class=\"glyphicon glyphicon-file\"></span>Τα στοιχεία μου</a></li>\n");
      out.write("                        <li ><a  href=\"/app/logoutStrong\"><span id=\"logout\" class=\"glyphicon glyphicon-log-out\"></span>Αποσύνδεση</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<!-- -------------------------------------- MAIN PAGE ----------------------------------------------- -->\n");
      out.write("\n");
      out.write("<div  class=\"container\" style=\"padding-bottom: 154px\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("            <div class=\"panel panel-register1\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <p style=\"color: black;font-size: 18px;font-weight:bold;\">Δημιουργία Νέας Δραστηριότητας</p>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <form id=\"register1-form\" action=\"/app/provider/addEvent/add\" method=\"post\" role=\"form\" style=\"display: block;\" enctype=\"multipart/form-data\">\n");
      out.write("                                <span class=\"help-block\"></span>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input placeholder=\"Ονομασία δραστηριότητας\" type=\"text\" class=\"form-control\" name=\"title\" value=\"\" required=\"required\">\n");
      out.write("                                </div>\n");
      out.write("                                <span id=\"helpdate\" class=\"help-block\"></span>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input placeholder=\"Ημερομηνία\" type=\"date\" id=\"checkdate\" min=\"\" class=\"form-control\" name=\"date\" value=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"text\" id=\"time\" name=\"time\" class=\"form-control\" placeholder=\"Time\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input placeholder=\"Διάρκεια Δραστηριότητας σε λεπτά\" type=\"number\" min=\"0\" class=\"form-control\" name=\"duration\" value=\"\" required=\"required\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input id=\"autocomplete\" onFocus=\"\" placeholder=\"Τοποθεσία\" type=\"text\" class=\"form-control\" name=\"\" value=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <span id=\"geowrong\" style=\"color:red;\" class=\"help-block\"></span>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"text\" name=\"postal_code\" id=\"postal_code\" class=\"form-control\" placeholder=\"Ταχυδρομικός Κωδικας\" value=\"\" required=\"required\" >\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"text\" name=\"city\" id=\"locality\" class=\"form-control\" placeholder=\"Περιοχή\" value=\"\" required=\"required\" >\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"text\" name=\"address\" id=\"route\" class=\"form-control\" placeholder=\"Oδός\" value=\"\" required=\"required\" >\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"text\" name=\"address_num\" id=\"street_number\" class=\"form-control\" placeholder=\"Αριθμός Οδού\" value=\"\" required=\"required\" >\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"hidden\" name=\"lat\" id=\"lat\" class=\"form-control\" placeholder=\"Γεωγραφικό πλάτος\" value=\"\" required=\"required\" >\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"hidden\" name=\"lng\" id=\"lng\" class=\"form-control\" placeholder=\"Γεωγραφικό μήκος\" value=\"\" required=\"required\" >\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input placeholder=\"Αριθμός Εισιτηρίων\" type=\"number\" min=\"0\" class=\"form-control\" name=\"tickets\" value=\"\" required=\"required\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input placeholder=\"Τιμή\" type=\"number\" min=\"0\"  class=\"form-control\" name=\"price\" value=\"\" required=\"required\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <textarea name=\"description\" style=\"resize:none; font-size: 16px;\" rows=\"3\" class=\"form-control\" placeholder=\"Περιγραφή\" required=\"required\"></textarea>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div style=\"margin-bottom: 15px;\" class=\"row\">\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <h style=\"margin-left: 20px;\">Επιλογή Κατηγοριών:</h>\n");
      out.write("                                        <div class=\"items-collection\">\n");
      out.write("\n");
      out.write("                                            <div class=\"items col-xs-3 col-sm-3 col-md-3 col-lg-3\">\n");
      out.write("                                                <div class=\"info-block block-info clearfix\">\n");
      out.write("                                                    <div data-toggle=\"buttons\" class=\"btn-group bizmoduleselect\">\n");
      out.write("                                                        <label class=\"btn btn-default\">\n");
      out.write("                                                            <div class=\"itemcontent\">\n");
      out.write("                                                                <input type=\"checkbox\" name=\"\" id=\"sports-checkbox\" value=\"\">\n");
      out.write("\n");
      out.write("                                                                <h5>Αθλητισμός</h5>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"items col-xs-3 col-sm-3 col-md-3 col-lg-3\">\n");
      out.write("                                                <div class=\"info-block block-info clearfix\">\n");
      out.write("                                                    <div data-toggle=\"buttons\" class=\"btn-group itemcontent\">\n");
      out.write("                                                        <label class=\"btn btn-default\">\n");
      out.write("                                                            <div class=\"itemcontent\">\n");
      out.write("                                                                <input type=\"checkbox\" name=\"\" id=\"theatre-checkbox\" value=\"\">\n");
      out.write("\n");
      out.write("                                                                <h5>Θέατρο</h5>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"items col-xs-3 col-sm-3 col-md-3 col-lg-3\">\n");
      out.write("                                                <div class=\"info-block block-info clearfix\">\n");
      out.write("                                                    <div data-toggle=\"buttons\" class=\"btn-group itemcontent\">\n");
      out.write("                                                        <label class=\"btn btn-default\">\n");
      out.write("                                                            <div class=\"itemcontent\">\n");
      out.write("                                                                <input type=\"checkbox\" name=\"\" id=\"music-checkbox\" value=\"\">\n");
      out.write("\n");
      out.write("                                                                <h5>Μουσική</h5>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"items col-xs-3 col-sm-3 col-md-3 col-lg-3\">\n");
      out.write("                                                <div class=\"info-block block-info clearfix\">\n");
      out.write("                                                    <div data-toggle=\"buttons\" class=\"btn-group itemcontent\">\n");
      out.write("                                                        <label class=\"btn btn-default\">\n");
      out.write("                                                            <div class=\"itemcontent\">\n");
      out.write("                                                                <input type=\"checkbox\" name=\"\" id=\"workshop-checkbox\" value=\"\">\n");
      out.write("\n");
      out.write("                                                                <h5>Εργαστήρι</h5>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"items col-xs-3 col-sm-3 col-md-3 col-lg-3\">\n");
      out.write("                                                <div class=\"info-block block-info clearfix\">\n");
      out.write("                                                    <div data-toggle=\"buttons\" class=\"btn-group itemcontent\">\n");
      out.write("                                                        <label class=\"btn btn-default\">\n");
      out.write("                                                            <div class=\"itemcontent\">\n");
      out.write("                                                                <input type=\"checkbox\" name=\"\" id=\"other-checkbox\" value=\"\">\n");
      out.write("\n");
      out.write("                                                                <h5>Άλλες</h5>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"hidden\" class=\"form-control\" name=\"sports\" id=\"sports\" value=\"0\">\n");
      out.write("                                <input type=\"hidden\" class=\"form-control\" name=\"music\" id=\"music\" value=\"0\">\n");
      out.write("                                <input type=\"hidden\" class=\"form-control\" name=\"theatre\" id=\"theatre\" value=\"0\">\n");
      out.write("                                <input type=\"hidden\" class=\"form-control\" name=\"workshop\" id=\"workshop\" value=\"0\">\n");
      out.write("                                <input type=\"hidden\" class=\"form-control\" name=\"other\" id=\"other\" value=\"0\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <label  class=\"input-group-btn\">\n");
      out.write("                                            <span style=\" height: 45px; text-align: center; display:table-cell; vertical-align:middle;\" class=\"btn btn-warning\">\n");
      out.write("                                                Browse&hellip; <input type=\"file\" name=\"images\" accept=\".jpg\" style=\"display: none;\" multiple>\n");
      out.write("                                            </span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" multiple>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"help-block\">\n");
      out.write("                \t\t\t\t\tTry selecting one or more files and watch the feedback\n");
      out.write("\t\t\t\t\t\t\t\t\tPlease submit .jpg images\n");
      out.write("            \t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div id=\"button-row\" class=\"row\">\n");
      out.write("                                        <div class=\"\">\n");
      out.write("                                            <button type=\"submit\" name=\"register-submit\" id=\"register-submit\" class=\"form-control btn btn-register\" ");
      out.print(blocked);
      out.write(">Ανέβασμα δραστηριότητας</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- -------------------------------------- PAGE FOOTER ----------------------------------------------- -->\n");
      out.write("<footer class=\"text-center\">\n");
      out.write("    <a class=\"up-arrow\" href=\"#myPage\" data-toggle=\"tooltip\" title=\"Μετάβαση στη κορυφή της σελίδας\">\n");
      out.write("        <span class=\"glyphicon glyphicon-chevron-up\"></span>\n");
      out.write("    </a><br><br>\n");
      out.write("    <p> Created and maintained by iplan <br>\n");
      out.write("        Copyright &copy usage under terms and conditions of texnologia logismikou 2017-2018</p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<!-- -------------------------------------- BOOTSTRAP MODALS ----------------------------------------------- -->\n");
      out.write("<div class=\"modal\" id=\"myModal\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <!-- Modal Header -->\n");
      out.write("            <div class=\"modal-header \">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h4 class=\"text-center modal-title\">Συνδεθείτε</h4>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Modal body -->\n");
      out.write("            <form action=\"/app/login\" method=\"POST\">\n");
      out.write("                <!-- Modal body -->\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                    <div>Email</div>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"username\">\n");
      out.write("                    <div>Κωδικός</div>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"password\">\n");
      out.write("                </div>\n");
      out.write("                <!-- Modal footer -->\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <div class=\"text-center\">\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-success\" value=\"Συνδεση\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"text-center\">\n");
      out.write("                        <a href=\"https://phpoll.com/recover\" tabindex=\"5\" class=\"forgot-password\">Ξέχασες τον κωδικό?</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- -------------------------------------- SCRIPTS ----------------------------------------------- -->\n");
      out.write("<script src = \"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\" type = \"text/javascript\"></script>\n");
      out.write("<script src =\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\" type = \"text/javascript\"></script>\n");
      out.write("<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCIiqpp38PgqgG9teEQZToa_PCO2M7kGzc&language=el&libraries=places&callback=initAutocomplete\" async defer></script>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500\">\n");
      out.write("\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue("/pages/registerevent.js");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }
}
