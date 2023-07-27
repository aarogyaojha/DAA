package daa_lab;

import java.util.Random;
import java.util.Scanner;

public class selection_sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Sort ssort=new Sort();
		int[] arr=new int[n];
		Random rand=new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i]=rand.nextInt();
		}
		
		long start=System.nanoTime();
		ssort.sorting(arr, n);
		long end=System.nanoTime();
		System.out.println("the time is:"+(end-start)/1000000L);

	}
}


class Sort{
	public void sorting(int arr[],int n) {
		int min,temp;
		
		for (int i = 0; i < arr.length-1; i++) {
			min=i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j]<arr[min]) {
					min=j;
				}
			}
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
}
