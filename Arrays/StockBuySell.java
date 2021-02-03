//  https://www.geeksforgeeks.org/stock-buy-sell/

import java.util.Scanner;
public class GFG {
	static int maxProfit(int[] arr,int n)
	{
	    int minPrice = Integer.MAX_VALUE;
	    int maxProfit = 0;
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]<minPrice)
	           minPrice = arr[i];
	        if(arr[i]-minPrice>maxProfit)
	           maxProfit = arr[i]-minPrice;
	    }
	    return maxProfit;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		    arr[i] = sc.nextInt();
		System.out.println("Maximum profit you can get is : "+maxProfit(arr,n));
	}
}