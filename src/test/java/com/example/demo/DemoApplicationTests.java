package com.example.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;


@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestMovie1.class,
        TestMovie2.class,
        TestMovie3.class
})

@SpringBootTest
public class DemoApplicationTests {

}

