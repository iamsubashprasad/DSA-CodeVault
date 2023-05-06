package SDET;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {11,4,17,18,2,22,1,8};
		int i, j, temp =0;
		
		for (i=0;i<arr.length;i++) {
			
			for (j=i+1;j<arr.length;j++)
			{
				if (arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
			}
			}
			
		}
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
