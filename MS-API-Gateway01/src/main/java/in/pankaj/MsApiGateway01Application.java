package in.pankaj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsApiGateway01Application {

	public static void main(String[] args) {
		SpringApplication.run(MsApiGateway01Application.class, args);
	}

}
