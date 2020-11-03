package com.human.ex;

class Student{
    public static int count=0;
    
	private String name="È«±æµ¿";
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
		return name+"´ÔÀÇ ÃÑÁ¡: "+total()+"\n"+
	            name+"´ÔÀÇ Æò±Õ: "+avg();
//		return "Student [name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
	}
	public Student() {//±âº» »ý¼ºÀÚ:()¾È¿¡ °ªÀÌ ¾ø´Â º¯¼ö¸¦ Ãâ·ÂÇÒ¶§ »ç¿ëµÊ r4¿¡ Àû¿ë
		this("È«±æµ¿",58,87,91);
		
	}
	public Student(String name, int kor, int math, int eng) {//r1,r2,r3¿¡ Àû¿ë
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
     


public class Java005 {//ÇÊµå,Á¤Àûº¯¼ö,Å¬·¡½º º¯¼ö,staticº¯¼ö ¶ó°í ºÎ¸§ public static
	

	public static void main(String[] args) {		
		Student r1=new Student("È«±æµ¿",50,50,60);
		r1.setKor(50);
		r1.getKor();
		System.out.println(r1.getKor());
		
		Student r2=new Student("È«±æ³²",80,90,60);
		Student r3=new Student("È«±æ¼÷",70,20,60);
		Student r4=new Student();

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r4.equals(r2));
		r2.setKor(80);
		r2.setName("È«±æµ¿3");
		System.out.println(r2);
		System.out.println(Student.count);
		
//		System.out.println(r2.name+"´ÔÀÇ ÃÑÁ¡Àº: "+r2.total());
//		System.out.println(r2.name+"´ÔÀÇ Æò±ÕÀº: "+r2.avg());
//		
//		System.out.println(r3.name+"´ÔÀÇ ÃÑÁ¡Àº: "+r3.total());
//		System.out.println(r3.name+"´ÔÀÇ Æò±ÕÀº: "+r3.avg());

	}

}
