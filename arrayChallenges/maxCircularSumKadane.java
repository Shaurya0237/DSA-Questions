package arrayChallenges;

import java.util.Scanner;

public class maxCircularSumKadane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=ss.nextInt();
        ss.close();
		System.out.print(maxSum(arr));
	}
public static int maxSum(int[] arr) {
	int max_kadane=kadane(arr);//if we get max sum in a sub array.
	
	//as we have a circular array, if we need to get max sum, we need to also check if we are getting 
	//max sum from extreme positions in a non-circular array. eg:{12 -31 -2 29} now we need to take only sum of 12 and 29.
	// so we take total sum using kadane and changing signs, and then subtracting these non-contributing elements (i.e. -31 and -2).
	
	int max_wrap=0;
	for(int i=0;i<arr.length;i++) {
		max_wrap+=arr[i];
		arr[i]=-arr[i];
	}
	
	int non_contb_sum=kadane(arr);
	max_wrap=max_wrap+non_contb_sum;
	return(max_wrap>max_kadane?max_wrap:max_kadane);
}

public static int kadane(int[] arr) {
	int max_end_here=0;
	int max_so_far=0;
	for(int i=0;i<arr.length;i++) {
		max_end_here+=arr[i];
		
		if(max_end_here<0)
			max_end_here=0;
		
		if(max_so_far<max_end_here)
			max_so_far=max_end_here;
	}
	return max_so_far;
}
}
