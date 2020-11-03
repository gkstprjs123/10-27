package com.human.ex;

public class BlackJack2 {
	public static int deck[]=new int[52];

	public static void main(String[] args) {
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		
		String cardShape[]={"�����̵�","��Ʈ","���̾�","Ŭ�ι�"};
        String cardNumber[]={"A","2","3","4","5","6","7","8","9","10","J","Q","k"};
        int cardIndex=0;
        int p1Index=0;
        int p2Index=0;
        boolean p1Flag=true;
        boolean p2Flag=true;
        String p1Deck[]=new String[10];
        String p2Deck[]=new String[10];
        int p1Sum=0;
        int p2Sum=0;
        int winOrLose=0;        
        
		for(int i=0; i<deck.length; i++) {//�迭�� ���� �ֱ�
			deck[i]=i;
		}
		for(int i=0; i<10000; i++) {//ī�� �������� ����
			int random=(int)(Math.random()*deck.length);
			int temp=deck[0];
			deck[0]=deck[random];
			deck[random]=temp;
		}
		//���� ����
		for(;;) {
			if(p1Flag) {
				System.out.println("===p1���� �ޱ� �� ī��===");
				for(String i:p1Deck) {
					if(i!=null) {
						System.out.print(i+" ");
					}
				}
				System.out.println("����>>"+p1Sum);
				System.out.print("p1�� ī�带 �����ðڽ��ϱ�? 0=YES 1=NO:");
				int yesOrNo=Integer.parseInt(scanner.nextLine());
				switch(yesOrNo) {
				case 0:
					int p1ShapeIndex=deck[cardIndex]/13;
					int p1NumberIndex=deck[cardIndex]%13;
					p1Deck[p1Index]=cardShape[p1ShapeIndex]+cardNumber[p1NumberIndex];
					System.out.println("===p1���� �ް� ���� ī�� ī��===");
					for(String i:p1Deck) {
						if(i!=null) {
							System.out.print(i+" ");
						}
					}
					p1Sum+=p1NumberIndex+1;
					System.out.println("����>>"+p1Sum);
					if(p1Sum>21) {
						System.out.println("p1�� �й�");
						p1Flag=false;
						p2Flag=false;
						break;
					}
					System.out.println("");
					p1Index++;
					cardIndex++;
					break;
				case 1:
					p1Flag=false;
					winOrLose++;
					break;
				default:System.out.println("�߸��� �Է��Դϴ�.");
				}
			}
			if(p2Flag){
				System.out.println("===p2���� �ޱ� �� ī��===");
				for(String i:p2Deck) {
					if(i!=null) {
						System.out.print(i+" ");
					}
				}
				System.out.println("����>>"+p2Sum);
				System.out.print("p2�� ī�带 �����ðڽ��ϱ�? 0=YES 1=NO:");
				int yesOrNo=Integer.parseInt(scanner.nextLine());
				switch(yesOrNo) {
				case 0:
					int p2ShapeIndex=deck[cardIndex]/13;
					int p2NumberIndex=deck[cardIndex]%13;
					p2Deck[p2Index]=cardShape[p2ShapeIndex]+cardNumber[p2NumberIndex];
					System.out.println("===p2���� �ް� ���� ī��===");
					for(String i:p2Deck) {
						if(i!=null) {
							System.out.print(i+" ");
						}
					}
					p2Sum+=p2NumberIndex+1;
					System.out.println("����>>"+p2Sum);
					if(p2Sum>21) {
						System.out.println("p2�� �й�");
						p1Flag=false;
						p2Flag=false;
						break;
					}
					System.out.println("");
					p2Index++;
					cardIndex++;
					break;
				case 1:
					p2Flag=false;
					winOrLose++;
					break;
				default:System.out.println("�߸��� �Է��Դϴ�.");
				}
			}
			if(winOrLose==2) {
				System.out.println("====���� ���====");
				System.out.println("p1���� deck");
				for(String i:p1Deck) {
					if(i!=null) {
						System.out.print(i+" ");
					}
				}
				System.out.print("\t ����>>"+p1Sum);
				System.out.println("");
				System.out.println("p2���� deck");
				for(String i:p2Deck) {
					if(i!=null) {
						System.out.print(i+" ");
					}
				}
				System.out.print("\t ����>>"+p2Sum);
				System.out.println("");
				if(p1Sum<p2Sum) {
					System.out.println("p2�� �¸�");
				}else if(p1Sum==p2Sum) {
					System.out.println("���º�");
				}else {
					System.out.println("p1�� �¸�");
				}
				break;
			}
			
		}

	}

}
