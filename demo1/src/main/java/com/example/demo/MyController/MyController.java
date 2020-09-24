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
       // model.addAttribute("msg" , "Hello " + name );
        return "calculator" ;
    }



    @PostMapping("/calc")
    public String calculator( @RequestParam int num1 , @RequestParam int num2 , Model model ) {
        int num3 = num1 + num2;
        model.addAttribute("calc" , num3);
        return "result" ;
    }

}
