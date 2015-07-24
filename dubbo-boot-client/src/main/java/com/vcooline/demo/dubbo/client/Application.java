package com.vcooline.demo.dubbo.client;

import org.springframework.boot.SpringApplication;

/**
 * @author Emac
 */
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AppConfig.class);
        app.setShowBanner(false);
        app.run(args);
    }
}
