package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import gr.ntua.ece.softeng17b.data.Client;

public final class clientProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"pages/styles.css\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\n");
      out.write("\n");
      out.write("    <!-- ------------------------------------- PAGE HEADER -------------------------------------------------- -->\n");
      out.write("    <div class=\"pageHeader row\">\n");
      out.write("\t\t<div class=\"JumboLogo\" >\n");
      out.write("\t\t\t<img  src=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
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
      out.write("                <a class=\"navbar-left\" href=\"/app/\">\n");
      out.write("                    <img src=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
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
      out.write("                        <a href=\"/app/events\"> Δραστηριότητες </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <!-- Right part of Navbar -->\n");
      out.write("                <ul id=\"logregprof\" class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li class=\"dropdown\"><a id=\"logged1\" style=\"display:list-item\" href=\"#\"><span class=\"glyphicon glyphicon-piggy-bank\"></span> Πορτοφόλι (");
      out.print(String.format("%.2f",((Client) session.getAttribute("client")).getWallet()));
      out.write(")</a></li>\n");
      out.write("\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a id=\"logged2\" class=\"dropdown-toggle\" style=\"display:list-item\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${client.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a id=\"profile\" href=\"/app/myProfile\"><span class=\"glyphicon glyphicon-file\"></span>Τα στοιχεία μου</a></li>\n");
      out.write("                            <li><a id=\"wallet\" href=\"/app/buyPoints\"><span class=\"glyphicon glyphicon-piggy-bank\"></span>Αγορά πόντων</a></li>\n");
      out.write("                            <li ><a  href=\"/app/logoutStrong\"><span id=\"logout\" class=\"glyphicon glyphicon-log-out\"></span>Αποσύνδεση</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <div class=\"search-form\">\n");
      out.write("                        <form class=\"navbar-form\" action=\"/app/events\" method=\"get\" role=\"search\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"searchtext\" id=\"srch-term\" value=\"\">\n");
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
      out.write("    <div class=\"row\" >\n");
      out.write("      <div class=\"col-sm-12\">\n");
      out.write("        <div class=\"profile-header\">\n");
      out.write("          <div class=\"col-sm-3 left\">\n");
      out.write("            <span class=\"glyphicon glyphicon-user\"></span>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"center col-sm-6\">\n");
      out.write("              ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${client.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"row\" style=\"padding-bottom: 300px\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <table class=\"profile table\">\n");
      out.write("          <tr>\n");
      out.write("            <td>Όνομα:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${client.getFirst_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Επώνυμο:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${client.getLast_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Τηλέφωνο:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${client.getM_phone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Email:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${client.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Οδός:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${client.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Αριθμός:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${client.getAddress_num()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Πόλη:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${client.getCity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Τ.Κ:</td>\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${client.getPostal_code()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
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
      out.write("    <div class=\"modal\" id=\"myModal\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <!-- Modal Header -->\n");
      out.write("                    <div class=\"modal-header \">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                        <h4 class=\"text-center modal-title\">Συνδεθείτε</h4>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Modal body -->\n");
      out.write("             \t<form action=\"/app/login\" method=\"POST\">\n");
      out.write("                    <!-- Modal body -->\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("\n");
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
      out.write("                <div class=\"form-group\">\n");
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
      out.write("\n");
      out.write("    <script src = \"pages/scripts.js\" type = \"text/javascript\"></script>\n");
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
