package com.human.ex;

public class Java012 {

	public static void main(String[] args) {
		System.out.println("도전 횟수 총:"+aReturn(0));		

	}
	public static int aReturn(int a) {
		java.util.Scanner scanner=
		new java.util.Scanner(System.in);
		a=(int)(Math.random()*100)+1;
		System.out.print("숫자 입력>");
		int num=0;
		for(;;) {
			int random=Integer.parseInt(scanner.nextLine());
			if(random>a) {
				System.out.println("down");
				num++;
			}else if(random<a) {
				System.out.println("up");
				num++;
			}else if(random==a) {
				System.out.println("정답");
				break;
			}
		}
		return num;
	}

}
