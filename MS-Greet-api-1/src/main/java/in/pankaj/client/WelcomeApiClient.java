package in.pankaj.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="MS-WELCOME-API-01")
public interface WelcomeApiClient {
	
	@GetMapping("/welcome")
	public String invokeWelcomeMsg();

}
