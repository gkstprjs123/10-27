package com.human.ex;

public class Java011 {

	public static void main(String[] args) {
		for(int i=1; i<1000; i++) {
			if(f48(i)) {
				System.out.print(i);
			}
			System.out.print("\t");
			if(i%10==0) {
				System.out.println("");
			}
		}
	}
	//356 ¦ 35 ¦
	public static boolean f48(int count) {
		boolean isReturnFlag=true;
		while(count!=0) {
			if(count%10%3==0&&count%10!=0) {
				System.out.print("¦");
				isReturnFlag=false;
			}
			count=count/10;
		}
		
		return isReturnFlag;
	}

}
