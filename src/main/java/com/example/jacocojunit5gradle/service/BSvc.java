package com.example.jacocojunit5gradle.service;

import org.springframework.stereotype.Service;

@Service
public class BSvc {

    public void print(){
        System.out.println("test print");
    }

    public void noTestPrint(){
        System.out.println("no test");
    }
}
