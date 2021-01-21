package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Raleway&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\"/>\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <div>\n");
      out.write("                <img src=\"Images/cover2.jpg\" alt=\"cover img\" class=\"bg-img\">\n");
      out.write("            </div>\n");
      out.write("            ");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        <div class=\"container container_1\">\n");
      out.write("             <img src=\"Images/cover3.jpg\" alt=\"background image3\" class=\"sub\"/>\n");
      out.write("             <a href=\"WhyJoin.jsp\" style=\"text-decoration: none\"><h1 style=\"color: #abdfab; font-size: 50px;\"><b>Why Join</b></h1></a>\n");
      out.write("            <div class=\"div2\">\n");
      out.write("                <p class=\"p1\"><b>\n");
      out.write("                At Fitness Club YOUR HEALTH IS OUR PRIORITY.\n");
      out.write("                Fitness Club is one of a kind fitness club with warm,\n");
      out.write("                positive and inviting ambiance, top of the class equipments,\n");
      out.write("                Qualified and friendly professional staff, clean, stylish and\n");
      out.write("                comfortable hassle free facility with lots of happy people.\n");
      out.write("            </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("            <div class=\"container container_2\"><br>\n");
      out.write("            <img src=\"Images/cover.jpg\" alt=\"baground image2\" class=\"sub\"/>\n");
      out.write("            <div class=\"our\">\n");
      out.write("                <h2 style=\"color: #ff4274; font-size: 50px;\">Our Achievements</h2>\n");
      out.write("                <p class=\"p2\">\n");
      out.write("                    Doing those basic exercises in Park/home and doing exercises in gym is pretty different. It's like asking “why should I learn about kung fu, when I can do martial arts”.<br>\n");
      out.write("\n");
      out.write("                    Usually what people think is “gym is all about bodybuilding, big people, steroids, bad people” it's just a typical stereotypical mindset.<br>\n");
      out.write("\n");
      out.write("                    Gym are of different types, then they provide different type of exercises, different weights, machines. All you're are doing in Park/home is 5%. You can find 95% different way in gym to do whatever your goal is, with your body.<br>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div><br>\n");
      out.write("        <br>\n");
      out.write("       <div class=\"container\">\n");
      out.write("        <div class=\"sub-container-1\">\n");
      out.write("            <div class=\"container-sub col-sm-6 boxing\">\n");
      out.write("                <a href=\"Services.jsp#s1\"><img src=\"Images/boxing.png\" alt=\" \" class=\"services-img\"/></a>\n");
      out.write("                <h4>Boxing</h4>\n");
      out.write("                <p>A boxer is always armed.</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"container-sub col-sm-6 aerobics\">\n");
      out.write("                <a href=\"Services.jsp#s2\"><img src=\"Images/aerobics.png\" alt=\" \" class=\"services-img\"/></a>\n");
      out.write("                <h4>Aerobics</h4>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <p>Inactive people have a low aerobic capacity to begin with.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"sub-container-2\">\n");
      out.write("            <div class=\"container-sub col-sm-6 cardio\">\n");
      out.write("                <a href=\"Services.jsp#s3\"><img src=\"Images/cardio.png\" alt=\" \" class=\"services-img\"/></a>\n");
      out.write("                <h4>Cardio</h4>\n");
      out.write("                <p>Cardio Is Hardio.</p>\n");
      out.write("                ");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"container-sub col-sm-6 yoga\">\n");
      out.write("                <a href=\"Services.jsp#s4\"><img src=\"Images/yoga.png\" alt=\" \" class=\"services-img\"/></a>\n");
      out.write("                <h4>Yoga</h4>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <p>Yoga Helps You in Maintaining Balance in Life.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"sub-container-3\">\n");
      out.write("            <div class=\"container-sub col-sm-6 crossfit\">\n");
      out.write("                <a href=\"Services.jsp#s5\"><img src=\"Images/crossfit.png\" alt=\" \" class=\"services-img\"/></a>\n");
      out.write("                <h4>CrossFit</h4>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <p>All progress takes place outside the comfort zone.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-sub col-sm-6 personal-training\">\n");
      out.write("                <a href=\"Services.jsp#s6\"><img src=\"Images/personaltrainer.png\" alt=\" \" class=\"services-img\"/></a>\n");
      out.write("                <h4>Personal Training</h4>\n");
      out.write("                <p>Well done is better than well said.</p>\n");
      out.write("                ");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>   \n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
