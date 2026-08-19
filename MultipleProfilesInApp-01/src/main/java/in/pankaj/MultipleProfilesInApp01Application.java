package in.pankaj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.pankaj.entity.StudentEntity;
import in.pankaj.repo.StudentRepo;

@SpringBootApplication
public class MultipleProfilesInApp01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MultipleProfilesInApp01Application.class, args);
		
		StudentRepo bean = context.getBean(StudentRepo.class);
		
		StudentEntity  s1 = new StudentEntity();
		
		s1.setName("Pankaj");
		s1.setSal(898.89);
		
		bean.save(s1);
		
	}

}
