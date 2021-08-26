package Pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		
		int nsp=n-1;
		int nst=1;
		int row=1;
		
		
		while(row<=n) {
			int val=1;
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print("\t");
			}
			for(int cst=1;cst<=nst;cst++) {
				System.out.print(val+"\t");
	            if(cst<=nst/2)
	            	val++;
	            else
	            val--;
	            
			}
			System.out.println();

            nsp--;
            nst+=2;
            row++;

		}

	}

}
