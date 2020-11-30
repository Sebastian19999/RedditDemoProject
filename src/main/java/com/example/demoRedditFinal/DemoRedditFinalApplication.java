package com.example.demoRedditFinal;

import com.example.demoRedditFinal.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

/*
Dacă verificați marca de timp, avem o întârziere de mai mult de 10 secunde pentru a trimite e-mailul, ceea ce înseamnă că,
 chiar dacă înregistrarea este finalizată, utilizatorul trebuie să aștepte încă 10 secunde pentru a vedea răspunsul.
 Chiar dacă nu este mult timp, în situația reală ar trebui să gestionăm funcționalitatea de trimitere a e-mailului în mod asincron,
  o putem gestiona și folosind o coadă de mesaje precum RabbitMQ sau ActiveMQ, dar cred că ar fi un exces pentru cazul nostru
  de utilizare. Să activăm modulul Async în primăvară adăugând @EnableAsync la clasa noastră principală

  De asemenea, adăugați @Async la metoda noastră sendMail din clasa MailService. Iată cum arată clasa noastră MailService:
 */

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class DemoRedditFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRedditFinalApplication.class, args);
	}

}
