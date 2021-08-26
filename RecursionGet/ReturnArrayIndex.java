package RecursionGet;
//return indices of arrays where a requested element occurs.
public class ReturnArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int[] res;
		int[] array= {5,34,23,23,5,5,22,67,88,5};
		res=allIndices(array,0,5,0);
		for(int i:res)
		System.out.println(i);
	}
	public static int[]  allIndices(int[] arr,int si,int data,int count){
		if(si==arr.length) {
			int[] base=new int[count];
		return base;
		}
		
		int[] indices=null;
		if(arr[si]==data)
			indices=allIndices(arr,si+1,data,count+1);
		else
			indices=allIndices(arr,si+1,data,count);
		
		if(arr[si]==data)
			indices[count]=si;
		
		return indices;
	
	}


}
