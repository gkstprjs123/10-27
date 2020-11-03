package com.human.ex;

public class BlackJack3 {

	public static int deck[]=new int[52];
	public static int p1Deck[]=new int[10];
	public static int p2Deck[]=new int[10];
	public static int deckIndex=52;
	public static int p1DeckIndex=0;
	public static int p2DeckIndex=0;
	public static String cardShape[]= {"스페이드","다이아","하트","클로버"};
	public static String cardNumber[]={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	public static void newCard() {
	  for(int i=0;i<deck.length;i++) {
	  deck[i]=i;
	   }
	}

	public static void mixCard() {
	for(int i=0;i<10000;i++) {
	int randomIndex=(int)(Math.random()*52);
	int temp=deck[0];
	deck[0]=deck[randomIndex];
	deck[randomIndex]=temp;
	}
	}

	public static void displayDeckCard() {
	     for(int i=0;i<deckIndex;i++) {
	     System.out.println(cardShape[deck[i]/13]+" "+
	     cardNumber[deck[i]%13]);
       	}
	}

	public static void displayP1Card() {
		System.out.println("p1카드...");
	for(int i=0;i<p1DeckIndex;i++) {
	System.out.println(cardShape[p1Deck[i]/13]+" "+
	cardNumber[p1Deck[i]%13]);
	}
	}

	public static void displayP2Card() {
		System.out.println("p2 카드...");
	for(int i=0;i<p2DeckIndex;i++) {
	System.out.println(cardShape[p2Deck[i]/13]+" "+
	cardNumber[p2Deck[i]%13]);
	}

	}
	
	public static void getP1Card() {
		// deck 배열에서 p1Deck으로 카드 옮기기
		// deck이 가지고 있는 카드수는 deckIndex
		// p1Deck이 가지고 있는 카드수는 p1DeckIndex
		p1Deck[p1DeckIndex]=deck[deckIndex-1];
		deckIndex--;
		p1DeckIndex++;
		
	}

	public static void getP2Card() {
		// deck 배열에서 p2Deck으로 카드 옮기기
		p2Deck[p2DeckIndex]=deck[deckIndex-1];
		deckIndex--;
		p2DeckIndex++;
	}
	
	public static int p1Scoure() {
		int returnValue=0;
		return returnValue;
	}
	public static int p2Scoure() {
		int returnValue=0;
		return returnValue;
	}

	public static void main(String[] args) {

	//새로운 카드 1벌 세팅하기
	newCard(); 
	//카드를 섞는다.
	mixCard();
    //카드보여주기
//	displayDeckCard();
	//p1카드 받기
	getP1Card();
	//p2카드 받기
	getP2Card();
	//p1카드 받기
	getP1Card();
	//p2카드 받기
	getP2Card();
	//p1카드 받기
	getP1Card();
	//p2카드 받기
	getP2Card();
	
	displayP1Card();
	displayP2Card();


	}
}
