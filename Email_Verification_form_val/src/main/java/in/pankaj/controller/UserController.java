package in.pankaj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.pankaj.entity.UserEntity;
import in.pankaj.service.UserService;
import jakarta.validation.Valid;
@Controller
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    public String loadForm(Model model) {

        model.addAttribute("user", new UserEntity());

        return "register";
    }

    @PostMapping("/register")
    public String registerUser(
            @Valid @ModelAttribute("user") UserEntity user,
            BindingResult result,
            Model model) {

    		//BindingResult must immediately follow the validated object.
        // Validation check
        if (result.hasErrors()) {
            return "register";
        }
        
        // Business Validation
        if (service.emailExists(user.getEmail())) {

            result.rejectValue(
                    "email",
                    "email.exists",
                    "Email already registered");

            return "register";
        }
        
        /**
         * result.rejectValue(
        "fieldName",
        "errorCode",
        "Error Message");
        */

        service.saveUser(user);

        model.addAttribute("successMsg", "Registration Successful");

        return "register";
    }

}