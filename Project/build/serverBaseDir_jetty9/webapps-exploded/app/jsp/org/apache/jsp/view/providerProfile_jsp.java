package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import gr.ntua.ece.softeng17b.data.Provider;
import java.util.Calendar;

public final class providerProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    Provider prov = (Provider)session.getAttribute("provider");

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
      out.write("    <link rel=\"stylesheet\" href=\"../pages/styles.css\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\n");
      out.write("\n");
      out.write("    <!-- ------------------------------------- PAGE HEADER -------------------------------------------------- -->\n");
      out.write("    <div class=\"pageHeader row\">\n");
      out.write("\t\t<div class=\"JumboLogo\" >\n");
      out.write("            <img  src=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" />\n");
      out.write("\t\t\t<h2 style=\"margin:auto 0; color:white\">Iplan4kids<strong><sub style=\"font-size:15px; color:white\"> by Iplan</sub></strong></h2>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("    <!-- -------------------------------------- NAVIGATION BAR ----------------------------------------------- -->\n");
      out.write("    <nav class=\"navbar navbar-inverse\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <a class=\"navbar-left\" href=\"/app/provider/\">\n");
      out.write("                    <img src=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\" align=\"center\" width=\"50\"/>\n");
      out.write("                </a>\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                <!-- Left part of Navbar -->\n");
      out.write("                <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Ιστορικό</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Αναφορά</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"/app/provider/addEvent\">Προσθήκη Νέου</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"/app/provider/buySub\">Ανανέωσε</a>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("                <!-- Right part of Navbar -->\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                      \t<li class=\"dropdown\">\n");
      out.write("        \t\t\t\t\t\t\t<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provider.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        \t\t\t\t\t\t\t<span class=\"caret\"></span></a>\n");
      out.write("        \t\t\t\t\t\t\t\t  <ul class=\"dropdown-menu\">\n");
      out.write("        \t\t\t\t\t\t\t\t\t <li><a href=\"#\"><span class=\"octicon octicon-file\"></span>Τα στοιχεία μου</a></li>\n");
      out.write("\n");
      out.write("        \t\t\t\t\t\t\t\t  </ul>\n");
      out.write("        \t\t\t\t\t\t</li>\n");
      out.write("        \t\t\t\t</ul>\n");
      out.write("\t\t\t\t<!-- <ul class=\"nav navbar-nav navbar-right\">\n");
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
      out.write("                </ul> -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- -------------------------------------- MAIN PAGE ----------------------------------------------- -->\n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-12\">\n");
      out.write("        <div class=\"profile-header\">\n");
      out.write("          <div class=\"col-sm-3 left\">\n");
      out.write("            <span class=\"glyphicon glyphicon-user\"></span>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"center col-sm-6\">\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provider.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"row\" style=\"padding-bottom: 154px\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <table class=\"profile table\">\n");
      out.write("          <tr>\n");
      out.write("            <td>Επωνυμία εταιρίας:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provider.getCompany_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Όνομα Υπεύθυνου:</td>:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provider.getFirst_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Επώνυμο Υπεύθυνου:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provider.getLast_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Τηλέφωνο Εταιρίας:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provider.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Τηλέφωνο Υπεύθυνου:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provider.getM_phone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Email:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provider.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>ΑΦΜ:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provider.getAfm()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>IBAN:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provider.getIban()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Οδός:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provider.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Αριθμός:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provider.getAddress_num()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Πόλη:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provider.getCity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Τ.Κ:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provider.getPostal_code()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Ενεργή συνδρομή εώς:</td>\n");
      out.write("            <td>");
if (prov.getSubscription().getTime() > Calendar.getInstance().getTime().getTime()){
      out.write("\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provider.getSubscription()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
} else{
      out.write("Έχει λήξει");
}
      out.write("\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- -------------------------------------- PAGE FOOTER ----------------------------------------------- -->\n");
      out.write("    <footer class=\"text-center\">\n");
      out.write("        <a class=\"up-arrow\" href=\"#myPage\" data-toggle=\"tooltip\" title=\"Μετάβαση στη κορυφή της σελίδας\">\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-up\"></span>\n");
      out.write("            </a><br><br>\n");
      out.write("            <p> Created and maintained by iplan <br>\n");
      out.write("                Copyright &copy usage under terms and conditions of texnologia logismikou 2017-2018</p>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <!-- -------------------------------------- BOOTSTRAP MODALS ----------------------------------------------- -->\n");
      out.write("    <div style=\"align:center;\" class=\"modal\" id=\"myModal\">\n");
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
      out.write("    <script src = \"../pages/scripts.js\" type = \"text/javascript\"></script>\n");
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
}
