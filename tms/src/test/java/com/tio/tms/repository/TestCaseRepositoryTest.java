package com.tio.tms.repository;


import com.tio.tms.domain.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCaseRepositoryTest {

    @Autowired
    private TestCaseRepository repo;

    @Test
    public void test() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        repo.save(new TestCase("testCase3", "com.tio.tms.repository.RunThis", "td_bill_pay_inquiry"));

        TestCase testcase = repo.findById(1);
        String className = testcase.getflowName();
        Class aClass = Class.forName(className);
        Object myobj = aClass.getConstructor().newInstance();
        Method method =aClass.getDeclaredMethod("test");
        method.setAccessible(true);
        method.invoke(myobj,null);
    }
}

