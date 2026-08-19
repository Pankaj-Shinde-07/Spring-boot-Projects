package in.pankaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.pankaj.entity.CourseEntity;
import in.pankaj.entity.TimingEntity;
import in.pankaj.entity.UserEntity;
import in.pankaj.service.CourseService;
import in.pankaj.service.TimingService;
import in.pankaj.service.UserService;

@Controller
public class WebController {
	
	@Autowired
	UserService us;
	
	@Autowired
	TimingService ts;
	
	@Autowired
	CourseService cs;
	
	@GetMapping("/")
	public String getForm(Model model) {
		UserEntity newUser = new UserEntity();
		
		List<CourseEntity> allCourse = cs.getAllCourse();
		List<TimingEntity> allTiming = ts.getAllTiming();
		model.addAttribute("user", newUser);
		model.addAttribute("courses", allCourse);
		model.addAttribute("timings", allTiming);
		return "index";
	}
	
	@PostMapping("/register")
	public String doRegister(@ModelAttribute("user") UserEntity user, Model model) {
		
		System.out.println(user);
		return "index";
	}

}
