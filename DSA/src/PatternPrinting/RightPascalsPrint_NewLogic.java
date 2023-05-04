package PatternPrinting;

public class RightPascalsPrint_NewLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,i,j;
		int counter=0;
		for(i=1;i<=5;i++) {
				for(int k=1;k<=i;k++) {
					System.out.print("* ");	
			}
			
				System.out.println(" ");
		}
		
		for(i=1;i<=5;i++) {
				for(int k=1;k<=n-i;k++) {
					System.out.print("* ");	
			}
				System.out.println(" ");
				
				
				
	}


	}

}
