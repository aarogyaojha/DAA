package daa_lab;

import java.util.Random;
import java.util.Scanner;

public class merge_sort {
	
	public static void divide(int[] arr,int si,int ei) {
		
		if(si>=ei) {
			return;
		}
		int mid=si+(ei-si)/2;
		
		divide(arr,si,mid);
		divide(arr, mid+1, ei);
		conquer(arr, si, mid, ei);
	}
	
	public static void conquer(int[] arr,int si,int mid,int ei) {
		int[] merged=new int[ei-si+1];
		int idx1=si;
		int idx2=mid+1;
		int x=0;
		int i,j;
		
		while(idx1<=mid && idx2<=ei) {
			if(arr[idx1]<=arr[idx2]) {
				merged[x++]=arr[idx1++];
			}
			else {
				merged[x++]=arr[idx2++];
			}
		}
		
		while(idx1<=mid) {
			merged[x++]=arr[idx1++];
		}
		while(idx2<=ei) {
			merged[x++]=arr[idx2++];
		}
		
		for (i = 0,j=si ; i < merged.length; i++,j++) {
			arr[j]=merged[i];
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr=new int[num];
//		Random rand=new Random();
//		for (int i = 0; i < num; i++) {
//			arr[i]=rand.nextInt();
//		}
//		long start=System.nanoTime();
//		divide(arr, 0, num-1);
//		long end=System.nanoTime();
//		
//		System.out.println("time is:"+(end-start)/1000000L+"ms");
		
		for (int i = 0; i < num; i++) {
			arr[i]=sc.nextInt();
		}
		divide(arr, 0, num-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
