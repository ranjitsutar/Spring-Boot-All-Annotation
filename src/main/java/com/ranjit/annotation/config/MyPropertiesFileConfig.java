package com.ranjit.annotation.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class MyPropertiesFileConfig {


    @Value("${app.name}")
    private  String name;
    @Value("${app.port}")
    private  String port;
    @Value("${app.database}")
    private  String dB;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getdB() {
        return dB;
    }

    public void setdB(String dB) {
        this.dB = dB;
    }
}
