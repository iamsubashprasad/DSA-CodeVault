package LeetCode_Practise;
import java.util.*;

public class Contains_Duplicate_II_219 {

	public static void main(String[] args) {
		int i,j,temp = 0 ;
		int k = 3;
		Scanner sc1= new Scanner(System.in);  
		//enter the array size
		System.out.print("Enter array size - ");  
		int n = sc1.nextInt();  
		int arr[] = new int[n];
		// Enter the array elements
		for (i = 0; i<=n-1 ; i++)
		{
			System.out.print("Enter array element- ");  
			 arr[i]= sc1.nextInt();  
		}
		
		for (j = 0;j<=arr.length-1;j++)
		{
			for (int p=j;p<=arr.length-1;p++)
		{
			if (arr[j]==arr[p+1])
			{
				temp = arr[j]-arr[p];
				temp = Math.abs(temp);
				if (temp<=3)
				{
					System.out.println("True");
					break;
				}
				else {
					System.out.println("false");
				}
			}
			
		}
		

	}
		

}
	
}
