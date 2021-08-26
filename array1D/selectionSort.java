package array1D;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int[] array={123,232,54,234,22,3424,11,23};
		    selectionsort(array);
			display(array);
					
		}
		public static void selectionsort(int[] arr) {
			for(int counter=0;counter<arr.length-1;counter++)
			{   int min=counter;
				for(int j=counter+1;j<arr.length-1;j++) {
					if(arr[j]<arr[min])
					{
						min=j;
					}
				}
				int temp=arr[min];
				arr[min]=arr[counter];
			    arr[counter]=temp;
			}

		}

	public static void display(int[] arrayprint) {
		for(int i=0;i<arrayprint.length-1;i++) {
			System.out.print(arrayprint[i]+" ");
		}
	}
		
		
	}
