package Backtracking;

public class QueenPermutationWrtBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
QueenPermutation(new boolean[4],0,2,"",0);
	}
public static void QueenPermutation(boolean[] boxes,int qpsf,int tq, String ans,int col) {
{  if(qpsf==tq)
	{System.out.println(ans);
	return;	 	
	}
if(col==boxes.length)
	return;
	
	//place call
	boxes[col]=true;
	QueenPermutation(boxes,qpsf+1,tq,ans+"box_"+col+" ",col+1);
	boxes[col]=false;
	
	//not place
	QueenPermutation(boxes,qpsf,tq,ans,col+1);
	
}
	
	
}
}
