import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;


class MyAuth extends Authenticator {
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(
            "lavishtodiwal7455@gmail.com",
            "uxmi moby ghbz xmup"
        );
    }
}
