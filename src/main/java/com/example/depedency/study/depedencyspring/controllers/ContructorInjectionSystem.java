package com.example.depedency.study.depedencyspring.controllers;

import com.example.depedency.study.depedencyspring.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//AGORA O SPRING QUE VAI GERENCIAR A INJEÇÃO DE DEPENDENCIA
@Controller
public class ContructorInjectionSystem {
    @Autowired
    private final HelloService helloService;
    //IDEAL E DESSA FORMA
    ContructorInjectionSystem(HelloService helloService) {
        this.helloService = helloService;
    }

    public String hello() {
        return helloService.sayHello();
    }

}
