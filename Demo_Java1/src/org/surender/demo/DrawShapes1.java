package org.surender.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//This class is used to demonstrate injecting objects
public class DrawShapes1 {

	public static void main(String[] args) {
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring1.xml");
		//Since we are using aliases in spring.xml you can use the other name too
		//Triangle1 triangle1 = (Triangle1) beanFactory.getBean("Triangle1");
		Triangle1 triangle1 = (Triangle1) beanFactory.getBean("Triangle1-alias");
		triangle1.draw();
	}
}
