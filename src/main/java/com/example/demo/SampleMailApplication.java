package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SampleMailApplication {
	@Autowired
	private MailService senderService;

	public static void main(String[] args) {
		SpringApplication.run(SampleMailApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
    public void sendMail() {
        senderService.sendEmail("selvak070@gmail.com", "Your mail is hacked", "Hacked by ravi");
    }

}
