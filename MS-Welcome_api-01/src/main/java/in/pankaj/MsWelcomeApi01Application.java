package in.pankaj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsWelcomeApi01Application {

	public static void main(String[] args) {
		SpringApplication.run(MsWelcomeApi01Application.class, args);
	}

}
