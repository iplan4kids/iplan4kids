package gr.ntua.ece.softeng17b.data;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.Properties;

public class Emailer {

    private String from;
    private Session session;

    public void setup(boolean auth, boolean enable, String host, int port , String username, String password, String from) {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", auth);
        properties.put("mail.smtp.starttls.enable", enable);
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        this.session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        this.from = from;
    }

    public boolean sendEmail(String to, String subject, String text, String msg){
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));
            message.setSubject(subject);

            BodyPart part1=new MimeBodyPart();
            part1.setText(msg);


            File file=new File("/home/mano/temp/Myfile.doc");
            BodyPart part2=new MimeBodyPart();
            DataSource attachment=new FileDataSource(file);
            part2.setDataHandler(new DataHandler(attachment));
            part2.setFileName(file.getName());


            Multipart multiPart=new MimeMultipart();
            multiPart.addBodyPart(part1);
            multiPart.addBodyPart(part2);

            message.setContent(multiPart);

            Transport.send(message);
            System.out.println("Message with attachment sent successfully....");
            return true;
        } catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }
    }
}
