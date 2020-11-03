package com.human.ex;

public class BlackJack2 {
	public static int deck[]=new int[52];

	public static void main(String[] args) {
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		
		String cardShape[]={"스페이드","하트","다이아","클로버"};
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
        
		for(int i=0; i<deck.length; i++) {//배열에 숫자 넣기
			deck[i]=i;
		}
		for(int i=0; i<10000; i++) {//카드 랜덤으로 섞기
			int random=(int)(Math.random()*deck.length);
			int temp=deck[0];
			deck[0]=deck[random];
			deck[random]=temp;
		}
		//게임 시작
		for(;;) {
			if(p1Flag) {
				System.out.println("===p1님의 받기 전 카드===");
				for(String i:p1Deck) {
					if(i!=null) {
						System.out.print(i+" ");
					}
				}
				System.out.println("총점>>"+p1Sum);
				System.out.print("p1님 카드를 받으시겠습니까? 0=YES 1=NO:");
				int yesOrNo=Integer.parseInt(scanner.nextLine());
				switch(yesOrNo) {
				case 0:
					int p1ShapeIndex=deck[cardIndex]/13;
					int p1NumberIndex=deck[cardIndex]%13;
					p1Deck[p1Index]=cardShape[p1ShapeIndex]+cardNumber[p1NumberIndex];
					System.out.println("===p1님의 받고 난뒤 카드 카드===");
					for(String i:p1Deck) {
						if(i!=null) {
							System.out.print(i+" ");
						}
					}
					p1Sum+=p1NumberIndex+1;
					System.out.println("총점>>"+p1Sum);
					if(p1Sum>21) {
						System.out.println("p1님 패배");
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
				default:System.out.println("잘못된 입력입니다.");
				}
			}
			if(p2Flag){
				System.out.println("===p2님의 받기 전 카드===");
				for(String i:p2Deck) {
					if(i!=null) {
						System.out.print(i+" ");
					}
				}
				System.out.println("총점>>"+p2Sum);
				System.out.print("p2님 카드를 받으시겠습니까? 0=YES 1=NO:");
				int yesOrNo=Integer.parseInt(scanner.nextLine());
				switch(yesOrNo) {
				case 0:
					int p2ShapeIndex=deck[cardIndex]/13;
					int p2NumberIndex=deck[cardIndex]%13;
					p2Deck[p2Index]=cardShape[p2ShapeIndex]+cardNumber[p2NumberIndex];
					System.out.println("===p2님의 받고 난뒤 카드===");
					for(String i:p2Deck) {
						if(i!=null) {
							System.out.print(i+" ");
						}
					}
					p2Sum+=p2NumberIndex+1;
					System.out.println("총점>>"+p2Sum);
					if(p2Sum>21) {
						System.out.println("p2님 패배");
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
				default:System.out.println("잘못된 입력입니다.");
				}
			}
			if(winOrLose==2) {
				System.out.println("====게임 결과====");
				System.out.println("p1님의 deck");
				for(String i:p1Deck) {
					if(i!=null) {
						System.out.print(i+" ");
					}
				}
				System.out.print("\t 총점>>"+p1Sum);
				System.out.println("");
				System.out.println("p2님의 deck");
				for(String i:p2Deck) {
					if(i!=null) {
						System.out.print(i+" ");
					}
				}
				System.out.print("\t 총점>>"+p2Sum);
				System.out.println("");
				if(p1Sum<p2Sum) {
					System.out.println("p2님 승리");
				}else if(p1Sum==p2Sum) {
					System.out.println("무승부");
				}else {
					System.out.println("p1님 승리");
				}
				break;
			}
			
		}

	}

}
