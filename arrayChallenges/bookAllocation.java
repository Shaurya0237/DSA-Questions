package arrayChallenges;

import java.util.Scanner;

public class bookAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		int k=ss.nextInt();
		long[] arr =new long[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=ss.nextInt();
        ss.close();
 long ANS=bookallocation(arr,n,k);
 System.out.print(ANS);
	}
public static long bookallocation(long[] arr,int n,int k) {
    long lo = arr[arr.length - 1];
    long totalpages = 0;
    long hi = 0;
    for (int i = 0; i < n; i++) {
        totalpages += arr[i];
    }
    hi = totalpages;
    long ans = 0;
    while (lo <= hi) {
        long mid = (lo + hi) / 2;
        boolean isvalid = isValid(arr, k, mid);
        if (isvalid) {
            ans = mid;
            hi = mid - 1;
        } else {
            lo = mid + 1;
        }
    }
    return ans;
}
private static boolean isValid(long[] arr, long k, long mid) {
    long sum = 0;
    int noOfstudents = 1;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
        if (sum > mid) {
            noOfstudents++;
            sum = arr[i];
            if (noOfstudents > k) {
                return false;
            }
        }
    }
    return true;
}
}
