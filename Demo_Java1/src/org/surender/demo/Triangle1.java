package org.surender.demo;

public class Triangle1 {
	
	public Point point1;
	public Point point2;
	public Point point3;
	
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
}
