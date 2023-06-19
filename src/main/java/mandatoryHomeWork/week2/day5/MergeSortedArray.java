package SDET;

import java.util.Arrays;

public class MergeSortedArray {
	
	/*
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1[] = {1,2,3};
		int num2[] = {7,4,5};
		int l1 = num1.length;
		int l2 = num2.length;
		int sortarr[]= new int[l1+l2];
		int i=0, j=0, k=0;
		
		while(i<l1) {
			sortarr[k++]= num1[i];
			System.out.print(sortarr[i]+" ");
			i++;
		}
		
		while(j<l2) {
			
			sortarr[k++]= num2[j];
			System.out.print(sortarr[k]+" ");
			j++;
		}
		Arrays.sort(sortarr);
		 
		for (i=0;i<=num1.length;i++) {
			System.out.print(sortarr[i]+" ");
			
		}
		

	}

}
