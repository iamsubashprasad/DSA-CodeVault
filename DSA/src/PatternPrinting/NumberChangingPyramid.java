package PatternPrinting;

public class NumberChangingPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =5,i,j;
		int num =1;
		
		for (i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				
				System.out.print(num+" ");
				num++;
			}
			
			System.out.println();
	}
		

}
}
