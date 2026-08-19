package in.pankaj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ConsumerService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient webClient;
	
	private final String URL = "http://localhost:8081/employee";
	
	public String callUsingRestTemplate() {
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.setBasicAuth("pankaj","12345");
		
		HttpEntity<Object> entity = new HttpEntity<>(headers);
		
		ResponseEntity<String> response = 
				restTemplate.exchange(
							URL,
							HttpMethod.GET,
							entity,
							String.class);
		
		return response.getBody();
		
		
		
	}
	
	public String callUsingWebClient() {
		return webClient.get()
						.uri(URL)
						.headers(h->h.setBasicAuth("pankaj","12345"))
						.retrieve()
						.bodyToMono(String.class)
						.block();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
