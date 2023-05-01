package SDET;

public class ReverseArray_2Pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s1[]= {2,3,4,5,6};
		int start=0,end=s1.length-1;
		int temp;
		
		while(start<end)
		{
			temp = s1[start];
			s1[start]=s1[end];
			s1[end]= temp;	
			start++;
			end--;
		}
		
      for(int i=0;i<s1.length;i++)
      {
    	  System.out.print(s1[i]+" ");
      }
	}

}
