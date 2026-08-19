package in.pankaj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to secure rest api";
	}
	
	@GetMapping("/employee")
	public String employee() {
		return "Employee Details";
	}
}
