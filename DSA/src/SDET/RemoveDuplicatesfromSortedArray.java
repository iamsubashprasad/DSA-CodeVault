package SDET;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		//int arr[]= {0,0,1,1,1,2,2,3,3,4};
		int arr[]= {1,2,2,3,4,4,5,6,6,7};
		int temp = 0;
		int n = arr.length;
		
		for (i=0;i<arr.length-1;i++) {
				if(arr[i]==arr[i+1]) {
					arr[temp++]=arr[i];	
				}
				
			}
			
		arr[temp++]=arr[n-1];
		
		for(int k=0;k<temp;k++) {
	    	   System.out.print(arr[k]+",");

	}

}
}
