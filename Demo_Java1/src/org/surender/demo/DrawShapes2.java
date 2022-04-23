package org.surender.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//This class is used to demonstrate injecting objects
public class DrawShapes2 {

	public static void main(String[] args) {
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring2.xml");
		//Since we are using aliases in spring.xml you can use the other name too
		//Triangle1 triangle1 = (Triangle1) beanFactory.getBean("Triangle1");
		Triangle2 triangle2 = (Triangle2) beanFactory.getBean("Triangle-autowire");
		triangle2.draw();
	}
}
