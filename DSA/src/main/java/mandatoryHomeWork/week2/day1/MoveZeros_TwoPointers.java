package SDET;

public class MoveZeros_TwoPointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,0,3,12};
		int output[]= new int[arr.length];
		int i;
		
		int temp=0;
		
		for (i=0;i<arr.length;i++) {
			if(arr[i]>0) 
				output[temp++]=arr[i];		
		}
		for (i=0;i<output.length;i++) {
			System.out.print(output[i]);
		}
		
		
		
	}

	

}
