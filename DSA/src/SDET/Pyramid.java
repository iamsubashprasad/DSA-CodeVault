package SDET;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 1; i <= n; i++) {
            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // inner loop to print value of j.
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
			
            System.out.println();           
	}
		for (int i = n - 1; i >= 1; i--) {
         
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
           
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
           
            System.out.println();
		
	}
}
}


