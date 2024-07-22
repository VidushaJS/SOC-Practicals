package edu.soc.hello_soc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DemoController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to SpringBoot !";
    }

    @GetMapping("/hi")
    public String getMethodName(@RequestParam String name) {
        return "Hi " + name;
    }
    
     
}
