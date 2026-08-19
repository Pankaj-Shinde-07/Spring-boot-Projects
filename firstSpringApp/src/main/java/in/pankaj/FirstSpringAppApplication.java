package in.pankaj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.pankaj.service.UserService;

@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstSpringAppApplication.class, args);
		
		UserService service = context.getBean(UserService.class);
		
		service.getName(23);
	}

}
