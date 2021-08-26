import java.util.Scanner;

public class mocktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
	    int N=ss.nextInt();
	    int b =ss.nextInt();
	    int c=ss.nextInt();
	    int[] arr=new int[N];
	    
	    for(int i=0;i<N;i++)
	    {
	    	arr[i]=ss.nextInt();
	    }
//	    for(int i=0;i<N;i++)
//	    {
//       System.out.println(arr[i]);
//	    }
	    book(arr,b,c);
	    
	    		

	}
	public static void book(int[] array,int x,int y)
	{   
	    int d=0;
		
		for(int i=0;i<array.length;i++)
		{   int sum=0;
			for(int j=i;j<array.length;j++) {
			sum=sum+array[j]; 
			if(sum>=x && sum<=y) {
				d++;
			//System.out.println(sum);
			}
			//if(sum>d)continue;
		 }
		}
		System.out.print(d);
		
	}

}
