package SDET;

public class moveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		int arr[]= {0,1,0,3,12};
		int temp=0;
		int output[]= new int[arr.length];
		
		for (i=0;i<arr.length;i++) {
			if(arr[i]>0) 
				output[temp++]=arr[i];		
		}
		for (i=0;i<output.length;i++) {
			System.out.print(output[i]);
		}
		
	}
}
		
		
		
		
		
	
      

