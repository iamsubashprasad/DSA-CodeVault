package SDET;
/*
 * Bubble Sort :
 * Check the 2 digits and send the greater number in the last 
 * Run the inner loop n-i-1 because last item is getting fixed in each iteration
 * outer loop : run the loop till n-1
 * inner loop : run the loop till n-i-1
 * swap the number if the number is greater than adjacent number
 * time complextiy : O(n^2)
 * 
 */

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,7,5,6,3,0};
		int n= arr.length;
		int temp;
		
		int i,j;
		
		for(i=0;i<n;i++)
		{
			for (j=0;j<n-i-1;j++) {
				temp = arr[j];
				arr[j]= arr[j+1];
				arr[j+1]= temp;
		
			}
		}
		
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
		

	}

}
