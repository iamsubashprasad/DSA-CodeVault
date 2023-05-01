package SDET;

public class AddingDeletingIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,4,5};
		int index=2;
		int newNumber=3;
		int n=0,pos=0;
		int ele=0;
		
		 int i; 
		  
	        int newarr[] = new int[n + 1]; 
	  
	     
	        for (i = 0; i < n + 1; i++) 
	        { 
	            if (i < pos - 1) 
	                newarr[i] = arr[i];  
	            else if (i == pos - 1) 
	                newarr[i] = ele;      
	            else
	                newarr[i] = arr[i - 1]; 
	        } 
		
			}
			
		

	}


