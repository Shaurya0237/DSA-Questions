//  https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    public static void twoPointer(int [] arr,int left,int right){
        while(left<=right){
        
        if(arr[left]<0 && arr[right]<0)
        left++;
        
        else if(arr[left]>0 && arr[right]<0)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        
        else if(arr[left]>0 && arr[right]>0)
        right--;
        
        else
        {
            left++;
            right--;
        }
    }
    }
   static void display(int[] arr,int size){
        for(int i=0;i<size;i++)
        System.out.print(arr[i]+" ");
    }
    
    
    
	public static void main (String[] args) {
		int []arr={-19,9,-45,5,6,-8,67,-55,-15,-19,89,677,90};
		int size=arr.length;
		twoPointer(arr,0,size-1);
		display(arr,size);
	}
}
