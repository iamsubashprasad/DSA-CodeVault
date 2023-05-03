package SDET;

public class FirstAndLastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,1};
		int n= arr.length;
		System.out.println();
		int i,temp=0,k=1;
		
		for(i=0;i<=n-1;i++) {
			if (arr[i]==k) {
				arr[temp]=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=arr[temp];
			}
			
		}
		for(i=0;i<=arr.length-2;i++) {
			System.out.println(arr[i]);
		}
			
	}

}
