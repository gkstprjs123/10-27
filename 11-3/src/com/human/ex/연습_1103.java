package com.human.ex;
//���� �̸�,������,����,������ �����

class Animal{
	public String name="";
	public int weight=0;
	public int age=0;
	public String sex="";
	public double height=0;
	
	public Animal() {}
	public Animal(String name, int weight, int age, String sex, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.age = age;
		this.sex = sex;
		this.height=height;
		if(age<7) {
			System.out.println(name+" �� ���� �Դϴ�");
		}else {
			System.out.println(name+" �� ���� �Դϴ�");
		}
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", age=" + age + ", sex=" + sex + ", height=" + height
				+ "]";
	}	
	
}
public class ����_1103 {

	public static void main(String[] args) {
		Animal r1= new Animal("ȣ����",200,10,"����",150);
		Animal r2= new Animal("����",180,9,"����",160);
		Animal r3= new Animal("������",30,4,"����",100);
		Animal r4= new Animal("�ڳ���",350,11,"����",270);
		System.out.println("");
		System.out.println("�̸�:"+r1.name+"\t����:"+r1.age+"\t����:"+r1.sex+"\t������:"+r1.weight+"\tŰ"+r1.height);
		System.out.println("�̸�:"+r2.name+"\t\t����:"+r2.age+"\t����:"+r2.sex+"\t������:"+r2.weight+"\tŰ"+r2.height);
		System.out.println("�̸�:"+r3.name+"\t����:"+r3.age+"\t����:"+r3.sex+"\t������:"+r3.weight+"\t\tŰ"+r3.height);
		System.out.println("�̸�:"+r4.name+"\t����:"+r4.age+"\t����:"+r4.sex+"\t������:"+r4.weight+"\tŰ"+r4.height+"\n");
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	

	}

}
