package PatternPrinting;

public class DiamonPattern_Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,i,j,k;
		 int letter = 64;
		 
		 for (i=1;i<=n;i++) {
			 for(j=1;j<=n-i;j++) {
				 System.out.print(" ");
			 }
			 
			 for (k=1;k<=i;k++) {
				 System.out.print((char)(letter+i)+" ");
				 
			
		 }
			 System.out.println();

	}
		 for (i=1;i<=n;i++) {
			 for(j=1;j<=i;j++) {
				 System.out.print(" ");
			 }
			 
			 for (k=1;k<=n-i;k++) {
				 System.out.print((char)(letter+i)+" ");
			
		 }
			 System.out.println();
		 
		 
		 
		 
	}
}
}
