package TowerofHanoiRecursion;

public class TowerofHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
toh(n,"src","dest","helper");

}
	public static void  toh(int n, String src,String dest,String helper ) {
		if(n==0)
			return;
		toh(n-1,src,helper,dest);
		System.out.println("move " +n+ "th disc from "+src+" to "+dest);
		toh(n-1,helper,dest,src);
	}

}
