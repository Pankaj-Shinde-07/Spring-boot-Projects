package in.pankaj;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.pankaj.service.EmployeeService;

@SpringBootApplication
public class DataJpaStoredProcedureApplication {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaStoredProcedureApplication.class, args);
		
		EmployeeService bean = context.getBean(EmployeeService.class);
		
		
		bean.saveEmployee("Pankaj", 99999.99);
		bean.saveEmployee("Shinde", 99999.99);
		bean.saveEmployee("Om", 99999.99);
		bean.saveEmployee("Atharv", 99999.99);
		bean.saveEmployee("CHaitya", 99999.99);
		
		bean.exportExcel();
		
	}

}
