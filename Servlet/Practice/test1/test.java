import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class test implements Servlet {
    public void init(ServletConfig config) {
    }

    // services
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><body>");
        out.println("<h1>Hello using the test file</h1>");
        out.println("</body></html>");
    }

    public void destroy() {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public String getServletInfo() {
        return "Test servlet version 1.0";
    }
}
