package SDET;

public class MissingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Declare the array (Sorted Array)
		 * Check the subsequent number starting from index+1
		 * if number matched, navigate to next index
		 * if number not matched , print the missing number
		 * Unsorted Array
		 *  {2,5,1,3,4,9,8} = sum = (n+1)/2
		 *  n = 
		 */
		
		/*int arr[]= {-2,-1,0,1,2,3,4,6};
		int index = arr[0];
		for (int i = 0;i<arr.length;i++) {
			if(arr[i]!=index) {
				System.out.println("Missing Number is"+" "+index);
				i--;
			
			}
			index++;
		}

	}*/
		
		int arr[]= {1,2,3,5};
		int n = arr.length;
		int sum =0;
		sum =((n+1)*(n+2))/2;
		System.out.print("Sum of array"+" "+sum+"\n");
		for (int i=0; i<n;i++) {
			sum = sum-arr[i];
			
			
		}
		
			System.out.println("Mising Number"+" "+sum);
		}

	}

