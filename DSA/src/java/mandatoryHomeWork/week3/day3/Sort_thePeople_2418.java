package LeetCode_Practise;

public class Sort_thePeople_2418 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name[] = {"Alice","Bob","Bob"};
		int size = name.length;
		int height[] = {180,165,170};
		String arr[] = new String[size];
		int i=0,j=0, temp = 0;
		for (i=0;i<name.length-1;i++)
		{
			if (height[i]<height[i+1])
			{
				arr[i]= name[i+1];
				arr[i+1]= name[i];
				System.out.print(arr[i]+",");
				
				/*
				 * name[temp] = Alice
				 * name[1] = bob
				 * name[0] = Alice
				 */
				
			}
			else
			{
				arr[i]=name[i];
				System.out.print(arr[i]+",");
			}
			
			
		}
		
		System.out.print(arr[i]+",");
	}

}
