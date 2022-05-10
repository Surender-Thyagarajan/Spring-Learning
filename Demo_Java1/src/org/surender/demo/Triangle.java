package org.surender.demo;
import java.util.List;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.surender.demo.Point;

public class Triangle implements BeanNameAware,InitializingBean,DisposableBean {
	
	private List<Point> points = null;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw() {
		for(Point point: points) {
			System.out.println("Points : ("+point.getxPoint()+","+point.getyPoint()+")");
		}
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("The bean used "+arg0);
		
	}

	//First method to get called when bean initialization ends
	//You can also define a custom method to be called when bean intialization or destruction happens in spring.xml
	@Override
	public void destroy() throws Exception {
		System.out.println("Bean Destruction Started");
		
	}

	//First method to get called when bean initialisation is started
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean Initialization started");
		
	}
	
	//First method to get called when bean initialisation is started
	//Defined thru spring.xml
	public void HelloWorld() {
		System.out.println("Hello there from HelloWorld");
	}
	
}
