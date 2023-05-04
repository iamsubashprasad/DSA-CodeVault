package PatternPrinting;

public class DiamondPatternUsingForLoop_samecodeforbothpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=8, i,j,k;
		
		for (i=1;i<=n;i++) {
			for (j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		
		for (i=n;i>=1;i--) {
			for (j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}


	}

}
