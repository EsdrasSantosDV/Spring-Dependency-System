package com.example.depedency.study.depedencyspring.controllers;

import com.example.depedency.study.depedencyspring.services.HelloServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


//PRECISAMOS COLOCAR TAMBNEM O CONTEXTO DO SPRING BOOT TESTE
@SpringBootTest
class SetDependencyControllerTest {

    @Autowired
    SetDependencyController setDependencyController;


    @Test
    void hello()
    {
        System.out.println(setDependencyController.sayHello());
    }

}