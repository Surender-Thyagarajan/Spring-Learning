package org.surender.demo;
import java.util.List;

import org.springframework.beans.factory.BeanNameAware;
import org.surender.demo.Point;

public class Triangle implements BeanNameAware {
	
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
	
}
