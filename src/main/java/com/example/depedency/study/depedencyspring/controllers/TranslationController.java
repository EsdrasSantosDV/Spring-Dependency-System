package com.example.depedency.study.depedencyspring.controllers;

import com.example.depedency.study.depedencyspring.services.HelloService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class TranslationController {
    private final HelloService helloService;

    //TEMOS A MESMA COISA, TENDO O MESMO QUALIFIER PRA DUAS IMPLEMENTAÇOES DISTINTAS
    //MAS O QUE DETERMINA, QUAL VAI SER UTILIZADO E O PERFIL QUE ESTA ATIVO
    public TranslationController(@Qualifier("i18NService") HelloService helloService) {
        this.helloService = helloService;
    }

    public String hello() {
        return helloService.sayHello();
    }
}
