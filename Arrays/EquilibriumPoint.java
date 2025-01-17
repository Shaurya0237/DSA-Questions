// https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1
.
.
// { Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class Equilibrium {
    
        public static void main(String[] args) throws IOException {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
            while (t-- > 0) {
                
                //taking input n
                int n = Integer.parseInt(br.readLine().trim());
                long arr[] = new long[n];
                String inputLine[] = br.readLine().trim().split(" ");
                
                //adding elements to the array
                for (int i = 0; i < n; i++) {
                    arr[i] = Long.parseLong(inputLine[i]);
                }
    
                EquilibriumPoint obj = new EquilibriumPoint();
                
                //calling equilibriumPoint() function
                System.out.println(obj.equilibriumPoint(arr, n));
            }
        }
    }// } Driver Code Ends
    
    
    class EquilibriumPoint {
    
        // Function to find equilibrium point
        // a: input array
        // n: size of array
        public static int equilibriumPoint(long arr[], int n) {
    long sum=0;
    for(int i=0;i<n;i++)
    sum=sum+arr[i];
    long left_sum=0;
    
    for(int i=0;i<n;i++){
      if(left_sum==sum-arr[i])
      return i+1;
      left_sum+=arr[i];
      sum-=arr[i];
    }
    return -1;
    }
    }