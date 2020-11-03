package com.human.ex;

public class BjFunction {
	public static java.util.Scanner scanner=
			new java.util.Scanner(System.in);
	public static int card[]=new int[52];
	public static String kind[]= {"��","��","��","��"};
	public static String cardNum[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	public static String p1deck[]=new String[10];
	public static String p2deck[]=new String[10];
	public static int cardIndex=0;
	public static int p1Index=0;
	public static int p2Index=0;
	public static int sumP1=0;
	public static int sumP2=0;
	public static boolean p1Flag=true;
	public static boolean p2Flag=true;
	public static int noCount=0;
	
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
	
	public static void gameStart() {
		for(;;) {
			if(noCount==2) {
				winOrLose();
				return;
			}
			p1Deck();
			p2Deck();
		}
	}
	
	public static void p1Deck() {
		if(p1Flag) {
    		System.out.println("====�÷��̾� 1���� ���� ī��====");
    		for(String i:p1deck) {
    			if(i!=null) {
    				System.out.print(i+" ");
    			}
    		}
    		System.out.print("\t����>>"+sumP1);
    		System.out.println("");
    		System.out.print("p1 �� ī�带 �����ðڽ��ϱ� 1.�� 2.�ƴϿ�:");
	    	int yesOrNo=Integer.parseInt(scanner.nextLine());
	    	switch(yesOrNo) {
	    	case 1:
	    		int p1NumIndex=card[cardIndex]%13;
	    		int p1KindIndex=card[cardIndex]/13;
	    		p1deck[p1Index]=kind[p1KindIndex]+cardNum[p1NumIndex];
	    		if(p1NumIndex>=10) {
	    			p1NumIndex=10-1;
	    		}
	    		if(cardNum[0]==cardNum[p1NumIndex]) {
	    			System.out.println("A�� �����̽��ϴ�.");
	    			System.out.println("1. A�� 1�� ���� 2. A�� 11�� ����");
	    			int aResult=Integer.parseInt(scanner.nextLine());
	    			switch(aResult) {
	    			case 1:
	    				p1NumIndex=1;
	    				sumP1--;
	    				break;
	    			case 2:
	    				p1NumIndex=11;
	    				sumP1--;
	    				break;
	    			}
	    		}
	    		sumP1+=p1NumIndex+1;
	    		System.out.println("====�÷��̾� 1���� �ް� ���� ī��====");
	    		for(String i:p1deck) {
	    			if(i!=null) {
	    				System.out.print(i+" ");
	    			}
	    		}
	    		System.out.print("\t����>>"+sumP1);
	    		System.out.println("\n");
	    		if(sumP1>21) {
	    			System.out.println("p1�� �й�");
	    			p2Flag=false;
	    			p1Flag=false;
	    			break;
	    		}
	    		p1Index++;		
	    		cardIndex++;
	    		break;
	    	case 2:
	    		p1Flag=false;
	    		noCount++;
	    		break;
	    	default:
	    		System.out.println("�߸��� �Է�");
	    	}
    	}
	}
	public static void p2Deck() {
		if(p2Flag) {
    		System.out.println("====�÷��̾� 2���� ���� ī��====");
    		for(String i:p2deck) {
    			if(i!=null) {
    				System.out.print(i+" ");
    			}
    		}
    		System.out.print("\t����>>"+sumP2);
    		System.out.println("");
    		System.out.print("p2 �� ī�带 �����ðڽ��ϱ� 1.�� 2.�ƴϿ�:");
	    	int yesOrNo=Integer.parseInt(scanner.nextLine());
	    	switch(yesOrNo) {
	    	case 1:
	    		int p2NumIndex=card[cardIndex]%13;
	    		int p2KindIndex=card[cardIndex]/13;
	    		p2deck[p2Index]=kind[p2KindIndex]+cardNum[p2NumIndex];
	    		if(p2NumIndex>=10) {
	    			p2NumIndex=10-1;
	    		}
	    		if(cardNum[0]==cardNum[p2NumIndex]) {
	    			System.out.println("A�� �����̽��ϴ�.");
	    			System.out.println("1. A�� 1�� ���� 2. A�� 11�� ����");
	    			int aResult=Integer.parseInt(scanner.nextLine());
	    			switch(aResult) {
	    			case 1:
	    				p2NumIndex=1;
	    				sumP2--;
	    				break;
	    			case 2:
	    				p2NumIndex=11;
	    				sumP2--;
	    				break;
	    			}
	    		}
	    		sumP2+=p2NumIndex+1;
	    		System.out.println("====�÷��̾� 2���� �ް� ���� ī��====");
	    		for(String i:p2deck) {
	    			if(i!=null) {
	    				System.out.print(i+" ");
	    			}
	    		}
	    		System.out.print("\t����>>"+sumP2);
	    		System.out.println("\n");
	    		if(sumP2>21) {
	    			System.out.println("p2�� �й�");
	    			p2Flag=false;
	    			p1Flag=false;
	    			break;
	    		}
	    		p2Index++;	
	    		cardIndex++;
	    		break;
	    	case 2:
	    		p2Flag=false;
	    		noCount++;
	    		break;
	    	default:
	    		System.out.println("�߸��� �Է�");
	    	}
    	}
	}

	public static void winOrLose() {
		if(noCount==2) {
    		if(sumP1>sumP2) {
    			System.out.println("�÷��̾� 1�� ��!");
    			return;
    		}else if(sumP1==sumP2){
    			System.out.println("���º�");
    			return;
    		}else{
    			System.out.println("�÷��̾� 2�� ��!");
    			return;
    		}
    	}   
	}
	
	public static void main(String[] args) {
		shuFfle();
		gameStart();

	}

}
