import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class DemoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // 🔹 Form inputs
        String from = req.getParameter("from");
        String to   = req.getParameter("to");
        String sub  = req.getParameter("sub");
        String msg  = req.getParameter("msg");

        // 🔹 SMTP properties
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        try {
            // 🔹 Mail session
            Session session = Session.getInstance(props, new MyAuth());
            session.setDebug(true);

            // 🔹 Mail message
            MimeMessage message = new MimeMessage(session);

            // Gmail authenticated sender
            message.setFrom(new InternetAddress("lavishtodiwal7455@gmail.com"));

            // Reply-To user (important real-world trick)
            message.setReplyTo(new Address[]{
                new InternetAddress(from)
            });

            message.addRecipient(
                Message.RecipientType.TO,
                new InternetAddress(to)
            );

            message.setSubject(sub);

            // 🔹 Mail body
            MimeBodyPart bodyPart = new MimeBodyPart();
            bodyPart.setText(msg);

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(bodyPart);

            message.setContent(multipart);

            // 🔹 Send mail
            Transport.send(message);

            out.println("<h2>Mail Sent Successfully ✅</h2>");

        } catch (Exception e) {
            out.println("<h2>Error while sending mail ❌</h2>");
            out.println("<pre>" + e + "</pre>");
        }
    }
}
