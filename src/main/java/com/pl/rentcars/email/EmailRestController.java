package com.pl.rentcars.email;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pl.rentcars.email.EmailService;


@RestController
public class EmailRestController {
	//todo
	//skonfigurowac serwer zainstalowac serwer mailowy
	//modul do szablonow maili template - wa bazie tabela table template
	//maile jako html lub jako zwykly txt
	//modul Message = bo bedziemy wysylac tez smsy
	//tworzenie linkow aktywacyjnych - osobna paczka - oprocz logowania wysylanie linkow aktywacyjnych
	//link aktywacyjny 24h- dzialajacy
	//jak uzytkownik kliknie w link to przekierowanie do strony
	//jak kliknie w link to token ma byc spalony
    //MODUL Template , content w zaleznosci od szablonu - np zielony dal firm itd
	//content tresc maila jesli mam zielony itd
	//Recipient trzymamy tam 
	//MODUL - tworzenie excela
	
	@Autowired
	private EmailService emailService;
	
	@GetMapping("send-email")
	public ResponseEntity sendEmail() throws MessagingException {
		String email = "kazmierczak.oktawia@gmail.com";
		String title= "Report";
		String message = "Content";
		emailService.sendEmail(email, title, message);
		return ResponseEntity.ok().build();
	}
	
}