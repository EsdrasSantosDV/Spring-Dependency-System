package com.example.depedency.study.depedencyspring.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("EnviromentService")
public class DevServiceImpl implements EnviromentService {
    @Override
    public String getEnviroment() {
        return "Desenvolvimento";
    }
}
