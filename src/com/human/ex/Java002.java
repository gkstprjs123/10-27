package com.human.ex;

public class Java002 {
	
	

	public static void main(String[] args) {
		
		//º°Âï±â 1¹ø
		for(int i=0; i<9; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//º°Âï±â 2¹ø
		int a=8;
		for(int i=0; i<9; i++) {
			for(int j=0; j<a; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			a--;
			System.out.println("");
		}
	    
		//º°Âï±â 3¹ø
		for(int i=0; i<9; i++) {
			for(int j=0; j<9-i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//º°Âï±â 4¹ø
		for(int i=0; i<9; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<9-i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//º°Âï±â 5¹ø
		a=1;
		for(int i=0; i<9; i++) {
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			if(i<4) {
				a++;
			}else if(i>=4) {
				a--;
			}
			System.out.println("");
		}
		
		//º°Âï±â 6¹ø
		int b=1;
		int bA=4;
		for(int i=0; i<9; i++) {
			for(int j=0; j<bA; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<b; j++) {
				System.out.print("*");
			}
			if(i<4) {
				b++;
				bA--;
			}else if(i>=4) {
				b--;
				bA++;
			}
			System.out.println("");
			
		}
		
		//º°Âï±â 7¹ø
		int c=5;
		int cA=0;
		for(int i=0; i<9; i++) {
			for(int j=0; j<c; j++) {
				System.out.print("*");
			}
			for(int j=0; j<cA; j++) {
				System.out.print(" ");
			}
			if(i<4) {
				c--;
				cA++;
			}else if(i>=4) {
				c++;
				cA--;
			}
			System.out.println("");
		}
		
		//º°Âï±â 8¹ø
		c=5;
		cA=0;
		for(int i=0; i<9; i++) {
			for(int j=0; j<cA; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<c; j++) {
				System.out.print("*");
			}
			if(i<4) {
				c--;
				cA++;
			}else if(i>=4) {
				c++;
				cA--;
			}
			System.out.println("");
		}
		
		//º°Âï±â 9¹ø
		a=5;
		b=1;
		for(int i=0; i<9; i++) {
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			for(int j=0; j<b; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			if(i<4) {
				a--;
				b+=2;
			}else if(i>=4) {
				a++;
				b-=2;
			}
			System.out.println("");
			
		}
		
		//º°Âï±â 10¹ø
		a=1;
		b=8;
		for(int i=0; i<9; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			for(int j=0; j<b; j++) {
				System.out.print(" ");
			}
			System.out.println("");
			a+=2;
			b--;
		}
		//º°Âï±â 11¹ø
		a=17;
		b=0;
		for(int i=0; i<9; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			for(int j=0; j<b; j++) {
				System.out.print(" ");
			}
			System.out.println("");
			a-=2;
			b++;
		}
		//º°Âï±â 12¹ø
		a=9;
		b=0;
		for(int i=0; i<9; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			for(int j=0; j<b; j++) {
				System.out.print(" ");
			}
			if(i<4) {
				a-=2;
				b++;
			}else if(i>=4) {
				a+=2;
				b--;
			}
			System.out.println("");
		}	
			//º°Âï±â 13¹ø
		a=5;
		b=0;
		c=5;
		for(int i=0; i<9; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			for(int j=0; j<c; j++) {
				System.out.print(" ");
			}
			if(i<4) {
				b++;
				c--;
			}else if(i>=4) {
				b--;
				c++;
			}
			System.out.println("");
		}
		//º°Âï±â 14¹ø
		a=1;
		b=1;
		c=7;
		System.out.println("        *");
		for(int i=0; i<8; i++) {
		  if(i<7) {
			  for(int j=0; j<c; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<a; j++) {
					System.out.print("*");
				}
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<a; j++) {
					System.out.print("*");
				}
				for(int j=0; j<c; j++) {
					System.out.print(" ");
				}
				c--;
				b+=2;
				System.out.println("");
		  }else{
				for(int j=0; j<17; j++) {
					System.out.print("*");
				}
				System.out.println("");
		  }
		}
		
		//º°Âï±â 15¹ø
		a=1;
		b=0;
		c=7;
		for(int i=0; i<9; i++) {
			if(i!=4) {
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<a; j++) {
					System.out.print("*");
				}
				for(int j=0; j<c; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<a; j++) {
					System.out.print("*");
				}
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				if(i<3) {
					c-=2;
					b++;
				}else if(i>4){
					c+=2;
					b--;
				}
				System.out.println("");
			}else if(i==4) {
				System.out.println("    *");
			}
		}
		
	}

}
