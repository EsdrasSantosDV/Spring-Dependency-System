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


}
