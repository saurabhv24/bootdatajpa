package com.example.demo.model;

import org.springframework.stereotype.Component;

import java.util.List;


public class Test {

    String str;
    Integer num;
    List<String> names;

    public Test(String str,Integer num,List<String> names) {
        this.str = str;
        this.num = num;
        this.names = names;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Test{" +
                "str='" + str + '\'' +
                ", num=" + num +
                ", names=" + names +
                '}';
    }
}
