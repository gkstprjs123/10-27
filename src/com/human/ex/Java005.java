package com.human.ex;

public class Java005 {

	public static void main(String[] args) {
		java.util.Scanner scanner
		=new java.util.Scanner(System.in);
		boolean b=true;
		int sum=0;
			System.out.println("1.주간권 2.오후권 3.야간권 4.2일권");
			System.out.print("어떤걸 구매하시겠습니까?");
			int aX=Integer.parseInt(scanner.nextLine());
			while(b) {
				System.out.println("인원을 골라주세요");
				System.out.print("1.대인 2.청소년 3.소인/경로 4.선택끝");
				int bX=Integer.parseInt(scanner.nextLine());
				if(bX==1) {
					System.out.print("대인의 인원수를 말씀해주세요:");
					int p=Integer.parseInt(scanner.nextLine());
					if(aX==1) {
						sum+=p*46000;
					}else if(aX==2) {
						sum+=p*38000;
					}else if(aX==3) {
						sum+=p*20000;
					}else if(aX==4) {
						sum+=p*74000;
					}
				}else if(bX==2) {
					System.out.print("청소년의 인원수를 말씀해주세요:");
					int p2=Integer.parseInt(scanner.nextLine());
					if(aX==1) {
						sum+=p2*39000;
					}else if(aX==2) {
						sum+=p2*32000;
					}else if(aX==3) {
						sum+=p2*17000;
					}else if(aX==4) {
						sum+=p2*62000;
					}
				}else if(bX==3) {
					System.out.print("소인/경로의 인원수를 말씀해주세요:");
					int p3=Integer.parseInt(scanner.nextLine());
					if(aX==1) {
						sum+=p3*36000;
					}else if(aX==2) {
						sum+=p3*29000;
					}else if(aX==3) {
						sum+=p3*16000;
					}else if(aX==4) {
						sum+=p3*58000;
					}
				}else if(bX==4) {
					b=false;
				}
			}
			System.out.print("총 결제하실 요금은:"+sum+"원 입니다.");
			
		

	}

}
