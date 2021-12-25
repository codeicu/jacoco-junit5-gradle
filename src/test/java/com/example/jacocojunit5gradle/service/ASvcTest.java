package com.example.jacocojunit5gradle.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ASvcTest {

    @Autowired
    ASvc aSvc;

    @Test
    void print() {
        aSvc.print();
    }
}