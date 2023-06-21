package LeetCode_Practise;

public class SearchInsertPosition_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5,6},k=5;
		int i = 0;
		for( i = 0; i<=arr.length-1;i++)
		{
			if (arr[i]<k)
			{
				
			}
			else if (arr[i]>=k)
			{
				System.out.println("index should be"+ i);
				break;
			}
			else if (k>=arr.length-1) {
				System.out.println("index should be"+ i+1);
				break;
			}
			else {
				
			}
		}

	}

}
