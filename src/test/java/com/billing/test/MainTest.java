package com.billing.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Suite;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private Main m=new Main();

    @BeforeEach
    void setUp() {
    }

    @Test
    void addOperation() {
        int a=5;
        int b=6;
        int result = m.addOperation(5, 6);
        assertEquals(11,result);
    }

}