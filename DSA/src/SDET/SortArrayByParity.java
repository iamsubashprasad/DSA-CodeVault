package SDET;

public class SortArrayByParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,2,4};
		int temp=0,k=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0)
			{
			}
			else{
				temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				k++;
			}
			
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j]);
		}
			System.out.println();
		
		
		/*
		 * Printing the final array
		 */
//		for(int i=0;i<arr.length-1;i++) {
//			System.out.println(arr[i]);
		
		}
	}
}

	


