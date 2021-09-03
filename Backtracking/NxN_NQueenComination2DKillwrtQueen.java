package Backtracking;

public class NxN_NQueenComination2DKillwrtQueen {
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board=new boolean[5][5];
   NQueen(board,0,0,board.length,"");
	}
public static void NQueen(boolean[][] board,int row,int qpsf,int tq,String ans)
{ if(qpsf==tq)
{
	System.out.println(++count+") "+ans);
	return;
}
if(row==board.length)
	return;
	
	for(int col=0;col<board.length;col++)
 { 
	if(isItSafeToPlaceQueen(board,row,col))
	{board[row][col]=true;
	NQueen(board,row+1,qpsf+1,tq,ans+"{"+row+","+col+"}");
	board[row][col]=false;	
	}
 }
}
public static boolean isItSafeToPlaceQueen(boolean[][] board,int row,int col) {
//checking vertically up
	int r=row-1;
	int c=col;
	
	while(r>=0)
	{
		if(board[r][c])
			return false;
		r--;
	}
//checking  Left
	r=row;
	c=col-1;
	while(c>=0)
	{
		if(board[r][c])
			return false;
		
		c--;
	}

//checking diagonally left
	r=row-1;
	c=col-1;
	while(r>=0 && c>=0)
	{
		if(board[r][c])
			return false;
		r--;
		c--;
	}

//checking diagonally right
	r=row-1;
	c=col+1;
	while(r>=0 && c<board[0].length)
	{
		if(board[r][c])
			return false;
		
		r--;
		c++;
	}
return true;
}
}
