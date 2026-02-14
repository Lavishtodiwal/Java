import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.security.MessageDigest;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class DemoServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String to = "lavishtodiwal7455@gmail.com";
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        try {
            Session session = Session.getInstance(props, new MyAuth());
            session.setDebug(true);
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("lavishtodiwal7455@gmail.com"));
            message.addRecipient(
                    Message.RecipientType.TO,
                    new InternetAddress(to));

            message.setSubject("first servlet mail");

            Multipart body = new MimeMultipart();
            MimeBodyPart part1 = new MimeBodyPart();
            part1.setText("this is a first mail via servlet");
            body.addBodyPart(part1);
            message.setContent(body);

            Transport.send(message);
            out.println("message sent Successfully");
        } catch (Exception e) {
            e.printStackTrace(); // FULL ERROR
        }

        out.println("<html><body>");
        out.println("<br>");
        out.println("<h1>mail sent successfully</h1>");
        out.println("</body></html>");
    }
}