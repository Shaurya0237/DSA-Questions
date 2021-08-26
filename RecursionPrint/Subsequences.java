package RecursionPrint;

public class Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  printSS("abc","");
	}
	public static void printSS(String str,String Result) {
		if(str.length()==0)
		{
			System.out.println(Result);
			return;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		printSS(ros,Result);
		printSS(ros,Result+cc);
	}

}
