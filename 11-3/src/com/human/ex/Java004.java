package com.human.ex;

//ī���� ����,����,���,����,������ �Է¹޾� 52���� ī�带 ������.
class Card{
	public static int height=13;
	public static int width=5;
	public static String color="��";
	public static int card[]=new int[52];
	public static String kind="Ŭ�ι�";
	
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
				System.out.println("ī���ȣ:"+Card.card[i]+
				           "\t����:"+Card.color+
				           "\t���:"+Card.kind+
				           "\t����:"+Card.height+
				           "\t����:"+Card.width);
			}else {
				System.out.println("ī���ȣ:"+Card.card[i]+
				           "\t\t����:"+Card.color+
				           "\t���:"+Card.kind+
				           "\t����:"+Card.height+
				           "\t����:"+Card.width);
			}
			
		}
		

	}

}
