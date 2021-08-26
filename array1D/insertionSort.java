package array1D;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int[] array={123,232,54,234,22,3424,11,23};
		    selectionsort(array);
			display(array);
					
		}
		public static void selectionsort(int[] arr) {
			for(int counter=1;counter<arr.length-1;counter++)
			{  int val=arr[counter];
			
			int j=counter-1;
			while(j>=0 && arr[j]>val) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=val;
			}

		}

	public static void display(int[] arrayprint) {
		for(int i=0;i<arrayprint.length-1;i++) {
			System.out.print(arrayprint[i]+" ");
		}
	}
		
		
	}
