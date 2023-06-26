package SDET;

public class FirstAndLastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,1,5};
		int n= arr.length;
		System.out.println();
		int i,temp=0,k=1;
		
		for(i=0;i<n;i++) {
			if (arr[i]!=k) {
				arr[temp++]=arr[i];
			}
			
		}
		for(i=0;i<=arr.length-4;i++) {
			System.out.print(arr[i]);
		}
			
	}

}
