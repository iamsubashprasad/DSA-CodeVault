package LeetCode_Practise;

public class RemoveElement_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,2,2,3};
		int k = 2;
		int temp = 0, counter= 0;
		
		for (int i = 0;i<=arr.length-1;i++)
		{
			if (arr[i]==k)
			{
				arr[temp]=arr[i];
				arr[i]= arr[i+1];
				arr[i+1]= arr[temp];
				System.out.println(arr[temp]+",");
				counter++;
						
			}
		}

	}

}
