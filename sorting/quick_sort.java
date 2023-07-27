package daa_lab;

import java.util.Random;
import java.util.Scanner;

public class quick_sort {
	
	public static void quicksort(int[] arr,int low,int high) {
		if(low<high) {
			int pidx=partition(arr, low, high);
			
			quicksort(arr, low, pidx-1);
			quicksort(arr, pidx+1, high);
		}
	}
	
	public static int partition(int[] arr,int low,int high) {
		int pivot=arr[high];
		int i=low-1;
		for (int j = low; j < high; j++) {
			if(arr[j]<pivot) {
				i++;
//				swapping arr[i] and arr[j]
				
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		return i;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr=new int[num];
		Random rand=new Random();
		for (int i = 0; i < num; i++) {
			arr[i]=rand.nextInt();
		}
		long start=System.nanoTime();
		quicksort(arr, 0, num-1);
		long end=System.nanoTime();
		
		System.out.println("time is:"+(end-start)/1000000L+"ms");
//		for (int i = 0; i < num; i++) {
//			System.out.println(arr[i]);
//		}
	}

}
