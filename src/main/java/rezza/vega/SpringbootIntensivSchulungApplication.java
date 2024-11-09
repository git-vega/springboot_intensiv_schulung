package rezza.vega;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rezza.vega.client.GreetingController;

/*
Die Klasse SpringbootIntensivSchulungApplication ist eine Hauptklasse der Spring Boot-Anwendung.
Die @SpringBootApplication Annotation markiert die Klasse als Startpunkt.
Statt den normalen SpringApplication.run() zu verwenden, wird hier der Spring-Kontext manuell mit AnnotationConfigApplicationContext erstellt. Dies erlaubt die manuelle Verwaltung und eine genauere Kontrolle darüber, welche Pakete gescannt werden.
Anschließend wird der GreetingController als Bean aus dem Kontext abgerufen und die Methode sayHello() wird aufgerufen, die die Begrüßung ausgibt.
 */

@SpringBootApplication
public class SpringbootIntensivSchulungApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(SpringbootIntensivSchulungApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext("rezza.vega");


		GreetingController controller = context.getBean(GreetingController.class);
		controller.sayHello();  // Ausgabe: Hello, World!
	}

}


