package com.human.ex;

public class Java004 {

	public static void main(String[] args) {
		java.util.Scanner scanner
		=new java.util.Scanner(System.in);
		boolean a=true;
		
		while(a) {
			int random=(int)(Math.random()*99)+1;
			int random2=(int)(Math.random()*99)+1;
			System.out.println("lv.1 다움 문제를 풀어보세요:");
			System.out.println(random+"+"+random2+"=");
			int sum1=random+random2;
			int sum=Integer.parseInt(scanner.nextLine());
			if(sum1==sum) {
				 random=(int)(Math.random()*99)+1;
				 random2=(int)(Math.random()*99)+1;
				 System.out.println("lv.2 다움 문제를 풀어보세요:");
				 System.out.println(random+"-"+random2+"=");
				 sum1=random-random2;
				 sum=Integer.parseInt(scanner.nextLine());
				 if(sum1==sum) {
					 random=(int)(Math.random()*99)+1;
					 random2=(int)(Math.random()*99)+1;
					 System.out.println("lv.3 다움 문제를 풀어보세요:");
					 System.out.println(random+"*"+random2+"=");
					 sum1=random*random2;
					 sum=Integer.parseInt(scanner.nextLine());
					 if(sum1==sum) {
						 random=(int)(Math.random()*99)+1;
						 random2=(int)(Math.random()*99)+1;
						 System.out.println("lv.4 다움 문제를 풀어보세요:");
						 System.out.println(random+"/"+random2+"=");
						 sum1=random/random2;
						 sum=Integer.parseInt(scanner.nextLine());
						 if(sum1==sum) {
							 System.out.println("클리어!");
							 a=false;
						 }
					}
				}
			}
			
		    
				
			
			
		}

	}

}
