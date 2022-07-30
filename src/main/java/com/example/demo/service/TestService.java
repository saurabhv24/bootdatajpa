package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Value("${url}")
    String url;

    public void printurl(){
        System.out.println(url);
    }
}
