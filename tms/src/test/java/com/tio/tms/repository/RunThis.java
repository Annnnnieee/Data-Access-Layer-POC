package com.tio.tms.repository;


import com.tio.tms.domain.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RunThis {

    @Autowired
    private TestCaseRepository repo;

    @Test
    public void test(){
        System.out.println("=========================RUNNING===========================");
    }
}
