package array1D;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={11,55,67,77,98,102,143};
		
		Scanner ss=new Scanner(System.in);
		int x=ss.nextInt();
		//System.out.print(x);
		System.out.println(binarysearch(array,x));
	}
		public static int binarysearch(int[] arr,int n){
			int lo=0;
			int hi=arr.length-1;
			
			
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			
			if(arr[mid]<n)
				lo=mid+1;
			
			else if(arr[mid]>n)
				hi=mid-1;
			else    
				return mid;
		              }
		return -1;
	     }
 

}
