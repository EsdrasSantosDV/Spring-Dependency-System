package com.example.depedency.study.depedencyspring.controllers;

import com.example.depedency.study.depedencyspring.services.HelloServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectionDependencyControllerTest
{

    PropertyInjectionDependencyController propertyInjectionDependencyController;

    @BeforeEach
    void setup(){
        propertyInjectionDependencyController = new PropertyInjectionDependencyController();
        propertyInjectionDependencyController.helloService=new HelloServiceImpl();
    }

    //ESSE E O JEITO DE FAZER A DEPENDENCIA POR PROPRIEDADE
    @Test
    void hello()
    {
        System.out.println(propertyInjectionDependencyController.hello());
    }

}