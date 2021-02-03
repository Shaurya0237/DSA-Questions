// https://www.geeksforgeeks.org/c-program-cyclically-rotate-array-one/
// https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1#

// { Driver Code Starts
//Initial Template for Java
lic static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	pub Compute();
            obj.rotate(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Compute {
    
    public void rotate(long arr[], long n)
    { long temp1;
for(int i=(int)n-1; i>0; i--){
temp1=arr[i-1];
arr[i-1]=arr[i];
arr[i]=temp1;
    }
    }
}
