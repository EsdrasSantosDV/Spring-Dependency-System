package com.example.depedency.study.depedencyspring.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//PODEMOS TER PERFIS, E DIZER QUAL SERVIÇO VAI SER UTILIZADO DEPENDENDO DO PERFIL X
//PARA ISSO, BASTA COLOCAR O PROFILE NO SERVICE
//O PROFILE DEFAULT, E O PROFILE QUE VAI SER UTILIZADO CASO NENHUM OUTRO PROFILE ESTEJA ATIVO
@Profile({"EN","default"})
@Service("i18NService")
public class EnglishService implements HelloService{
    @Override
    public String sayHello() {
        return "SOu britanico meu irmao";
    }
}
