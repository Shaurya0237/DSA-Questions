package arrayChallenges;

public class sorArrayLinearTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,1,0,2,1,0,0,2,2,1,2};
		int low=0;
		int mid=0;
		int temp=0;
		int high=arr.length-1;
		
		while(mid<=high) {
			if(arr[mid]==0) {
				//swap(arr[low],arr[mid]);
				temp=arr[low];
				    arr[low]=arr[mid];
				    arr[mid]=temp;
				mid++;
				low++;
				continue;
			}
			else if(arr[mid]==1)
			{
				mid++;
				continue;
			}
			else 
				//swap(arr[mid],arr[high]);
		    temp=arr[mid];
		    arr[mid]=arr[high];
		    arr[high]=temp;
		    high--;
		    continue;
		}
		for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
			 
		}

	}


}
