package PatternPrinting;

public class NumberIncreasingPyramid {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int n =5,i,j;
		
		for (i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		

	}

}
