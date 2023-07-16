package com.example.depedency.study.depedencyspring.controllers;

import com.example.depedency.study.depedencyspring.services.HelloService;
import com.example.depedency.study.depedencyspring.services.HelloServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    //SEM INJEÇÃO DE DEPENDENCIA
    private final HelloService helloService;

    MyController() {
        //USANDO A PROPRIA INSTANCIA DA IMPLEMENTAÇÃO DO HELLO SERVICE
        //E DE FORMA CONCRETA
        //FOGE DE TUDO DO SOLID, A RESP
        this.helloService = new HelloServiceImpl();
    }

    public String hello() {
        return helloService.sayHello();
    }

    public String sayHello(){
        System.out.println("I'm in the controller");

        return "Hello Folks";
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
