//  https://www.geeksforgeeks.org/window-sliding-technique/
//  https://ide.geeksforgeeks.org/f2BF5u3xem

public class Solution {
    
    static int MaxSum(int [] arr,int k,int n){
        if(n<k)
        {
            System.out.print("Invalid");
            return -1;
        }
        int maxSum=0;
        for(int i=0;i<k;i++)
        maxSum+=arr[i];
        
        int windowSum=maxSum;
        for(int i=k;i<n;i++)
        {
            windowSum+=arr[i]-arr[i-k];
            maxSum=Math.max(windowSum,maxSum);
        }
        return maxSum;
    }

public static void main(String[] args){
    int []arr={1,2,3,4,5,9,10,-13,12,100};
    int k=2;
    int n=arr.length;
    System.out.print(MaxSum(arr,k,n));
}
}
