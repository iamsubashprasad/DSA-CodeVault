package LeetCode_Practise;

import java.util.Arrays;

public class Flipping_an_Image_832 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{1,1,0},{1,0,1},{0,0,0}};
		
		
		//[[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]] n/2 =2
		
		/* 
		 *  i= 0 
		 *   j= 0 --> 1
		 */
		
		int n = arr.length, i,j; 
		System.out.println("length of the array"+n);
		int [] img = new int[20];
		
		for(i=0;i<n;i++)
		{
		img = arr[i];
		int left=0, right= img.length-1;
		
		while(left<right) {
					int temp=img[left];
					img[left++]=img[right];
					img[right--]=temp;
					
		}
		
		System.out.println(Arrays.toString(img));
		}
		
	

	}

}
