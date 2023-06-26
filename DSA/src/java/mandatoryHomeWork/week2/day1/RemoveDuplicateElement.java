package SDET;

public class RemoveDuplicateElement {
	/*
	 * 1. Check the first  and the subsequent element , if matches move the element
	 * 2. if not matches , continue the loop
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,1,1};
		int temp=0;
		int i = 0;
		int n = arr.length;
		
		for (i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {
				arr[temp++]=arr[i+2];	
			}
			
		}
				arr[temp++]=arr[n-1];
				for(int j=0;j<temp-1;j++) {
			    	   System.out.print(arr[j]+" ");

	}


	}

}
