package array2D;

public class wavePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] array= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		 wavePrintArray(array);
	}
	public static void wavePrintArray(int[][] arr) {
	  
	for(int i=0;i<arr.length;i++)
	{
		if(i%2==0){
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
		else {
			for(int j=arr[i].length-1;j>=0;j--)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
	}
	System.out.println("END");
		
	}

}
