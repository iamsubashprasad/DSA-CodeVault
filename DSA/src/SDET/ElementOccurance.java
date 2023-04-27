package SDET;

public class ElementOccurance {
	public static void main(String args[]) {
		int count =1 ;
		int arr[]= {1,1,2,3,4,4,5};
		for (int i=0;i<=arr.length;i++) {
			if(i>arr.length) {
				break;
			}
				if(arr[i]==arr[i+1]) {
					count = count+1;
				}
					
				else {
					System.out.println(arr[i]+" "+count);
					count = 1;
					
					
				}
					
				}
					
				
				}
					
				}
		
		
		


	

