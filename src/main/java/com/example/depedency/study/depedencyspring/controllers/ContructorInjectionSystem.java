package com.example.depedency.study.depedencyspring.controllers;

import com.example.depedency.study.depedencyspring.services.HelloService;

public class ContructorInjectionSystem {
    private final HelloService helloService;
    //IDEAL E DESSA FORMA
    ContructorInjectionSystem(HelloService helloService) {
        this.helloService = helloService;
    }

    public String hello() {
        return helloService.sayHello();
    }

}
