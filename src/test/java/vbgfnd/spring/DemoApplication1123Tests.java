package vbgfnd.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest
class DemoApplication1123Tests {

	@Test
	void contextLoads() {
		System.out.println("hello");
		Assert.notEmpty(new ArrayList<String>(), "dd");
	}

}
