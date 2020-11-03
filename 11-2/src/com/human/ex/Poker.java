package com.human.ex;

import java.util.Arrays;

public class Poker {
	public static java.util.Scanner scanner=
			new java.util.Scanner(System.in);
	public static String cardKind[]= {"◇","♤","♥","♣"};
	public static String cardNum[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	public static String userDeck1[]=new String[7];
	public static String userDeck2[]=new String[7];
	public static int card[]=new int[52];
	public static int pareCount=0;
	public static int pareIndex=0;
	public static int fullhouse=0;
	
	public static void shuFfle() {
		for(int i=0; i<card.length; i++) {
			card[i]=i+1;
		}
	    for(int i=0; i<card.length; i++) {
	    	int ranN=(int)(Math.random()*card.length);
	    	int temp=card[0];
	    	card[0]=card[ranN];
	    	card[ranN]=temp;
	    }
	}
	// 9 2 4 2 5 8 2
	public static void result() {
		for(int i=0; i<userDeck1.length; i++) {
			System.out.print(userDeck1[i]);
			System.out.println(userDeck2[i]);		
		}
		for(int i=0; i<userDeck2.length; i++) {
			String pare=userDeck2[i];
			for(int j=0; j<userDeck2.length; j++) {		
				if(pare.equals(userDeck2[j])) {
					pareCount++;
				}			
			}
		}
		switch(pareCount) {
		case 9:
			System.out.println("원페어입니다.");
			break;
		case 11:
			System.out.println("원페어입니다.");
			break;
		case 13:
			System.out.println("트리플입니다.");
			break;
		case 15:
			System.out.println("풀 하우스 입니다.");
			break;
		case 7:	
		 int j=12;
			boolean flag=false;
			boolean flag2=true;
			for(;;) {
				for(int i=0; i<userDeck2.length; i++) {		
					while(flag2) {
						if(userDeck2[i].equals(cardNum[j])) {
							System.out.println("top:"+userDeck2[i]);
							flag=true;
							break;
						}
						flag2=false;
					}
					flag2=true;
					if(flag) {
						break;
					}
				}
				if(flag) {
					break;
				}
				j--;
			}
			break;
		default:
			System.out.println("예외");
		}
	}

	public static void main(String[] args) {
	shuFfle();
	
	for(int i=0; i<userDeck1.length; i++) {
		userDeck1[i]=cardKind[card[i]/13];
		userDeck2[i]=cardNum[card[i]%13];
	}
	
	result();


	}
	

}
