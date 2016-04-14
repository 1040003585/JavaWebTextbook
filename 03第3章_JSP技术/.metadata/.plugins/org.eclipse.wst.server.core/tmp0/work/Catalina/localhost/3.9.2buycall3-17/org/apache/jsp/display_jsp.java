package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class display_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head><title>显示购物车购物信息</title></head>\r\n");
      out.write("\t<body>\t\t\r\n");
      out.write("\t\t你选择的结果是:<br>\r\n");
      out.write("\t\t");
 request.setCharacterEncoding("UTF-8");
		   String str = "";
		   if (session.getAttribute("s1") != null) {
			str = (String) session.getAttribute("s1");
			out.print(str + "<br>");
		   }
		   if (session.getAttribute("s2") != null) {
		      str = (String) session.getAttribute("s2");
			out.print(str + "<br>");
		   }
		   if (session.getAttribute("s3") != null) {
			str = (String) session.getAttribute("s3");
			out.print(str + "<br>");
		   }
		   if (session.getAttribute("s4") != null) {
			str = (String) session.getAttribute("s4");
			out.print(str + "<br>");
		   }
		   if (session.getAttribute("s5") != null) {
			str = (String) session.getAttribute("s5");
			out.print(str + "<br>");
		   }
		   if (session.getAttribute("s6") != null) {
			str = (String) session.getAttribute("s6");
			out.print(str + "<br>");
		   }
		
      out.write("\r\n");
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
