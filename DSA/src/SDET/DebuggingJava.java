package SDET;

public class DebuggingJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Two are present in an array
		Ex1: [1,2,3,4,5], 2, 4      Output: true
		Ex2: [1,2,3,4,5], 2, 6      Output: false
		Answer: */
		int arr[]= {1,2,3,4,5};
		int x= 2;
		int y = 1;
		String Result1="";
		String Result="" ;
		    for (int i = 0; i < arr.length; i++) {
		    	if (arr[i] == x) {
		    		 Result = "True";
		    		break;
		    	}
		    	}
		    	for(int j=0;j<arr.length;j++) {
		        if (arr[j] == y) {
		        	 Result1 = "True";
		        }
		       
		        }
		        
		       if(Result == Result1) {
		    	   System.out.println("True");
		       }
		    	   else {
		    		   System.out.println("False");
		    		   
		    	   }
		    	   
		       }
		        
		}
		



