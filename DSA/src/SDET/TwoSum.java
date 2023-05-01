package SDET;

import org.junit.Test;

public class TwoSum {

	public static void main(String[] args) {
		
		int arr[]= {3,2,4};
		int target =6;
		int start=0,end=arr.length-1;
		
		int index_arr[]= new int[2];
		
		while(start<end) {
			
			if(arr[start]+arr[end]==target) {
				start=arr[start];
				
				System.out.println(start-1);
				System.out.println(end-1);
				break;
			}
			else if (arr[start]+arr[end]<target){
				start++ ;
			}
			else if (arr[start]+arr[end]>target) {
				end-- ;
			}
		}
	
	}// TODO Auto-generated method stub
		
	

}
