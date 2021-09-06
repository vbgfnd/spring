package vbgfnd.spring;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes=WebAppConfig.class)// 指定spring-boot的启动类
public class MyPropsTest {
    @Autowired
    private MyProps myProps;

    @Test
    public void propsTest() throws JsonProcessingException {
        System.out.println("simpleProp: " + myProps.getSimpleProp());
        System.out.println("arrayProps: " + Arrays.toString(myProps.getArrayProps()));
        System.out.println("listProp1: " + myProps.getListProp1());
        System.out.println("listProp2: " + myProps.getListProp2());
        System.out.println("mapProps: " + myProps.getMapProps());
    }
}