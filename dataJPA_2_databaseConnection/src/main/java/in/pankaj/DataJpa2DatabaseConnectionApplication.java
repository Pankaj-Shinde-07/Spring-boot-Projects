package in.pankaj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.pankaj.primary.entity.Employee;
import in.pankaj.primary.repository.EmployeeRepository;

@SpringBootApplication
public class DataJpa2DatabaseConnectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DataJpa2DatabaseConnectionApplication.class, args);
		
		EmployeeRepository bean = run.getBean(EmployeeRepository.class);
		
		Employee e1 = new Employee();
		e1.setName("Pankaj");
		e1.setSalary(99999.9);
		
		bean.save(e1);
		
	}

}
