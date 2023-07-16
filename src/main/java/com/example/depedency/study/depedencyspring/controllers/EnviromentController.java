package com.example.depedency.study.depedencyspring.controllers;

import com.example.depedency.study.depedencyspring.services.EnviromentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnviromentController {


    private final EnviromentService enviromentService;
    @Autowired
    EnviromentController(@Qualifier("EnviromentService") EnviromentService enviromentService) {
        this.enviromentService = enviromentService;
    }

    public String getEnviroment() {
        return this.enviromentService.getEnviroment();
    }
}
