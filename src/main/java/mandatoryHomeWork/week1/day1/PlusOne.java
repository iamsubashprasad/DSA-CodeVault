package SDET;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digits[]= new int[4];
		/*for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
              System.out.println(digits);
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        
    }*/
		
		int arr[]= {9};
		int digit[]= new int[4];
		int i, num=0;
		
		for(i=0;i<arr.length;i++) {
			num = arr[i]%10;
			digit[i]=num;
			
		}
		
		num = num+1;
		digit[i]=num;
		for(i=0;i<digit.length;i++) {
			System.out.println(digit[i]);
			
		}
	}
	}


