package in.pankaj;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.pankaj.entity.DemoGeneratorEntity;
import in.pankaj.repo.ContactUsRepo;
import in.pankaj.repo.CustomGeneratorRepo;

@SpringBootApplication
public class DataJpaAppl2Application {

	private final CustomGeneratorRepo customGeneratorRepo;

	DataJpaAppl2Application(CustomGeneratorRepo customGeneratorRepo) {
		this.customGeneratorRepo = customGeneratorRepo;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaAppl2Application.class, args);
		
//		ContactUsRepo bean = context.getBean(ContactUsRepo.class);
//		
//		ContactUsEntity cue = new ContactUsEntity();
//		
//		cue.setCemail("sample@mail");
//		cue.setCname("Shinde");
//		cue.setCpwd("999");
//		
//		bean.save(cue);
		
		CustomGeneratorRepo bean = context.getBean(CustomGeneratorRepo.class);
		
		DemoGeneratorEntity d1 = new DemoGeneratorEntity();
		d1.setAge(11);
		d1.setName("Shinde");
		
		bean.save(d1);
		
		bean.insertData("d029", "Panku", 45);
		
		
		
		ArrayList<DemoGeneratorEntity> allRecords = bean.getAllRecords();
		
		allRecords.forEach(System.out::println);
		
		
		
		
		
	}

}
