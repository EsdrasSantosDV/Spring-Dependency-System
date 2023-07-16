package com.example.depedency.study.depedencyspring.controllers;

import com.example.depedency.study.depedencyspring.services.HelloServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetDependencyControllerTest {

    SetDependencyController setDependencyController;

    @BeforeEach
    void setup(){
        setDependencyController = new SetDependencyController();
        setDependencyController.setHelloService(new HelloServiceImpl());
    }


    @Test
    void hello()
    {
        System.out.println(setDependencyController.sayHello());
    }

}