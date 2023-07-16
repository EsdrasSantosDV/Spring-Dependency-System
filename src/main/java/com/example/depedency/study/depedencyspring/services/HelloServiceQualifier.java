package com.example.depedency.study.depedencyspring.services;

import org.springframework.stereotype.Service;


//COM O QUALIFIER, PODEMOS DIZER QUE ESSA IMPLEMENTAÇÃO BEANM TEM ESSE QUALIFIER
//E LA NA CONTROLLER PODEMOS ESCOLHER QUAL IMPLEMENTAÇÃO USAR
@Service("helloServiceQualifier")
public class HelloServiceQualifier implements HelloService{
    @Override
    public String sayHello() {
        return "qualifier service";
    }
}
