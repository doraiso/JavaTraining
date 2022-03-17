/**
 * JavaMailSample.java
 * debuged, but not exec.
 */

package algorithm;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.net.ssl.SSLSession;

public class JavaMailSample {

	private static final String STRING = Algorithm.RECIPIENTTYPE.toString();
	private static final String InternetAddress = null;

	private final class AuthenticatorExtension extends javax.mail.Authenticator {
	}

	public JavaMailSample() {
	}

	public static void main(String[] args) {
		JavaMailSample mailSend = new JavaMailSample();
		mailSend.send("JavaMail テストメール", "テストメールの本文");
	}

	public void send(String subject, String content) {

	    final String to = "mailaddress@hogehoge.co.jp";
	    final String from = "mailaddress@hogehoge.co.jp";

	    // Google account mail address
	    final String username = "mailaddress@hogehoge.co.jp";
	    // Google App password
	    final String password = "hogehoge";

	    //final String charset = "ISO-2022-JP";
	    final String charset = "UTF-8";
	    final String encoding = "base64";

	    // for gmail
	    String host = "smtp.gmail.com";
	    String port = "587";
	    String starttls = "true";

	    // for local
	    //String host = "localhost";
	    //String port = "2525";
	    //String starttls = "false";

	    Properties props = new Properties();
	    props.put("mail.smtp.host", host);
	    props.put("mail.smtp.port", port);
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", starttls);

	    props.put("mail.smtp.connectiontimeout", "10000");
	    props.put("mail.smtp.timeout", "10000");

	    props.put("mail.debug", "true");

		SSLSession session = getInstance(props,
		new AuthenticatorExtension());

	    try {
	      MimeMessage message = new MimeMessage();

	      // Set From:
	      message.setFrom(new InternetAddress());
	      // Set ReplyTo:
	      message.setReplyTo(new Address[]{(nternetAddress())});

		  setRecipient(STRING, InternetAddress);
	      message.setSubject(subject, charset);
	      extracted(content, charset, message);

	      message.setHeader("Content-Transfer-Encoding", encoding);

		  send(message);

	    } catch (Exception e) {
			e.printStackTrace();
	}

	private void setRecipient(String string2, String internetaddress2) {
		message.setRecipient(string2, new InternetAddress());
	}

	private void extracted(String content, final String charset, MimeMessage message) {
		message.setText(content, charset);
	}

	private Address nternetAddress() {
		return null;
	}

	private void send(MimeMessage message) {
	}

	private SSLSession getInstance(Properties props, Authenticator authenticator) {
		return null;
	}
}