package in.pankaj;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.pankaj.dto.EmployeeDTO;
import in.pankaj.entity.EmployeeEntity;
import in.pankaj.repo.EmployeeRepo;
import in.pankaj.repo.EmployeeView;

@SpringBootApplication
public class DataJpaApplAss03Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaApplAss03Application.class, args);
		
		EmployeeRepo bean = context.getBean(EmployeeRepo.class);
		
		EmployeeEntity e1 = new EmployeeEntity();
		e1.setId("101");
		e1.setName("Pankaj");
		e1.setEmail("demo@email");
		e1.setPhone("12345678");
		e1.setAddress("yeola");
		e1.setDepartment("IT");
		LocalDate now = LocalDate.now();
		e1.setJoiningDate(now);
		e1.setSalary(789899.56);
		
		bean.save(e1);
		
		List<EmployeeView> list = bean.getEmployees();
		list.forEach(i->System.out.println(i.getId() +"  " + i.getName()));
		
		System.out.println("----------- dto onwards ------------");
		List<EmployeeDTO> dto = bean.getEmployeeDTO();
		
		dto.forEach(System.out::println);
		
	}

}
