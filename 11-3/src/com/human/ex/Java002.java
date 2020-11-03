package com.human.ex;

class Rectangle{
	public static double unit=1;
	private double height =20;
	private double width =40;
	
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height<0) {
			height=0;
		}
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double periphery() {
		return 2*height+2*width;
	}	
	public static double area(double height,double width) { //static붙은 애들은 객채생성없이 출력가능 static static끼리 접근가능
//		this.height = height;
//		this.width = width;
		unit=height*width;
        return unit;
	}
	//생성자
	public double area() {
		return height*width;
	}
	public Rectangle() {}
	
	public Rectangle(double width) {
		this(width,width);
//		this.width = width;
//		this.height = width;
	}
	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}


	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]"+this.area();
	}


	@Override
	public int hashCode() { 
		final int prime = 31;
		int result = 1;
		long temp;
//		temp = Double.doubleToLongBits(area());
//		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
//    	if(this.area()!=other.area()) {
//    		return false;
//    	}
    		
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}
	
	
}

public class Java002 {

	public static void main(String[] args) {
//		System.out.println(Rectangle.area(40, 30));//메소드에 static을 붙여서 객체를 만들지 않더라도 실행이 가능 
//		Rectangle r1=new Rectangle(30); //매게 변수에 따라 생성자가 실행됨
//		Rectangle r1=new Rectangle(30,40);
//		Rectangle r2=new Rectangle(20,50);
		Rectangle r1=new Rectangle(30,40);
//		Rectangle r2=new Rectangle(40,30);
//		System.out.println(r1.equals(r2));
		System.out.println(r1.area());
		
//		r1.setHeight(50);
//		System.out.println(r1.getHeight());
//		System.out.println(r1);
//		r1.height=30; r1.width=40;
//		System.out.println(r1.area());
//		System.out.println(r1.periphery());
		
//		r2.height=20; r2.width=30;
//		System.out.println(r2.area());
//		System.out.println(r2.periphery());
//		System.out.println(r1);
		
		
		
		
	
		
		

	}

}
