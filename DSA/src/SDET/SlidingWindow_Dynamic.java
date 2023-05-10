package SDET;

public class SlidingWindow_Dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 7;
		int sum = 0;
		
		int arr[]= {1,7,4,3,1,2,1,5,1};
		for (int i=0;i<arr.length;i++) {
			if(arr[i]<target) {
				sum = sum+arr[i];
				
			}
		}

	}

}
