package com.human.ex;

import java.util.Arrays;

public class Java001 {

	public static void main(String[] args) {
		// 배열을 선언해서 삼각형 모양으로 숫자를 나열해보자
		
		//1.첫번쨰 모양
//		int num[]=new int[107];
//		int j=1;
//		int k=0;
//		int x=2;
//		boolean flagX=true;
//		
//		for(int i=0; i<num.length; i++) {
//			num[i]=i+1;
//		}
//		for(;;) {
//			if(flagX) {
//				while(k<j) {
//					System.out.print(num[k]+" ");
//					k++;
//					if(num[k]==106) {
//						flagX=false;
//						break;
//					}
//				}
//				System.out.println("");
//					j=k+x;
//					x++;
//			}
//		}
		
		//2.두번째모양
//		int num[]=new int[50];
//		int k=1;
//		boolean flag=true;
//		
//		for(int i=0; i<num.length; i++) {
//			num[i]=i+1;
//		}
//		for(;;) {
//			if(flag) {
//				for(int i=0; i<10; i++) {
//					for(int j=0; j<k; j++) {
//						System.out.print(num[j]+" ");
//					}
//					k++;
//					System.out.println("");
//				}
//				flag=false;
//			}else {
//				k-=2;
//				for(int i=0; i<10; i++) {
//					for(int j=0; j<k; j++) {
//						System.out.print(num[j]+" ");
//					}
//					k--;
//					System.out.println("");
//				}
//				break;
//			}
//		}
		
		//배열을 이동 방향과 칸수를 입력받아 움직여 보자.
		//왼쪽
//		int arr[]= {1,2,3,4,5,6,7,8,9};
//		int count=5;
//		
//		for(int i=0; i<count; i++) {
//			int temp=arr[0];
//			for(int y=0; y<arr.length; y++) {
//				arr[y]=arr[y+1];
//				if(y==7) {
//					break;
//				}
//			}
//			arr[8]=temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
		//오른쪽
//		int arr[]= {1,2,3,4,5,6,7,8,9};
//		int count=2;
//		
//		for(int i=0; i<count; i++) {
//			int temp=arr[8];
//			for(int y=8; y>0; y--) {
//				arr[y]=arr[y-1];
//			}
//			arr[0]=temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
		//배열 세개를 만들어서 

	}

	

}
