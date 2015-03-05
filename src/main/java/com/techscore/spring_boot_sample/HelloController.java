package com.techscore.spring_boot_sample;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
@EnableAutoConfiguration
public class HelloController {
 
    @RequestMapping("/")
    public String home() {
        return "/hello";
    }
 
    public static void main(String[] arguments) {
        SpringApplication.run(HelloController.class, arguments);
    }
 
}
