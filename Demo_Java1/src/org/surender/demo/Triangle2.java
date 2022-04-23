package org.surender.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;


import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle2 implements ApplicationContextAware{
	
	public Point point1;
	public Point point2;
	public Point point3;
	public ApplicationContext context = null;

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

	public void draw() {
		System.out.println("Triangle Drawn at ( "+getPoint1().xPoint+", "+getPoint1().yPoint+") and ("+getPoint2().xPoint+", "+getPoint2().yPoint+") and ("+getPoint3().xPoint+", "+getPoint3().yPoint+")");
	}

	
	/*
	 * This method is call once the beans are early loaded and it sets the context (triangle2_singleton object).
	 * So now we can call the required bean and make it implement its respy., scope irrespective of its parent's scope 
	 */
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		System.out.println("Here!..."+context);
		this.context =  context;
		context.getBean("point1");
	}
}
