package org.craftedsw.kirin.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope // make it refreshable with a refresh event sent trough actuator
public class ConfigClientApplication {

    @Value("${my.userName}")
    private String myUserName;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @GetMapping("/me")
    public String myUsername() {
        return String.format("I'm %s", myUserName);
    }

}
