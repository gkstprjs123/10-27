package com.human.ex;

public class Java003 {

	public static void main(String[] args) {
		//369∞‘¿”
		int num=1;
		for(int i=0; i<10; i++) {
			if(i==0) {
				for(int j=1; j<11; j++) {
					if(j==3||j==6||j==9) {
						System.out.print("¬¶ ");
					}else {
						System.out.print(j+" ");
					}
				}
			}else {
				for(int j=1; j<11; j++) {
				 if(j!=10) {
					 if(j==3||j==6||j==9) {
							System.out.print("¬¶ ");
							if(i==3||i==6||i==9) {
								System.out.print("¬¶ ");
							}
					}else if(i==3||i==6||i==9){
						System.out.print("¬¶ ");
					  	if(j==3||j==6||j==9) {
							System.out.print("¬¶ ");
						}
					}else{
							System.out.print(i);
							System.out.print(j+" ");
					}
				 }else {
					 if(i+1==3||i+1==6||i+1==9) {
						 System.out.print("¬¶ ");
					 }else {
						 System.out.print(i+1+"0 ");
					 }
				 }
					
				}
			}
		}
		
		

	}

}
