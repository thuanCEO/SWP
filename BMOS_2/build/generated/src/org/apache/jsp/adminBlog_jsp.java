package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminBlog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_redirect_url = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_redirect_url.release();
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Mirrored from askbootstrap.com/preview/osahan-eat/theme-sidebar/index.html?fbclid=IwAR0nwIFNYzgqHa21f49Nzv1kLbeDTnnIQIEIfRudCclQdwQMDTmsCY1Ovq4 by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 19 Oct 2022 05:04:30 GMT -->\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"img/logo1.png\">\r\n");
      out.write("        <title>MANAGER LPRD</title>\r\n");
      out.write("\r\n");
      out.write("        <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"css/osahan.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"font/stylesheet.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"vendor/mdi-icons/css/materialdesignicons.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/custom.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body id=\"page-top\">\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("            <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\r\n");
      out.write("                <a class=\"sidebar-brand d-flex align-items-center\" href=\"ManagerBlogController\">\r\n");
      out.write("                    <div class=\"sidebar-brand-icon\">\r\n");
      out.write("                        <img src=\"img/logo1.png\" class=\"img-fluid\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"nav-item active\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"Showproduct\">\r\n");
      out.write("                        <i class=\"mdi mdi-home-variant-outline\"></i>\r\n");
      out.write("                        <span>TRANG CHỦ</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <hr class=\"sidebar-divider d-none d-md-block\">\r\n");
      out.write("                <div class=\"text-center d-none d-md-inline\">\r\n");
      out.write("                    <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div id=\"content-wrapper\" class=\"d-flex flex-column\">\r\n");
      out.write("                <div id=\"content\">\r\n");
      out.write("                    <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow-sm osahan-nav-top\">\r\n");
      out.write("                        <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\r\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <style>\r\n");
      out.write("                            .dropdown-menu a {\r\n");
      out.write("                                font-size: 15px;\r\n");
      out.write("\r\n");
      out.write("                            }\r\n");
      out.write("                            .caret {\r\n");
      out.write("                                font-size: 15px;\r\n");
      out.write("\r\n");
      out.write("                            }\r\n");
      out.write("                        </style>\r\n");
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <style>\r\n");
      out.write("                        .table-responsive {\r\n");
      out.write("                            margin: -50px 0;\r\n");
      out.write("                        }\r\n");
      out.write("                        .table-wrapper {\r\n");
      out.write("                            min-width: 1000px;\r\n");
      out.write("                            background: #fff;\r\n");
      out.write("                            padding: 20px 25px;\r\n");
      out.write("                            border-radius: 3px;\r\n");
      out.write("                            width: 1440px;\r\n");
      out.write("                            box-shadow: 0 1px 1px rgba(0,0,0,.05);\r\n");
      out.write("                        }\r\n");
      out.write("                        .table-title {\r\n");
      out.write("                            padding-bottom: 15px;\r\n");
      out.write("                            background: #c60021;\r\n");
      out.write("                            color: white;\r\n");
      out.write("                            padding: 16px 30px;\r\n");
      out.write("                            margin: -10px -30px 20px;\r\n");
      out.write("                            width: 1440px;\r\n");
      out.write("                            border-radius: 3px 3px 0 0\r\n");
      out.write("                        }\r\n");
      out.write("                        .table-title h2 {\r\n");
      out.write("                            margin: 5px 0 0;\r\n");
      out.write("                            font-size: 24px;\r\n");
      out.write("                        }\r\n");
      out.write("                        .table-title .btn {\r\n");
      out.write("                            color: #566787;\r\n");
      out.write("                            float: right;\r\n");
      out.write("                            font-size: 13px;\r\n");
      out.write("                            background: #fff;\r\n");
      out.write("                            border: none;\r\n");
      out.write("                            min-width: 50px;\r\n");
      out.write("                            border-radius: 2px;\r\n");
      out.write("                            border: none;\r\n");
      out.write("                            outline: none !important;\r\n");
      out.write("                            margin-left: 10px;\r\n");
      out.write("                        }\r\n");
      out.write("                        .table-title .btn:hover, .table-title .btn:focus {\r\n");
      out.write("                            color: #566787;\r\n");
      out.write("\r\n");
      out.write("                        }\r\n");
      out.write("                        .table-title .btn i {\r\n");
      out.write("                            float: left;\r\n");
      out.write("                            font-size: 21px;\r\n");
      out.write("                            margin-right: 5px;\r\n");
      out.write("                        }\r\n");
      out.write("                        .table-title .btn span {\r\n");
      out.write("                            float: left;\r\n");
      out.write("                            margin-top: 2px;\r\n");
      out.write("                        }\r\n");
      out.write("                        table.table tr th, table.table tr td {\r\n");
      out.write("                            border-color: #e9e9e9;\r\n");
      out.write("                            padding: 12px 15px;\r\n");
      out.write("                            vertical-align: middle;\r\n");
      out.write("                        }\r\n");
      out.write("                        table.table tr th:first-child {\r\n");
      out.write("                            width: 60px;\r\n");
      out.write("                        }\r\n");
      out.write("                        table.table tr th:last-child {\r\n");
      out.write("                            width: 100px;\r\n");
      out.write("                        }\r\n");
      out.write("                        table.table-striped tbody tr:nth-of-type(odd) {\r\n");
      out.write("                            /*background-color: ;*/\r\n");
      out.write("                        }\r\n");
      out.write("                        table.table-striped.table-hover tbody tr:hover {\r\n");
      out.write("\r\n");
      out.write("                        }\r\n");
      out.write("                        table.table th i {\r\n");
      out.write("                            font-size: 13px;\r\n");
      out.write("                            margin: 0 5px;\r\n");
      out.write("                            cursor: pointer;\r\n");
      out.write("                        }\t\r\n");
      out.write("                        table.table td:last-child i {\r\n");
      out.write("                            opacity: 0.9;\r\n");
      out.write("                            font-size: 22px;\r\n");
      out.write("                            margin: 0 5px;\r\n");
      out.write("                        }\r\n");
      out.write("                        table.table td a {\r\n");
      out.write("                            font-weight: bold;\r\n");
      out.write("                            color: #566787;\r\n");
      out.write("                            display: inline-block;\r\n");
      out.write("                            text-decoration: none;\r\n");
      out.write("                        }\r\n");
      out.write("                        table.table td a:hover {\r\n");
      out.write("                            color: #2196F3;\r\n");
      out.write("                        }\r\n");
      out.write("                        table.table td a.settings {\r\n");
      out.write("                            color: #2196F3;\r\n");
      out.write("                        }\r\n");
      out.write("                        table.table td a.delete {\r\n");
      out.write("                            color: #F44336;\r\n");
      out.write("                        }\r\n");
      out.write("                        table.table td i {\r\n");
      out.write("                            font-size: 19px;\r\n");
      out.write("                        }\r\n");
      out.write("                        table.table .avatar {\r\n");
      out.write("                            border-radius: 50%;\r\n");
      out.write("                            vertical-align: middle;\r\n");
      out.write("                            margin-right: 10px;\r\n");
      out.write("                        }\r\n");
      out.write("                        .status {\r\n");
      out.write("                            font-size: 30px;\r\n");
      out.write("                            margin: 2px 2px 0 0;\r\n");
      out.write("                            display: inline-block;\r\n");
      out.write("                            vertical-align: middle;\r\n");
      out.write("                            line-height: 10px;\r\n");
      out.write("                        }\r\n");
      out.write("                        h2 {\r\n");
      out.write("                            color: white;\r\n");
      out.write("                        }\r\n");
      out.write("                        h3 {\r\n");
      out.write("                            color:#c60021\r\n");
      out.write("                        }\r\n");
      out.write("                    </style>\r\n");
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                    <script data-cfasync=\"false\" src=\"js/email-decode.min.js\"></script><script src=\"vendor/jquery/jquery.min.js\" type=\"4673c51028ea841130b80adc-text/javascript\"></script>\r\n");
      out.write("                    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\" type=\"4673c51028ea841130b80adc-text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("                    <script src=\"vendor/jquery-easing/jquery.easing.min.js\" type=\"4673c51028ea841130b80adc-text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("                    <script src=\"js/osahan.min.js\" type=\"4673c51028ea841130b80adc-text/javascript\"></script>\r\n");
      out.write("                    <script src=\"js/rocket-loader.min.js\" data-cf-settings=\"4673c51028ea841130b80adc-|49\" defer=\"\"></script><script defer src=\"https://static.cloudflareinsights.com/beacon.min.js/v652eace1692a40cfa3763df669d7439c1639079717194\" integrity=\"sha512-Gi7xpJR8tSkrpF7aordPZQlW2DLtzUlZcumS8dMQjwDHEnw9I7ZLyiOj/6tZStRBGtGgN6ceN6cMH8z7etPGlw==\" data-cf-beacon='{\"rayId\":\"75c6f9299e967d56\",\"version\":\"2022.10.3\",\"r\":1,\"token\":\"dd471ab1978346bbb991feaa79e6ce5c\",\"si\":100}' crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </body>\r\n");
      out.write("\r\n");
      out.write("                    <!--Mirrored from askbootstrap.com/preview/osahan-eat/theme-sidebar/index.html?fbclid=IwAR0nwIFNYzgqHa21f49Nzv1kLbeDTnnIQIEIfRudCclQdwQMDTmsCY1Ovq4 by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 19 Oct 2022 05:04:46 GMT--> \r\n");
      out.write("                    </html>");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("name");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty name}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <li class=\"dropdown\">\r\n");
        out.write("                                <a href=\"#\" data-toggle=\"dropdown\" class=\"dropdown-toggle user-action\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"35\" height=\"35\" fill=\"currentColor\" class=\"bi bi-person-circle\" viewBox=\"0 0 16 16\">\r\n");
        out.write("                                    <path d=\"M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z\"/>\r\n");
        out.write("                                    <path fill-rule=\"evenodd\" d=\"M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z\"/>\r\n");
        out.write("                                    </svg>  <b class=\"caret\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" </b></a>\r\n");
        out.write("                                <ul class=\"dropdown-menu\">\r\n");
        out.write("                                    <li><a href=\"#\"><i class=\"fa fa-user-o\"></i><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" fill=\"currentColor\" class=\"bi bi-person\" viewBox=\"0 0 16 16\">\r\n");
        out.write("                                            <path d=\"M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z\"/>\r\n");
        out.write("                                            </svg> Profile</a></li>\r\n");
        out.write("                                    <!--                                                    <li><a href=\"#\"><i class=\"fa fa-calendar-o\"></i> Calendar</a></li>-->\r\n");
        out.write("                                    <li><a href=\"#\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-sliders\" viewBox=\"0 0 16 16\">\r\n");
        out.write("                                            <path fill-rule=\"evenodd\" d=\"M11.5 2a1.5 1.5 0 1 0 0 3 1.5 1.5 0 0 0 0-3zM9.05 3a2.5 2.5 0 0 1 4.9 0H16v1h-2.05a2.5 2.5 0 0 1-4.9 0H0V3h9.05zM4.5 7a1.5 1.5 0 1 0 0 3 1.5 1.5 0 0 0 0-3zM2.05 8a2.5 2.5 0 0 1 4.9 0H16v1H6.95a2.5 2.5 0 0 1-4.9 0H0V8h2.05zm9.45 4a1.5 1.5 0 1 0 0 3 1.5 1.5 0 0 0 0-3zm-2.45 1a2.5 2.5 0 0 1 4.9 0H16v1h-2.05a2.5 2.5 0 0 1-4.9 0H0v-1h9.05z\"/>\r\n");
        out.write("                                            </svg>  Settings</a></li>\r\n");
        out.write("                                    <li class=\"divider\"></li>\r\n");
        out.write("                                    <li><a href=\"LogoutController\"><i class=\"material-icons\">&#xE8AC;</i> Logout</a></li>\r\n");
        out.write("                                </ul>\r\n");
        out.write("                            </li>          \r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.roleID == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                        <div class=\"container\"> <br></br>\r\n");
        out.write("                            <div class=\"table-responsive\">\r\n");
        out.write("                                <div class=\"table-wrapper\">\r\n");
        out.write("                                    <div class=\"table-title\">\r\n");
        out.write("                                        <div class=\"row\">\r\n");
        out.write("                                            <div class=\"col-xs-5\">\r\n");
        out.write("                                                <h2>Blogs <b>Management</b></h2>\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                            <div class=\"col-xs-7\">\r\n");
        out.write("                                                <a href=\"ManagerAccountController\" class=\"btn btn-primary\"><span>Manage Account</span></a>\r\n");
        out.write("                                                <a href=\"ManagerProductController\" class=\"btn btn-primary\"><span>Manage Product</span></a>\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("\r\n");
        out.write("                                    <!-- \r\n");
        out.write("                                        quản lí sản phẩm\r\n");
        out.write("                                    -->\r\n");
        out.write("                                    <div>\r\n");
        out.write("                                        <form action=\"MainController\" method=\"POST\">\r\n");
        out.write("                                            Search Keyword: <input type=\"text\" name=\"txtSearchValue\" value=\"\" /> \r\n");
        out.write("                                            <input type=\"submit\" value=\"Find\" name=\"btAction\" />\r\n");
        out.write("                                        </form>\r\n");
        out.write("                                    </div>\r\n");
        out.write("\r\n");
        out.write("                                    <table class=\"table table-striped table-hover\">\r\n");
        out.write("                                        <thead>\r\n");
        out.write("                                            <tr>\r\n");
        out.write("                                                <th>BlogID</th>\r\n");
        out.write("                                                <th>IMG</th>\r\n");
        out.write("                                                <th>Title</th>\r\n");
        out.write("                                                <th>Content</th>\r\n");
        out.write("                                                <th>AccountID</th>\r\n");
        out.write("                                                <th>CreatedDate</th>\r\n");
        out.write("                                                <th>UpdatedDate</th>\r\n");
        out.write("                                                <th>Status</th>  \r\n");
        out.write("                                                <th>\r\n");
        out.write("                                                    Action\r\n");
        out.write("                                                </th>\r\n");
        out.write("                                            </tr>\r\n");
        out.write("                                        </thead>\r\n");
        out.write("                                        <tbody>\r\n");
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        </tbody>\r\n");
        out.write("                                    </table>\r\n");
        out.write("\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </div>      \r\n");
        out.write("\r\n");
        out.write("                        </div>    \r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("bl");
    _jspx_th_c_forEach_0.setVarStatus("counter");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                            <form action=\"MainController\" method=\"post\">\r\n");
          out.write("                                                <tr>\r\n");
          out.write("                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bl.blogID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                    <td><img src=\"img/bird/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bl.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"80\" height=\"80\"</td>\r\n");
          out.write("                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bl.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bl.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bl.accountID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bl.createdDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bl.updatedDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bl.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                                    <td>\r\n");
          out.write("                                                        <input type=\"submit\" name=\"action\" value=\"Update\" />\r\n");
          out.write("                                                    </td>\r\n");
          out.write("                                                </tr> \r\n");
          out.write("                                            </form>\r\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username != 'manager'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        ");
        if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_redirect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_0.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_redirect_0.setUrl("404.jsp");
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_eval_c_redirect_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_redirect_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_redirect_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_redirect_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                            loi\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_redirect_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_redirect_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_url.reuse(_jspx_th_c_redirect_0);
    return false;
  }
}
