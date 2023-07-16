package com.example.depedency.study.depedencyspring.controllers;

import com.example.depedency.study.depedencyspring.services.HelloServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContructorInjectionSystemTest {

    //TUDO ATE AGORA E SEM O SPRING, ATE AGORA
    ContructorInjectionSystem contructorInjectionSystem;

    @Test
    void hello() {
        contructorInjectionSystem = new ContructorInjectionSystem(new HelloServiceImpl());
        System.out.println(contructorInjectionSystem.hello());
    }

}