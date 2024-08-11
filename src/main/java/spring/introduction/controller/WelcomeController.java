package spring.introduction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WelcomeController {

    @GetMapping("/hello")
    public String getWelcomePage(Model model) {
        model.addAttribute("data", "hello!!");
        return "welcome";
    }

}
