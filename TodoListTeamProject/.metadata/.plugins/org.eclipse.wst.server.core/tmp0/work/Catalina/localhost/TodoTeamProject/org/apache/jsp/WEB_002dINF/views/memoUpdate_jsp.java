/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.79
 * Generated at: 2023-09-21 08:40:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memoUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("	margin: 0px;\r\n");
      out.write("	padding: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul {\r\n");
      out.write("	background: #faf9f8;\r\n");
      out.write("	box-shadow: 1px 1px 1px 1px #edeceb;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("	list-style: none;\r\n");
      out.write("	line-height: 30px;\r\n");
      out.write("	padding-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button {\r\n");
      out.write("	width: 50px;\r\n");
      out.write("	height: 30px;\r\n");
      out.write("	color: #2564cf;\r\n");
      out.write("	background-color: white;\r\n");
      out.write("	border: 1px solid #e1dfdd;\r\n");
      out.write("	transition: all 0.2s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button:hover {\r\n");
      out.write("	background: #faf9f8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("hr {\r\n");
      out.write("	background: #e1dfdd;\r\n");
      out.write("	height: 1px;\r\n");
      out.write("	border: 0;\r\n");
      out.write("	margin-top: 15px;\r\n");
      out.write("	margin-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 48px;\r\n");
      out.write("	background-color: #2564cf;\r\n");
      out.write("	/*border: 1px solid black;*/\r\n");
      out.write("	position: relative;\r\n");
      out.write("	display: flex;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header img {\r\n");
      out.write("	width: 15px;\r\n");
      out.write("	height: 15px;\r\n");
      out.write("	margin-left: 10px;\r\n");
      out.write("	margin-top: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header .title {\r\n");
      out.write("	color: white;\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	margin-left: 40px;\r\n");
      out.write("	position: relative;\r\n");
      out.write("	top: 12px;	​\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logOutIcon {\r\n");
      out.write("	width: 35px;\r\n");
      out.write("	height: 35px;\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	right: 10px;\r\n");
      out.write("	top: -8px;\r\n");
      out.write("	filter: invert(100%) sepia(0%) saturate(7499%) hue-rotate(169deg)\r\n");
      out.write("		brightness(125%) contrast(98%);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".todayToDoTitle {\r\n");
      out.write("	font-size: 20px;\r\n");
      out.write("	color: #292827;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	margin-bottom: 15px;\r\n");
      out.write("	font-size: 50px;\r\n");
      out.write("	margin-top: 85px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("section {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 900px;\r\n");
      out.write("	background-color: #faf9f8;\r\n");
      out.write("	/*border: 1px solid black;*/\r\n");
      out.write("	padding-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".toDo {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 100px;\r\n");
      out.write("	border: 1px solid #edeceb;\r\n");
      out.write("	background-color: white;\r\n");
      out.write("	box-shadow: 1px 1px 1px #edeceb;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	padding-left: 30px;\r\n");
      out.write("	margin-top: 30px;\r\n");
      out.write("	padding-top: 40px;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".wrapText {\r\n");
      out.write("	margin: 0px auto;\r\n");
      out.write("	height: 100px width: 90%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".submitBtn {\r\n");
      out.write("	width: 50px;\r\n");
      out.write("	height: 30px;\r\n");
      out.write("	color: #2564cf;\r\n");
      out.write("	background-color: white;\r\n");
      out.write("	border: 1px solid #e1dfdd;\r\n");
      out.write("	transition: all 0.2s;\r\n");
      out.write("	position: absolute;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".submitBtn:hover {\r\n");
      out.write("	background: #faf9f8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapButton {\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	right: 50px;\r\n");
      out.write("	bottom: 29px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapUpdateFrm {\r\n");
      out.write("	position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#updateFrm {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".toDo text {\r\n");
      out.write("	margin-left: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrap_test {\r\n");
      out.write("	height: 150px;\r\n");
      out.write("	width: 547.19px;\r\n");
      out.write("	position: relative;\r\n");
      out.write("	margin: 0px auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".modifybtn {\r\n");
      out.write("	width: 50px;\r\n");
      out.write("	height: 30px;\r\n");
      out.write("	color: #2564cf;\r\n");
      out.write("	background-color: white;\r\n");
      out.write("	border: 1px solid #e1dfdd;\r\n");
      out.write("	transition: all 0.2s;\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	top: 99px;\r\n");
      out.write("	right: 2px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<header>\r\n");
      out.write("		<img\r\n");
      out.write("			src=\"data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDABQODxIPDRQSEBIXFRQYHjIhHhwcHj0sLiQySUBMS0dARkVQWnNiUFVtVkVGZIhlbXd7gYKBTmCNl4x9lnN+gXz/2wBDARUXFx4aHjshITt8U0ZTfHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHz/wAARCABUAFUDASIAAhEBAxEB/8QAGwABAAMBAQEBAAAAAAAAAAAAAAQFBgMCAQf/xAArEAACAgEDAgUEAgMAAAAAAAABAgADBAUREgYxEyFBUZEyYXGhIoEUQrH/xAAZAQACAwEAAAAAAAAAAAAAAAADBAABAgX/xAAfEQADAQEBAQADAQEAAAAAAAAAAQIRAxIxBCFhEzL/2gAMAwEAAhEDEQA/AISqzsFUEsTsAPWWqdPZroGJqQn/AFZjv+hPHTyo2prz23Ckr+Zro927VDxC3PmqWsweTjW4tprvQqw/c5TSdUKngUN5c+RA/G0zcPzv3Og7ny8OuNjW5VoroQsx/UsX6ezUQsDU5H+qsd/2JO6XVPAvby58gD+Npexbr3qaxBY5prWfn7KyMVYEMDsQfSfJZ9Qqi6m3DbcqC35lZGpr1KYFrHhLwtNyM4nwVAUd2Y7CdsvRMvFqNjBLFHfgd9po9HVF0zH4bbFdzt7+smEAgg9vWKV+RSr+B1yTR+fxOmQFXItCfSHIH43iOi58qtem1bK24up3Bl2nUzhALMZWf1IfYfG0oYmK5zf/AEjSpz8JOdnW513iXEeXkqjsBI0RNpJLEZb0k4Odbg3eJSR5+TKexEtX6mcoRXjKr+hL7j42lDExXOKetGldL9I922vda1ljcnY7kzxETZksdN1e7AU18RZV34k7bfgyRl9Q3X1GumoU8vIty3P9SmiDfKG9aNe6SzRERCGTrjY75V6U1DdmPxNCnTWOEHiXWl/UrsB/yVegWpVqa8ztyUqD95r4p36VNYg/KE1rMXqenPp9oUtzRvpbaQpouqLU8Omrf+fLlt7CZ2H5U6hNg7SVYibpmnPqFpUNwRfqbaXL9NY5Q+HdaH9C2xH/ACc+l7U8O6rf+fLlt7iX8V7dbV4g3OJc6zB5OO+Le9No2ZT8zlLLX7Ut1N+B34qFJ+8rY5DblNi9LHhb6Vopza/GvcpUewXuZKzOnEWkti2OXA34vsd/iWWjWpbplPA/QvEj2Ikx3VELuQFUbkmI12tWMzznyYAjY7GJ0vcWX2OvZmJHzE6Aqc5OTWM+tAi5DbD3AJ+SJBiU5T+otNr4erLHtcvYxdj3JO88xEso9V2PU4etijDsQdpMfWM+xCjZDbH2AB+QJBiU5T+otNr4IiJZR2xsu/Ectj2MhPfbsf6nTJ1LLyk4X3sy+wAA/UixK8rdwvX8EREsolabif5uYlJOy92P2msTTMKtAgxqiB6soJ+TMtpGWuHnJY/0EcWPsDNiliWIHrdWQ+YIPlEvyXSr+DHJLDMa7pteG6W0Datztx9jKiXfUWdVeUopYOEO7MO2/tKSM8vThegV56/Rb6FpteY723jetDtx9zL99MwrEKHGqAPqqgH5EpOnc6qgvRcwQOd1Y9t/aaN7ErQvY6qg8ySfKKd3asPzU+TF6lif4WY9IO691P2kWTdXy1zM57E+gDip9wJCjsb5W/Ras39Gl0XSaDjLkZCCx381DeYA/EmZmkYmRSVSlKn2/iyLt5/1OOhZ9V2JXQWC21jjxJ7j3EnZmZTh0my1wPLyX1J+0Qur/wBP6NSp8mIdSjsjd1OxiLXNlrue7MSf7idEUPMREhBERIQRESEEREhBERIQRESEP//Z\">\r\n");
      out.write("		<p class=\"title\">To do Memo</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<a href=\"/TodoTeamProject/logout\"><img class=\"logOutIcon\"\r\n");
      out.write("			src=\"https://img.icons8.com/material/24/000000/exit.png\" alt=\"exit\" /></a>\r\n");
      out.write("	</header>\r\n");
      out.write("\r\n");
      out.write("	<section>\r\n");
      out.write("		<div class=\"todayToDoTitle\">메모 수정</div>\r\n");
      out.write("\r\n");
      out.write("		");

		// 수정할 메모의 코드와 내용을 받아옴
		String m_code = (String) request.getAttribute("code");
		String contents = (String) request.getAttribute("contents");
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<form id=\"updateFrm\" action=\"");
      out.print(request.getContextPath());
      out.write("/updateM\"\r\n");
      out.write("			method=\"post\">\r\n");
      out.write("			<div class=\"wrap_test\">\r\n");
      out.write("				<input type=\"hidden\" name=\"m_code\" value=\"");
      out.print(m_code);
      out.write("\">\r\n");
      out.write("				<textarea class=\"toDo\" name=\"m_contents\" rows=\"4\" cols=\"50\">");
      out.print(contents);
      out.write("</textarea>\r\n");
      out.write("				<br> <input class=\"modifybtn\" type=\"submit\" value=\"수정\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</form>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"wrapButton\">\r\n");
      out.write("			<form action=\"");
      out.print(request.getContextPath());
      out.write("/inquiryM\" method=\"post\">\r\n");
      out.write("				<input class=\"submitBtn\" type=\"hidden\" name=\"m_cc\" value=\" \">\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
