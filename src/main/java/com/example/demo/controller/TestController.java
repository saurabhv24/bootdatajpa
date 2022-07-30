package com.example.demo.controller;

import com.example.demo.exceptionHandler.MyException;
import com.example.demo.model.Test;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestService testService;

	/*
	 * @GetMapping(value = "/v1/api/test", produces =
	 * MediaType.APPLICATION_JSON_VALUE) ResponseEntity<List<Test>> getTest(){ Test
	 * test = new Test("test",1,List.of("test1","test2")); Test test1 = new
	 * Test("test",1,List.of("test1","test2"));
	 * 
	 * List list =new ArrayList(); list.add(test); list.add(test1);
	 */

        return ResponseEntity.ok(list);
    }

    @PostMapping(value = "/v1/api/test")
    void storeTest(@RequestBody Test test){

        System.out.println(test);
    }

    @GetMapping("/v1/api/property")
    void printEnvProperty(){
        testService.printurl();
    }

    @GetMapping("/v1/api/exception")
    void exceptionHandler(){

        throw new MyException("Exception occured","1001");
    }
}
