package com.human.ex;

import java.util.Arrays;

public class Java001 {

	public static void main(String[] args) {
		// �迭�� �����ؼ� �ﰢ�� ������� ���ڸ� �����غ���
		
		//1.ù���� ���
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
		
		//2.�ι�°���
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
		
		//�迭�� �̵� ����� ĭ���� �Է¹޾� ������ ����.
		//����
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
		
		//������
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
		
		//�迭 ������ ���� 

	}

	

}
