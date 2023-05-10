package LeetCode_Practise;

public class MaximumAverageSubarray_643 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "aababcabc";
		int temp = 0;
		char[] arr = s1.toCharArray();
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[temp]=arr[i];
				if(temp>3) {
					break;
				}
				temp++;
				
				
			}
		}
		
		for(int i=0;i<arr.length-3;i++) {
			System.out.println(arr[i]);
		}

	}

}
