//  https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0#

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class RotateArray{
    
    void ReverseArray(int arr[],int j,int l){
       
       while(j<l)
       {
           int temp =arr[j];
           arr[j]=arr[l];
           arr[l]=temp;
           j++;
           l--;
       }
      
    }
}

class GFG {
	public static void main (String[] args) {
		//code
		Scanner ss=new Scanner(System.in);
		RotateArray rotate=new RotateArray();
		int T=ss.nextInt();
		for(int i=0;i<T;i++)
		{
		    int N=ss.nextInt();
		    int D=ss.nextInt();
		    
		    int []arr=new int[N];
		    for(int p=0;p<N;p++)
		    {
		        arr[p]=ss.nextInt();
		    }
		    
		    rotate.ReverseArray(arr,0,D-1);
		    rotate.ReverseArray(arr,D,N-1);
		    rotate.ReverseArray(arr,0,N-1);
		    
		    for(int k=0;k<N;k++)
		    {
		        System.out.print(arr[k]+" ");
		        
		    }
		    System.out.println();
		    
		}
	}
}