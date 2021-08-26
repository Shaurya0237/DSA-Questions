package arrayChallenges;

import java.util.Scanner;

public class maxSubArrSumKAdane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int n =ss.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=ss.nextInt();
		int Sum;
		ss.close();
		Sum=kadane(arr);
		System.out.print(Sum);
		

	}
	public static int kadane(int[] arr) {
		int max_so_far=0;
		int max_end_here = 0;
		
		for(int i=0;i<arr.length;i++) {
			max_end_here +=arr[i];
			
			if(max_end_here<0)
				max_end_here=0;
			
			if(max_so_far<max_end_here)
				max_so_far=max_end_here;
				
		}
		return max_so_far;
	}

}
