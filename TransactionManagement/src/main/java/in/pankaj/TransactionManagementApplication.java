package in.pankaj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.pankaj.service.EmpService;

@SpringBootApplication
public class TransactionManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TransactionManagementApplication.class, args);
		
		EmpService service = context.getBean(EmpService.class);
		
		service.saveData();
	}

}
