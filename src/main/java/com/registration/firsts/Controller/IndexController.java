package com.registration.firsts.Controller;

import com.registration.firsts.Repository.UserRepository;
import com.registration.firsts.model.User;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/index")
    public String showRegistrationForm() {
        return "index"; // This should match the name of your HTML file (index.html)
    }
    @PostMapping("/register")
    public String RegistrationForm(@ModelAttribute User user, Model model){
        System.out.println(user.toString());
        model.addAttribute("username",user.getUsername());
        User user_Inserted=userRepository.save(user);
        return "wellcome";
    }
}
