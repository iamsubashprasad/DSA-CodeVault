package LeetCode_Practise;

public class HappyNumber {
	/*
	 * Happy Number 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 19;
		int num, sum = 0,i=0;
		int length = String.valueOf(n).length();
		
		while (length>=1) {
			num = n%10;
			int temp = n/10;
			System.out.println(num);
			sum = sum+(num*num);
			sum = sum+(temp*temp);
			System.out.println(sum);
			length--;
			
		}

	}

}
