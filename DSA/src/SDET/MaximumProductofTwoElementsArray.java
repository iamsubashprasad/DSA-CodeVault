package SDET;

public class MaximumProductofTwoElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,7};
		int i,j;
		int product=1;
		int max = 0;
		
		max = product;
		
		for(i=0;i<arr.length-1;i++) {
			for(j=1+i;j<=arr.length-1;j++) {
			product = ((arr[i])-1)*((arr[j])-1);
			System.out.println(i+" "+j+" "+((arr[i])-1)*((arr[j])-1));
			
			if (product>max) {
				max = product;
			}
			
			}
			
			
		}
		
		System.out.println("Max of Two elements is"+" "+max);

	}

}
