package Pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		 
		int nsp=1;
		int nst=n/2;
		int row=1;
		
		while(row<=n) {
			
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("*");
			}
			
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print(" ");
			}
			
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			if(row<=n/2) {
				nsp+=2;
			    nst--;
			}
			else {
			nsp-=2;
			nst++;
			}
			row++;
			
			}
			
		}
		
				

	}


