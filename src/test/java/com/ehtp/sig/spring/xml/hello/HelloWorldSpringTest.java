package com.ehtp.sig.spring.xml.hello;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringTest {

	private ApplicationContext springContext;

	@Before
	public void initSpringContext() {
		springContext = new ClassPathXmlApplicationContext("titi.xml");
	}

	

	@Test
	public void testSayHayUsingPring() {

		HelloWorldSpring helloWorlBean = springContext.getBean("helloBeanFoo", HelloWorldSpring.class);

		assertEquals("Spring Hello : Hatim", helloWorlBean.sayHay());
	}

//	@Test
//	public void testSayHayUsingConstructor() {
//
//		HelloWorldSpring helloWorlBeanWithConstructor = springContext.getBean("helloBeanWithConstructor",
//				HelloWorldSpring.class);
//		assertEquals("Spring Hello : Hatim-constructorBean", helloWorlBeanWithConstructor.sayHay());
//	}

	@Test
	public void testSayHayWithList() {

		HelloWorldSpring helloWorlBeanWithConstructor = springContext.getBean("helloBeanFoo",
				HelloWorldSpring.class);
		assertEquals("Hi:Hatim your cards are: [visa, paypal]", helloWorlBeanWithConstructor.yourCards());
	}

}
