package com.example.depedency.study.depedencyspring.controllers;

import com.example.depedency.study.depedencyspring.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetDependencyController
{

    private HelloService helloService;



    //TEMOS A INJEÇÃO DE DEPENDENCIA POR MEIO DE SETTER, TBM NEM FAZ ASSIM VIU


    //E COMO CONECTAMOS O HELLO SERVICE COM O SETTER
    //SE COLOCA O AUTOWIRED NA PROPRIEDADE EMCIMA DELA NÃO FUNCIONA
    @Autowired
    public void setHelloService(HelloService helloService)
    {
        this.helloService = helloService;
    }

    public String sayHello()
    {
        return helloService.sayHello();
    }
}
