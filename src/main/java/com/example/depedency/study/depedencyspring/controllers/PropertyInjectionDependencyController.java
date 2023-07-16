package com.example.depedency.study.depedencyspring.controllers;

import com.example.depedency.study.depedencyspring.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
class PropertyInjectionDependencyController
{

    @Autowired
    HelloService helloService;
    //AQUI A INJEÇÃO DE DEPENDENCIA E FEITA PELA PROPRIEDADE, NUNCA FAZ

    public String hello()
    {
        return helloService.sayHello();
    }
}
