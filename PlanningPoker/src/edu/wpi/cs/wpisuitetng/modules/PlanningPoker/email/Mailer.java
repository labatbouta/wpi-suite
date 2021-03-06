package edu.wpi.cs.wpisuitetng.modules.PlanningPoker.email;

/**
 * This class creates a mailer object.  This object has functions for adding 
 * recipients, and sending the email which consists of the following text:
 * 
 * Subject: WPI-Suite: Planning Poker
 * Contents: A Planning Poker session has begun.
 */

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author Alec Thompson
 * @author Long Nguyen
 * 
 */
public class Mailer {
	private Session session;
	private MimeMessage message;
	private Transport transport;

	// test information
	private String host = "mailtrap.io";
	private String login = "structbylightning-17dcc3f2b944376c";
	private String pass = "ce1a24cb171342c3";

	private final boolean DEBUG = true;

	public Mailer() {
		session = createSmtpSession();
		session.setDebug(true);
		message = new MimeMessage(session);

		try {
			// testing
			if (DEBUG)
				transport = session.getTransport("smtp");
			// release
			String from = "struct.by.lightning@gmail.com";

			// set the message to be from struct by lightning
			message.setFrom(new InternetAddress(from));

			// set the header line
			message.setSubject("Great news ladies and gentlemen!");
			message.setText("Our favorite past time in which we predict the effort in which we must exert our fingers and minds has begun anew! I request that all ye whom have felt the stern blow of Thor's mighty hammer attend the session, so we may reach a general consensus!");
		} catch (MessagingException mex) {
			System.out.println("Message creation failed");
			mex.printStackTrace();
		}
	}

	/**
	 * Alternate constructor that takes an email as a parameter
	 * 
	 * @param emailAddress
	 *            Hard-coded email address
	 */
	public Mailer(String emailAddress) {
		session = createSmtpSession();
		session.setDebug(true);
		message = new MimeMessage(session);

		try {
			// testing
			if (DEBUG)
				transport = session.getTransport("smtp");
			// release
			String from = "struct.by.lightning@gmail.com";

			// set the message to be from struct by lightning
			message.setFrom(new InternetAddress(from));

			// set the header line
			message.setSubject("Great news ladies and gentlemen!");
			message.setText("Our favorite past time in which we predict the effort in which we must exert our fingers and minds has begun anew! I request that all ye whom have felt the stern blow of Thor's mighty hammer attend the session, so we may reach a general consensus!");
			this.addEmail(emailAddress);
		} catch (MessagingException mex) {
			System.out.println("Message creation failed");
			mex.printStackTrace();
		}
	}

	/**
	 * Alternate constructor that takes an array of email addresses as a
	 * parameter
	 * 
	 * @param emailAddress
	 *            Hard-coded email address
	 */
	public Mailer(String[] emailArray) {
		session = createSmtpSession();
		session.setDebug(true);
		message = new MimeMessage(session);

		try {
			if (DEBUG)
				transport = session.getTransport("smtp");
			String from = "struct.by.lightning@gmail.com";

			// set the message to be from struct by lightning
			message.setFrom(new InternetAddress(from));

			// set the header line
			message.setSubject("Great news ladies and gentlemen!");
			message.setText("Our favorite past time in which we predict the effort in which we must exert our fingers and minds has begun anew! I request that all ye whom have felt the stern blow of Thor's mighty hammer attend the session, so we may reach a general consensus!");
			this.addEmailArray(emailArray);
		} catch (MessagingException mex) {
			System.out.println("Message creation failed");
			mex.printStackTrace();
		}
	}

	/**
	 * Creates an SMTP session, configured for using the Google SMTP server with
	 * the Struct by Lightning gmail account being used to send the emails
	 * 
	 * @return Google SMTP session
	 */
	private Session createSmtpSession() {
		// final version settings
		if (DEBUG) {
			// test with mailtrap
			Properties props = System.getProperties();
			props.put("mail.smtp.host", host);
			props.put("mail.smtp.user", login);
			props.put("mail.smtp.password", pass);
			props.put("mail.smtp.port", "2525");
			props.put("mail.smtp.auth", "true");

			return Session.getDefaultInstance(props);
		} else {
			final Properties props = new Properties();
			props.setProperty("mail.smtp.host", "smtp.gmail.com");
			props.setProperty("mail.smtp.auth", "true");
			props.setProperty("mail.smtp.port", "" + 587);
			props.setProperty("mail.smtp.starttls.enable", "true");
			props.setProperty("mail.transport.protocol", "smtp");

			return Session.getDefaultInstance(props,
					new javax.mail.Authenticator() {

						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(
									"struct.by.lightning@gmail.com",
									"Donthackthis!12358");
						}
					});
		}
	}

	/**
	 * Sends the email to the added recipients
	 * 
	 * @return true if the email sends, false otherwise
	 */
	public boolean send() {
		try {
			if (DEBUG)
				transport.connect(host, login, pass);
			// send the message
			System.out.println("Ready to send message");
			// testing
			if (DEBUG) {
				transport.sendMessage(message, message.getAllRecipients());
			} else { // release
				Transport.send(message);
			}
			System.out.println("Sent message successfully");
			if (DEBUG)
				transport.close();
			return true;
		} catch (MessagingException mex) {
			System.out.println("Send failed");
			mex.printStackTrace();
			return false;
		}
	}

	/**
	 * Adds a recipient to the Mailer object
	 * 
	 * @param recipient
	 *            The target's email address
	 * @return true if the recipient is added, false otherwise
	 */
	public boolean addEmail(String recipient) {
		try {
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
					recipient));
			return true;
		} catch (MessagingException mex) {
			System.out.println("Recipient not added");
			mex.printStackTrace();
			return false;
		}
	}

	/**
	 * Adds multiple recipients to the mailer object from an array
	 * 
	 * @param recArr
	 *            Array of email addresses (strings!)
	 * @return true if all addresses were added successfully, false otherwise
	 */
	public boolean addEmailArray(String[] recArr) {
		boolean isSuccess = true;
		for (String s : recArr) {
			isSuccess &= this.addEmail(s);
		}
		return isSuccess;
	}
}
