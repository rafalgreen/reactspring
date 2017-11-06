package com.pl.rentcars.email;

import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service
public class EmailService {

//    @Autowired
//    private JavaMailSender javaMailSender;

    public void sendEmail(String to, String subject, String body) throws MessagingException {

//        MimeMessage message = javaMailSender.createMimeMessage();
//        MimeMessageHelper helper;
//        helper = new MimeMessageHelper(message, true);
//        helper.setSubject(subject);
//        helper.setTo(to);
//        helper.setText(body, true);
//
//        javaMailSender.send(message);

    }
}

