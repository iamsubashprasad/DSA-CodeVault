package PatternPrinting;

public class InvertedTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5,i,j;
		int counter=0;
		for(i=1;i<=5;i++) {
			for(j=5;j>=n-i;j--) {
				System.out.print(" ");
				}
				for(int k=5;k>=i;k--) {
					System.out.print("* ");	
			}
			
				System.out.println(" ");
		}
		


	for(i=1;i<=5;i++) {
		for(j=5;j>=i;j--) {
			System.out.print(" ");
			}
			for(int k=5;k>=n-i;k--) {
				System.out.print("* ");	
		}
		
			System.out.println(" ");
	}
	

}
}
