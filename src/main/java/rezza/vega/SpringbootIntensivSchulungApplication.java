package rezza.vega;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootIntensivSchulungApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootIntensivSchulungApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			Car car = ctx.getBean(Car.class);
			car.start();
		};
	}
}
