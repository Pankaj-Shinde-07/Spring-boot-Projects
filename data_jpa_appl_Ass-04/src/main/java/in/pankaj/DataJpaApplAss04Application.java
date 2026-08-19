package in.pankaj;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.pankaj.service.ImageService;

@SpringBootApplication
public class DataJpaApplAss04Application {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaApplAss04Application.class, args);
		
		ImageService bean = context.getBean(ImageService.class);
		
		String img = bean.uploadImage("D:\\Java learning\\dummy data\\pics\\siyaLittle.jpg");
		
		System.out.println(img);
	}

}
