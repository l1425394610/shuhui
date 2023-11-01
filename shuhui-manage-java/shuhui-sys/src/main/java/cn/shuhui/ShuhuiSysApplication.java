package cn.shuhui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
public class ShuhuiSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShuhuiSysApplication.class, args);
    }

}
