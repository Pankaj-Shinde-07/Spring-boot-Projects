package in.pankaj.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pankaj.client.WelcomeApiClient;

@RestController
public class GreetController {
	
	@Autowired
	private WelcomeApiClient welcomeClient;
	
	@GetMapping("/greet")
	public String greet() {
		String s = "Good Evening, ";
		
		String msg;
		try {
			msg = welcomeClient.invokeWelcomeMsg();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			msg="error";
			e.printStackTrace();
		}
		return s.concat(msg);
	}

}
