package arrayChallenges;

import java.util.Scanner;

public class formLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		int[] arr=new int[n];
		//takeInput(arr);
		
		//Taking Input for array
			for(int i=0;i<arr.length;i++) {
			arr[i]=ss.nextInt();
		}
		sort(arr);
		display(arr);
		ss.close(); 
	}
//	public static int[] takeInput(int[] arr) {
//		 Scanner sc=new Scanner(System.in);
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		return arr;
//	}
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(compare(arr[j],arr[j+1])>0) {
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static int compare(int a,int b) {
		String ab = a+""+b;
		String ba = b+""+a;
		
		int abint=Integer.valueOf(ab);
		int baint=Integer.valueOf(ba);
		
		if(abint>baint) return -1;
		else
			return 1;
	}
	
	public static void display(int[] arr) {
		for(int i:arr) {
			System.out.print(i);
		}
	}

}
