import java.util.Properties;
import jakarta.mail.*;
import jakarta.mail.internet.*;

public class Email {

    public static boolean sendMail(String toEmail, String subject, String messageText) {

        final String fromEmail = "kbc.console.java@gmail.com";        // your Gmail
        final String password = "yvqh mhxa mrhf vusw";            // Gmail App Password

        // SMTP configuration
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        try {
            // Create session with authentication
            Session session = Session.getInstance(props,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(fromEmail, password);
                    }
                });

            // Create message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(toEmail)
            );

            message.setSubject(subject);
            message.setText(messageText);

            // Send email
            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (Exception e) {
            System.out.println("Error sending email: " + e.getMessage());
            return false;
        }
        
        return true;
    }
}