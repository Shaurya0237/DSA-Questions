package Backtracking;

public class Blocked_Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[][] maze= {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,0,1,0}};
  BlockedMaze(maze,0,0,"",new boolean[maze.length][maze[0].length]);
	}
public static void BlockedMaze(int maze[][],int row,int col,String ans,boolean[][] visited )
{  //Positive Base Case
	if(row==maze.length-1 && col==maze[0].length-1)
	{System.out.println(ans);
	return;
	}

//Negative Base Case
	if(row==maze.length || col==maze[0].length || row==-1 || col ==-1 || maze[row][col]==1 || visited[row][col])
		return;

	
	visited[row][col]=true;
	// Top
	BlockedMaze(maze,row-1,col,ans+"T",visited);
	// Down
	BlockedMaze(maze,row+1,col,ans+"D",visited);
	// Right
	BlockedMaze(maze,row,col+1,ans+"R",visited);
	// Left
	BlockedMaze(maze,row,col-1,ans+"L",visited);
	
	visited[row][col]=false;
}
}
