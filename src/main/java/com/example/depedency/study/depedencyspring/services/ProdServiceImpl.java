package com.example.depedency.study.depedencyspring.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("EnviromentService")
public class ProdServiceImpl implements EnviromentService {
    @Override
    public String getEnviroment() {
        return "Produção";
    }
}
