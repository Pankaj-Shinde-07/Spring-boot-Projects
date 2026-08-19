package in.pankaj.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import in.pankaj.entity.UserEntity;
import in.pankaj.service.UserService;

@Controller
public class SignUpController {

//    @GetMapping("/")
//    public String home() {
//        return "signup";
//    }
	
	@Autowired
    private UserService us;

    @PostMapping("/register")
    public String register(UserEntity user, Model model) {

        System.out.println(user);
        
        
        us.saveUser(user);

        model.addAttribute("successMsg",
                "Registration Successful!");

        return "signup";
    }

}