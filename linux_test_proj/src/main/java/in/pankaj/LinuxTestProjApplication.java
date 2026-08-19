package in.pankaj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LinuxTestProjApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(LinuxTestProjApplication.class, args);
		
		ServiceClass bean = run.getBean(ServiceClass.class);
		
		bean.welcomeMsg();
	}

}
