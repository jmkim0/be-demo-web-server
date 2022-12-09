package com.codestates.bedemowebserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() throws UnknownHostException {
        return "Hello world! hostname: " + InetAddress.getLocalHost().getHostName();
    }
}
