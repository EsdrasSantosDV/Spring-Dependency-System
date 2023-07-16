package com.example.depedency.study.depedencyspring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


//QUNADO TEMOS DUAS IMPLEMENTAÇÃOES DE UM MESMO SERVIÇO, PODEMOS COLOCAR QUE O SISTEMA DE
//DEPENDENCIA DO SPRING IRA USAR ESSE PLUG AQUI, COMO PRIMARIO
@Primary
@Service
public class HelloServiceImpl2 implements HelloService {
    @Override
    public String sayHello() {
        return "Implemetntação 2 do service";
    }
}
