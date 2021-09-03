package Backtracking;

public class QueenCombination {
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueenCombinations(new boolean[4],0,2,"",-1);
	}
public static void QueenCombinations(boolean[] boxes,int qpsf,int tq,String ans,int lastBoxUsed) {
	if(qpsf==tq)
	{
		count++;
		System.out.println(count+"."+ans);
		return;
	}
	
	for(int i=lastBoxUsed+1;i<boxes.length;i++)
	{ 
		
		boxes[i]=true;
		QueenCombinations(boxes,qpsf+1,tq,ans+"q"+qpsf+"b"+i+" ",i);
		boxes[i]=false;
	  
		
	}
}
}
