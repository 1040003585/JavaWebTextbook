package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class ball_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("<html><head><title>购买球类页面</title></head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");
 request.setCharacterEncoding("UTF-8");
		   if (request.getParameter("b1") != null) 
	          session.setAttribute("s4", request.getParameter("b1"));
		   if (request.getParameter("b2") != null) 
		     session.setAttribute("s5", request.getParameter("b2"));
		   if (request.getParameter("b3") != null) 
		     session.setAttribute("s6", request.getParameter("b3"));
		
      out.write("\r\n");
      out.write("\t\t各种球大甩卖,一律八块:\r\n");
      out.write("\t\t<form method=\"post\" action=\"ball.jsp\">\r\n");
      out.write("\t\t\t<p> <input type=\"checkbox\" name=\"b1\" value=\"篮球\">篮球&nbsp;\r\n");
      out.write("\t\t\t   <input type=\"checkbox\" name=\"b2\" value=\"足球\">足球&nbsp;\r\n");
      out.write("\t\t\t   <input type=\"checkbox\" name=\"b3\" value=\"排球\">排球\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p> <input type=\"submit\" value=\"提交\" name=\"x1\">\r\n");
      out.write("\t\t\t   <a href=\"fork.jsp\">买点别的</a>&nbsp;\r\n");
      out.write("\t\t\t   <a href=\"display.jsp\">查看购物车</a>\r\n");
      out.write("\t\t\t</P>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
