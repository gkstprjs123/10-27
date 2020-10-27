package com.human.ex;

public class Java007 {
	
	public static void f369(int a) {
//		java.util.Scanner scanner
//		=new java.util.Scanner(System.in);
//		
//		System.out.print("¸î±îÁö Ãâ·ÂÇÏ½Ã°Ú½À´Ï±î:");
//		int num369=Integer.parseInt(scanner.nextLine());
		
		for(int i=1; i<a; i++) {
			int count=0;
			int j=i/10;
			int k=i%10%3;
			if(k%3==0||k%6==0||k%9==0) {
				if(i%10==0) {
					
				}else {
					count++;
				}
			}
            if(j%10==3||j%10==6||j%10==9) {
            	count++;
            }
            if(count==0) {
            	System.out.print(i+",");
            }
            if(count==1) {
            	System.out.print("Â¦,");
            }
            if(count==2) {
            	System.out.print("Â¦Â¦,");
            }
            
		}
		
	}
	


	public static void main(String[] args) {//3 6 9 13 16 19 23 26 29
		
		f369(500);
		
		
		
	}

}
