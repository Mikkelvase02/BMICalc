package com.example.demo.MyController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping ("/homepage")
    public String home() {return "homepage";}

    @GetMapping("/")

    public String welcome() {
        return "calculator" ;
    }



    @PostMapping("/calc")
    public String calculator( @RequestParam double weight , @RequestParam double height , Model model ) {
        double bmiresult = (weight / (height * height)) ;
        model.addAttribute("calc" , bmiresult);
        return "result" ;
    }

}
