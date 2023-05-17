package LeetCode_Practise;

public class TwoSum_UsingTwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,7,3,2};
		int temp[] = new int[2] ; 
		int left  = 0 , right  = arr.length-1 , k = 9;
		int i = 0;
		boolean bool = false ;
		while (left <= right) {
			if (arr[left]+arr[right]==k)
			{	bool = true ;
				temp[0]= left;
				temp[1]= right;
				System.out.println(temp[0]+" "+temp[1]);
				break;
			}
			left++;
			right--;
		}
		 if (bool == false) {
			 System.out.println("key is not present is in the array");
		 }
	}

}
