package com.vcooline.demo.dubbo.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Emac
 */
@Configuration
@EnableAutoConfiguration
@Import({WebConfig.class})
@ImportResource("classpath:META-INF/spring/dubbo-demo-web.xml")
public class AppConfig {
}
