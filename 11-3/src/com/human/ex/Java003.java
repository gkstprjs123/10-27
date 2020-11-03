package com.human.ex;

class Rectangle2{ 
	public double height =20; //����
	public double excreta =40; //��
	public double redius =20;	//������
	
	public double periphery() { //�ﰢ����  �ѷ�
		return excreta*3;
	}
	public double area() { //�ﰢ���� ����
		return excreta*height/2;
	}
	
	public double periphery2() { //���� �ѷ�
		return redius*2*Math.PI;
	}
	public double area2() { //���� ����
		return redius*redius*Math.PI;
	}
	public Rectangle2() {}
	public Rectangle2(double height, double excreta, double redius) {
		super();
		this.height = height;
		this.excreta = excreta;
		this.redius = redius;
	}
	public Rectangle2(double height) { //���� ������ ��,������ �� ����
		this(height,height,height);
	}
	public Rectangle2(double height,double excreta) {
		this(height,height,excreta);
			
		
	}
	
	
}


public class Java003 {

	public static void main(String[] args) {
		Rectangle2 r1= new Rectangle2(39,20,213);
		Rectangle2 r2= new Rectangle2(39);
		
		System.out.println(r1.periphery());
		System.out.println(r1.area());
		
		System.out.println(r2.periphery());
		System.out.println(r2.area());

	}

}
