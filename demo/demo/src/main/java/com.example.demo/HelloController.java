package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //Calc obj=new Calc();
    @Autowired
     Calc obj;
    @GetMapping("/")
    public String greet()
    { int i=8;
        int j=4;
        return "Hello World" +obj.add(i,j);
    }
}



