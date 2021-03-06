package org.surender.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Triangle triangle = new Triangle();
//		triangle.draw();

		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("F:\\Spring_Demo_Workspace\\Demo_Java1\\src\\spring.xml"));
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) beanFactory.getBean("Triangle");
		triangle.draw();
	}

}
