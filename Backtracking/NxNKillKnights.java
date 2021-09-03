package Backtracking;

public class NxNKillKnights {
 static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    boolean board[][]=new boolean[3][3];
    NKillKnight(board,board.length,0,0,0,"");
	}
public static void NKillKnight(boolean board[][],int tk,int kpsf,int row,int col,String ans)
{ //Positive Base Case
	if(kpsf==tk)
	{
		System.out.println(++count+")"+ans);
		return;
	}
//Manually change row
	if(col==board[0].length)
	{
		row++;
		col=0;
	}
//Negative Base Case
if(row==board.length)
	return;
//place
	if(isItSafeToPlaceKnight(board,row,col))
	{
	board[row][col]=true;
	NKillKnight(board,tk,kpsf+1,row,col+1,ans+"{"+row+","+col+"}");
	board[row][col]=false;
	}
//not place
	NKillKnight(board,tk,kpsf,row,col+1,ans);
}
public static boolean isItSafeToPlaceKnight(boolean board[][],int row ,int col)
{
	int[] rowArr= {-1,-2,-2,-1};
	int[] colArr= {2,1,-1,-2};
	
	for(int i=0;i<4;i++)
	{ int r=row+rowArr[i];
	  int c=col+colArr[i];
		if(r>=0 && r<board.length && c>=0 && c<board[0].length)
		{
			if(board[r][c])
				return false;
		}
	}
	return true;
}
}
