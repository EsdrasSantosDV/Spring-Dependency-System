package com.example.depedency.study.depedencyspring.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18NService")
public class EnglishService implements HelloService{
    @Override
    public String sayHello() {
        return "SOu britanico meu irmao";
    }
}
