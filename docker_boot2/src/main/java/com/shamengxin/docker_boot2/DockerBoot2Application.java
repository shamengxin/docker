package com.shamengxin.docker_boot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.shamengxin.docker.mapper")
public class DockerBoot2Application {

    public static void main(String[] args) {
        SpringApplication.run(DockerBoot2Application.class, args);
    }

}
