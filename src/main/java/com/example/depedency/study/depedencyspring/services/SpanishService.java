package com.example.depedency.study.depedencyspring.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//PODEMOS TER PERFIS, E DIZER QUAL SERVIÇO VAI SER UTILIZADO DEPENDENDO DO PERFIL X
//PARA ISSO, BASTA COLOCAR O PROFILE NO SERVICE
@Profile("ES")
@Service("i18NService")
public class SpanishService implements HelloService{
    @Override
    public String sayHello() {
        return "Hola mundo Boludito";
    }
}
