package com.example.depedency.study.depedencyspring.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

//PODEMOS REALIZAR TESTES DE PERFIS, E ANALISAR COMO FUNCIONA
//A INJEÇÃO DE DEPENDENCIA COM O PERFIL ATIVO
@ActiveProfiles("EN")
@SpringBootTest
class TranslationControllerTest {

    @Autowired
    TranslationController translationController;


    @Test
    void hello() {
        System.out.println(translationController.hello());
    }
}