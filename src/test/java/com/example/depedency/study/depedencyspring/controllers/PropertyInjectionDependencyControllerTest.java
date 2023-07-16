package com.example.depedency.study.depedencyspring.controllers;

import com.example.depedency.study.depedencyspring.services.HelloServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyInjectionDependencyControllerTest
{


    @Autowired
    PropertyInjectionDependencyController propertyInjectionDependencyController;


    @Test
    void hello()
    {
        System.out.println(propertyInjectionDependencyController.hello());
    }

}