package SDET;

public class NumberReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 123567;
		int rem=0;
		
		
		while (num>0) {
			rem = num%10;
			num = num/10;
			System.out.print(rem);
			//num = num/2;
			//System.out.println(num);
			
		}

	}

}
