package com.human.ex;

import java.util.Arrays;

public class 함수연습 {

	public static void main(String[] args) {
//		int arr1[]= {5,3};
//		arr5(arr1);
//		int aRr1[]=arr5(arr1);
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(aRr1));
		
		String st=sT("a");
		System.out.println(st);
		int sum=x(96,6,86);
		System.out.println(sum);
		
	}
		public static void arr3(int a[]) {
			a[0]=10;
		}
		public static int[] arr4(int a[]) {
			int rValue[]=a;
			rValue[0]=12;
			return rValue;
		}
		public static int[] arr5(int a[]) {
			int rValue[]=new int[a.length];
			rValue[0]=a[0];
			rValue[1]=a[1];
			rValue[1]=21;
			a[1]=25;
			return rValue;
		}
		public static String sT(String a) {
			a="안녕하세요 ";
			String b="핼로";
			return a+b;
		}
		public static int x(int a,int b,int c) {
			c=5;
			return c;
		}

	

}
