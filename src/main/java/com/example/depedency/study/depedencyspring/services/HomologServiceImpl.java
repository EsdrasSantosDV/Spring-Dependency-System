package com.example.depedency.study.depedencyspring.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("homolog")
@Service("EnviromentService")
public class HomologServiceImpl implements EnviromentService {
    @Override
    public String getEnviroment() {
        return "Homologação";
    }
}
