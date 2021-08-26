package Pattern;

public class PatternusingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=5;
     pattern(n,0,0);
	}
	
	public static void pattern(int n,int row,int col)
	{
	 if(row>n)
		 return;
	 
	 if(col>row)
	 {
		 System.out.println();
		 pattern(n,row+1,1); // to shift on a new row
		 return;
	 }
	 System.out.print("* \t");
	  pattern(n,row,col+1); //to print in same row but next column
	}

}
