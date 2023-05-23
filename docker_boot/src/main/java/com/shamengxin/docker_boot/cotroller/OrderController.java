package com.shamengxin.docker_boot.cotroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
public class OrderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/order/docker")
    public String helloDocker(){
        return "hello,docker"+"\t"+port+"\t"+ UUID.randomUUID();
    }

    @GetMapping("/order/index")
    public String index(){
        return "服务器端口号："+"\t"+port+"\t"+ UUID.randomUUID();
    }


}
