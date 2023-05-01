package SDET;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digits[]= new int[4];
		for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
              System.out.println(digits);
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        
    }

	}


