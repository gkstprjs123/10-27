package com.human.ex;

public class Java008 {

	public static void main(String[] args) {
		//사용자가 “종료”를 입력할때 까지 무한 반복하는 프로그램을 3가지 방법으로 구현하시오.
        java.util.Scanner scanner=
        		new java.util.Scanner(System.in);
        //첫번째 방법
        /*
        boolean true1=true;
        int num=1;
        while(true1){
        	System.out.println(num);
        	num++;
        	System.out.print("종료를 입력하면 종료:");
        	String a=(scanner.nextLine());
        	if(a.equals("종료")) {
        		System.out.println("종료");
        		true1=false;
        	}
        }
        
        //두번째 방법
        for(int i=0; i<i+1; i++) {
        	System.out.println(i);
        	System.out.print("종료를 입력하면 종료:");
        	String a=(scanner.nextLine());
        	if(a.equals("종료")) {
        		System.out.println("종료");
        		break;
        	}
        }
        
        //세번째 방법
        int num=1;
        do {
        	System.out.println(num);
        	num++;
        	System.out.print("종료를 입력하면 종료:");
        	String a=(scanner.nextLine());
        	if(a.equals("종료")) {
        		System.out.println("종료");
        		break;
        	}
        }while(true);
        */
	}

}
