package com.human.ex;

import java.util.Scanner;

public class Java009 {
	
	public static void main(String[] args) {
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		//1단계 스코어:1점 2단계:2점 3단계:3점 4단계:4점
		//틀리면 점수가 깎임
		int level=0,scour=0;
		for(;;) {
			System.out.print("원하시는 레벨을 골라주세요 (1~4):");
			level=Integer.parseInt(scanner.nextLine());
			scour+=madeQestionAndDisplay(0,0,level);
			
			System.out.println("현재 스코어:"+scour+"점");
			System.out.print("더 하시겠습니까? 1.예 2.아니오:");
			int game=Integer.parseInt(scanner.nextLine());
			
			if(game==2) {
				break;
			}
			
		}
		System.out.println("점수"+scour+"점");
		System.out.print("게임종료");

	}
	public static int madeQestionAndDisplay(int a,int b,int level) {
		java.util.Scanner scanner
		=new java.util.Scanner(System.in);
		int sum=0;
		int scour=0;
		a=(int)(Math.random()*99)+1;
		b=(int)(Math.random()*99)+1;
	     	if(level==1) {
	     		sum=a+b;
	     		System.out.print(a+"+"+b+"=?");
	     		int result=Integer.parseInt(scanner.nextLine());
	     		if(result==sum) {
	     			scour++;
	     		}else {
	     			scour--;
	     		}
		    }else if(level==2) {
		    	sum=a-b;
		    	System.out.print(a+"-"+b+"=?");
	     		int result=Integer.parseInt(scanner.nextLine());
	     		if(result==sum) {
	     			scour+=2;
	     		}else {
	     			scour-=2;
	     		}
		    }else if(level==3) {
		    	sum=a*b;
		    	System.out.print(a+"*"+b+"=?");
	     		int result=Integer.parseInt(scanner.nextLine());
	     		if(result==sum) {
	     			scour+=3;
	     		}else {
	     			scour-=3;
	     		}
		    }else if(level==4) {
		    	sum=a/b;
		    	System.out.print(a+"/"+b+"=?");
	     		int result=Integer.parseInt(scanner.nextLine());
	     		if(result==sum) {
	     			scour+=4;
	     		}else {
	     			scour-=4;
	     		}
		    }
	     	return scour;
	  
		
	}

}
