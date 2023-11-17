package com.example.service01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service01")
@Slf4j
public class Service01Controller {

    Environment env;

    @Autowired
    public Service01Controller(Environment env){
        this.env = env;
    }

    @GetMapping("/welcome01")
    public String welcome() {
        return "Welcome to the Second service.";
    }


}
