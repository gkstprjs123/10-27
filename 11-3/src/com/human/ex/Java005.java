package com.human.ex;

class Student{
    public static int count=0;
    
	private String name="ȫ�浿";
	private int kor=50;
	private int math=50;
	private int eng=60;
	
	public int total() {
		return kor+math+eng;
	}
	public double avg() {
		return total()/3.;
	}
	@Override
	public String toString() {
		return name+"���� ����: "+total()+"\n"+
	            name+"���� ���: "+avg();
//		return "Student [name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
	}
	public Student() {//�⺻ ������:()�ȿ� ���� ���� ������ ����Ҷ� ���� r4�� ����
		this("ȫ�浿",58,87,91);
		
	}
	public Student(String name, int kor, int math, int eng) {//r1,r2,r3�� ����
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		Student.count++;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor=kor;
		if(kor<0) {
			this.kor=0;
		}
		if(kor>100) {
			this.kor=100;
		}
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
}
     


public class Java005 {//�ʵ�,��������,Ŭ���� ����,static���� ��� �θ� public static
	

	public static void main(String[] args) {		
		Student r1=new Student("ȫ�浿",50,50,60);
		r1.setKor(50);
		r1.getKor();
		System.out.println(r1.getKor());
		
		Student r2=new Student("ȫ�泲",80,90,60);
		Student r3=new Student("ȫ���",70,20,60);
		Student r4=new Student();

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r4.equals(r2));
		r2.setKor(80);
		r2.setName("ȫ�浿3");
		System.out.println(r2);
		System.out.println(Student.count);
		
//		System.out.println(r2.name+"���� ������: "+r2.total());
//		System.out.println(r2.name+"���� �����: "+r2.avg());
//		
//		System.out.println(r3.name+"���� ������: "+r3.total());
//		System.out.println(r3.name+"���� �����: "+r3.avg());

	}

}
