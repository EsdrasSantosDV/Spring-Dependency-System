package com.example.depedency.study.depedencyspring.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

//PRECISA ADICIONAR TBM O DEFAULT VALUE, PRA PARTE DA TRADUÇÃO TBM VIU, SENÃO DA PAU
@ActiveProfiles({"prod", "EN"})
@SpringBootTest
class EnviromentControllerTest {

    @Autowired
    EnviromentController  enviromentController;

    @Test
    void getEnviroment() {
        System.out.println(enviromentController.getEnviroment());
    }


}