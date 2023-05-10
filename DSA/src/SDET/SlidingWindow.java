package SDET;

public class SlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,5,2,3,7,1};
		int target = 3;
		int sum =0;
		int n=arr.length;
		
		
		for(int i=0;i<n-target;i++)
		{
			for(int j=i;j<target;j++)
			sum = sum+arr[i+j];
		}
		
		System.out.println(sum);
	}

}
