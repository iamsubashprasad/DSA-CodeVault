package SDET;
/*
 * 1. enter the number 
 * 2. extract number/10 : Quotient
 * 3. Extract num%10 : Remainder
 * 4. cube the number and compare the cube number and original number
 */

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 159;
		int sum = 0;
		int temp =0;
		 while (num>0) {
			 temp = num%10;
			 sum =sum+ num*num*num;
			 num = num/10;
			 
			 
			 
		 }
		 if (sum ==num) {
			 System.out.println(num+" "+"the given number is armstrongnumber"); 
		 }
		 else 
			 System.out.println(num+" "+"the given number is not a armstrongnumber");

	}

}
