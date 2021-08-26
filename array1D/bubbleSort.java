package array1D;

import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] array={123,232,54,234,22,3424,11,23};
	    bubblesort(array);
		display(array);
				
	}
	public static void bubblesort(int[] arr) {
		for(int counter=0;counter<arr.length-1;counter++)
		{   
			for(int j=0;j<arr.length-1-counter;j++) {
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
				    arr[j+1]=temp;
				}
			}
		}

	}

public static void display(int[] arrayprint) {
	for(int i=0;i<arrayprint.length-1;i++) {
		System.out.print(arrayprint[i]+" ");
	}
}
	
	
}
