package com.example.testdocker.Container;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloContainer {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Võ Minh Đức");
        return "index"; // This maps to index.html in the templates folder
    }
}
