package in.pankaj.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import in.pankaj.service.EmailService;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private TemplateEngine templateEngine;

	@Override
	public boolean sendWelcomeEmail(String to, String name) {

		try {

			MimeMessage message = mailSender.createMimeMessage();

			MimeMessageHelper helper = new MimeMessageHelper(message, true);

			helper.setTo(to);

			helper.setSubject("Welcome to User Registration System");

			Context context = new Context();

			context.setVariable("name", name);
			
			String html = templateEngine.process("emails/welcome-email", context);

			helper.setText(html, true);

			mailSender.send(message);

			return true;

		} catch (Exception e) {

			e.printStackTrace();

			return false;
		}

	}

}

//SimpleMailMessage message = new SimpleMailMessage();			
//message.setTo(to);
//
//message.setSubject("Registration Successful");
//
//
//message.setText(
//		"Hello " + name + " , \n\n"
//		+ "Welcome to our application .\n\n"
//		+ "Your registration was completed successfully.\n\n"
//		+ "Thank You..!"
//		);
//mailSender.send(message);