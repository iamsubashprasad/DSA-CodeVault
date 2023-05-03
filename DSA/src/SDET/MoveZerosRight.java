package SDET;

public class MoveZerosRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j;
		int arr[]= {1,1,0,3,12};
		int temp=0;
		int output[]= new int[arr.length];
		
		for (i=1;i<arr.length;i++) {
			if(arr[i]==0) {
				for(j=i;j>temp;j--)
			{
				temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
			//temp++;
		
	}
		

	}
		for (i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
}
}


