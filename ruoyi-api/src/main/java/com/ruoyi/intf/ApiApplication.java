package com.ruoyi.intf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.Banner;
@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ApiApplication.class);

        app.setBannerMode(Banner.Mode.CONSOLE);
        app.run(args);

    }

}
