package com.human.ex;

public class Java012 {

	public static void main(String[] args) {
		System.out.println("���� Ƚ�� ��:"+aReturn(0));		

	}
	public static int aReturn(int a) {
		java.util.Scanner scanner=
		new java.util.Scanner(System.in);
		a=(int)(Math.random()*100)+1;
		System.out.print("���� �Է�>");
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
				System.out.println("����");
				break;
			}
		}
		return num;
	}

}
