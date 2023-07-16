package com.example.depedency.study.depedencyspring.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    //DESSE JEITO ESTAMOS FAZENDO DE FORMA CONCRETA, USANDO A PRORPRIA INSTANCIA DA IMPLEMENTAÇÃO DA SERVICE

    @Test
    void sayHello() {
        MyController myController=new MyController();

        System.out.println(myController.hello());
    }


}