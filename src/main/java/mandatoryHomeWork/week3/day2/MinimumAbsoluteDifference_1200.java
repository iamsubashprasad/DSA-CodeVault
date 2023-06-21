package LeetCode_Practise;

public class MinimumAbsoluteDifference_1200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {4,2,1,3};
		 int i;
		 int temp=-1, MIN_Value = 999, temp_new=0;
		 
		 for (i = 0;i<arr.length ;i++) {
			  temp = arr[i+1]- arr[i];
			  temp  = Math.abs(temp);
			 if (temp < MIN_Value) {
				 arr[temp_new++] = arr[i];
				 arr[temp_new++] = arr[i+1];
				 MIN_Value = temp;
				 
			 }
			 
		 }
		
		 for (i = 0;i<arr.length;i++) {
			 System.out.print(arr[temp_new]);
		 }

	}

}
