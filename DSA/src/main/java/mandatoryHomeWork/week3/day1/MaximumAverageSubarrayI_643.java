package LeetCode_Practise;
/*
 * Note : Not working for all the inputs 
 */

public class MaximumAverageSubarrayI_643 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,12,-5,-6,50,3};
		int k = 4;
		float avergae = 0 ;	
		int sum  = 0;
		float MAX_AVG = 0;
		for (int i = 0;i<k;i++) {
			 sum = sum+arr[i];
			 if (i>=k-1) {
				 avergae = sum/k;
				 if(avergae>MAX_AVG ) {
					 avergae = MAX_AVG;
				 }
				sum = sum - arr[i-(k-1)];
			 }
			 
		
		
		

		}
		
		System.out.println(avergae);
	}
}

