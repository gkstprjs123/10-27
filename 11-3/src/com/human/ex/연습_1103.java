package com.human.ex;
//동물 이름,몸무게,나이,성별을 적어보자

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
			System.out.println(name+" 는 새끼 입니다");
		}else {
			System.out.println(name+" 는 성인 입니다");
		}
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", age=" + age + ", sex=" + sex + ", height=" + height
				+ "]";
	}	
	
}
public class 연습_1103 {

	public static void main(String[] args) {
		Animal r1= new Animal("호랑이",200,10,"수컷",150);
		Animal r2= new Animal("사자",180,9,"암컷",160);
		Animal r3= new Animal("원숭이",30,4,"수컷",100);
		Animal r4= new Animal("코끼리",350,11,"암컷",270);
		System.out.println("");
		System.out.println("이름:"+r1.name+"\t나이:"+r1.age+"\t성별:"+r1.sex+"\t몸무게:"+r1.weight+"\t키"+r1.height);
		System.out.println("이름:"+r2.name+"\t\t나이:"+r2.age+"\t성별:"+r2.sex+"\t몸무게:"+r2.weight+"\t키"+r2.height);
		System.out.println("이름:"+r3.name+"\t나이:"+r3.age+"\t성별:"+r3.sex+"\t몸무게:"+r3.weight+"\t\t키"+r3.height);
		System.out.println("이름:"+r4.name+"\t나이:"+r4.age+"\t성별:"+r4.sex+"\t몸무게:"+r4.weight+"\t키"+r4.height+"\n");
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	

	}

}
