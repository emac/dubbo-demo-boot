package com.vcooline.demo.dubbo.client;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Emac
 */
@Configuration
@EnableAutoConfiguration
@ImportResource("classpath:META-INF/spring/dubbo-demo-client.xml")
public class AppConfig {
}
