package com.example.depedency.study.depedencyspring.services;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Profile;
@Profile("alfa")
@Service("EnviromentService")
public class AlfaServiceImpl implements EnviromentService {
    @Override
    public String getEnviroment() {
        return "Alfa";
    }
}
