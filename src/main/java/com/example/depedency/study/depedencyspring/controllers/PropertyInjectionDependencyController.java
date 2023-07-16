package com.example.depedency.study.depedencyspring.controllers;

import com.example.depedency.study.depedencyspring.services.HelloService;

class PropertyInjectionDependencyController
{
    HelloService helloService;
    //AQUI A INJEÇÃO DE DEPENDENCIA E FEITA PELA PROPRIEDADE, NUNCA FAÇA ASSIM

    public String hello()
    {
        return helloService.sayHello();
    }
}
