package com.human.ex;

//카드의 세로,가로,모양,숫자,색깔을 입력받아 52장의 카드를 만들어보자.
class Card{
	public static int height=13;
	public static int width=5;
	public static String color="블랙";
	public static int card[]=new int[52];
	public static String kind="클로버";
	
	public static void deck() {
		for(int i=0; i<card.length; i++) {
			card[i]=i+1;
		}
	}
}
public class Java004 {

	public static void main(String[] args) {
        Card.deck();
		for(int i=0; i<Card.card.length; i++) {
			if(i>8) {
				Card.height=11;
				Card.width=6;
				System.out.println("카드번호:"+Card.card[i]+
				           "\t색상:"+Card.color+
				           "\t모양:"+Card.kind+
				           "\t세로:"+Card.height+
				           "\t가로:"+Card.width);
			}else {
				System.out.println("카드번호:"+Card.card[i]+
				           "\t\t색상:"+Card.color+
				           "\t모양:"+Card.kind+
				           "\t세로:"+Card.height+
				           "\t가로:"+Card.width);
			}
			
		}
		

	}

}
