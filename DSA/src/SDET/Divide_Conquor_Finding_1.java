package SDET;

public class Divide_Conquor_Finding_1 {
	
	/*
	 * arr = [0,0,0,1,1,1,];
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,0,0,0,0,0};
		int left =0,i;
		int right = arr.length;
		int len =0;
		int mid =  0;
		
		while (left<right) {
			mid = (left+right)/2;
			if(arr[mid]==1) {
			right = mid-1;
			}
			
			else {
				left = mid+1;
			}
		}
	
		len = arr.length - left;
		System.out.println(len);

	}

}
