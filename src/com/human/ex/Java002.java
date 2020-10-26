package com.human.ex;

public class Java002 {
	
	public static void num() {
		
	}

	public static void main(String[] args) {
		int num=1;
		int num1=3;
		int num2=6;
		int num3=9;
		for(int i=1; i<50; i++) {
			if(num==num1||num==num2||num==num3) {
				System.out.println("¦");
				num++;
			}else {
				System.out.println(num);
				num++;
			}
		}
		
	}

}
