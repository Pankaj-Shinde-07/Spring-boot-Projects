package in.pankaj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    
    @GetMapping("/greet")
    public ModelAndView sayHi() {
    	
    	ModelAndView mav = new ModelAndView();
    	
    	mav.addObject("msg", "HI good Morning");
    	
    	mav.setViewName("hello");
    	
    	
    	return mav;
    }

}