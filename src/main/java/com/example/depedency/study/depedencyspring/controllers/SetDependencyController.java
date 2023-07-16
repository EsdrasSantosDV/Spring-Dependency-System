package com.example.depedency.study.depedencyspring.controllers;

import com.example.depedency.study.depedencyspring.services.HelloService;

public class SetDependencyController
{
    private HelloService helloService;


    //TEMOS A INJEÇÃO DE DEPENDENCIA POR MEIO DE SETTER, TBM NEM FAZ ASSIM VIU
    public void setHelloService(HelloService helloService)
    {
        this.helloService = helloService;
    }

    public String sayHello()
    {
        return helloService.sayHello();
    }
}
