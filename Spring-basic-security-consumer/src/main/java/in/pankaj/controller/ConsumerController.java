package in.pankaj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pankaj.service.ConsumerService;

@RestController
public class ConsumerController {

	@Autowired
	private ConsumerService service;
	
	@GetMapping("/rest")
	public String restTemplateDemo() {
		return service.callUsingRestTemplate();
	}
	
	@GetMapping("/web")
	public String webClientDemo() {
		return service.callUsingWebClient();
	}
}
