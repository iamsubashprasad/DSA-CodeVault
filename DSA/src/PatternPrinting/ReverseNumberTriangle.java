package PatternPrinting;

public class ReverseNumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5, i,j,k;
		
		for (i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for (k=i;k<=4;k++) {
				System.out.print(k+" ");
			}
		}
		System.out.println();
	}

}
