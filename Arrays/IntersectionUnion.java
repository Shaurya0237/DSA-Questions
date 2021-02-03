//  https://www.geeksforgeeks.org/find-union-and-intersection-of-two-unsorted-arrays/
import java.util.Scanner;
import java.util.Arrays;
class IntersectionUnion 
{ 
    static void printIntersection(int[] arr1,int m,int[] arr2,int n)
    {
        if(m>n)
        {
            int temp[] = arr1;
            arr1 = arr2;
            arr2 = temp;
            
            int size = m;
            m = n;
            n = size;
        }
        
        Arrays.sort(arr1);
        for(int i=0;i<n;i++)
        {
            if(binarySearch(arr1,arr2[i])!=-1)
               System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
    
    static void printUnion(int[] arr1,int m,int[] arr2,int n)
    {
        if(m>n)
        {
            int temp[] = arr1;
            arr1 = arr2;
            arr2 = temp;
            
            int size = m;
            m = n;
            n = size;
        }
        
        Arrays.sort(arr1);
        for(int i=0;i<m;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
            if(binarySearch(arr1,arr2[i])==-1)
               System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
    
    static int binarySearch(int[] arr,int x)
    {
        int l = 0;
        int r = arr.length-1;
        while(l<r)
        {
            int mid = (l+r)/2;
            if(arr[mid]==x)
               return mid;
            else if(x<arr[mid])
               r = mid-1;
            else
               l = mid+1;
        } 
        return -1;
    }
	// Driver method to test above 
	public static void main(String args[]) 
	{ 
		int arr1[] = { 7, 1, 5, 2, 3, 6 };
        int arr2[] = { 3, 8, 6, 20, 7 };
        int m = arr1.length;
        int n = arr2.length;
		System.out.println("Intersection of two arrays is :");
		printIntersection(arr1,m,arr2,n);
		System.out.println("Union of two arrays is :");
		printUnion(arr1,m,arr2,n);
	} 
} 
