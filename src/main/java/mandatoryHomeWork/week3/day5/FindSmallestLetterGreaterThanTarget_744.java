package LeetCode_Practise;

public class FindSmallestLetterGreaterThanTarget_744 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * int temp ; char MAX = 0; int counter = 0; boolean bool= false;
		 */
		//int target_num = target;
			
		
		/*for (char pos : array)
		{
			temp = pos;
			if( temp <= target_num)
			{
				
				MAX = array[counter+1];
				bool = true;
			}
			
			counter++;
		}
		
		if (bool == false)
		{
			System.out.println(array[0])	;
		}
		else {
			System.out.println(MAX);
		}
		
		

	}*/
		char array[] = {'c','f','j','k'};
		char target = 'k';
		 char temp = array[0];
		 for (int i = 0;i<=array.length-1;i++)
		 {
			 if (array[i]>temp)
			 {
				 temp = array[i];
				 break;
			 }
		 }
		
		System.out.println(temp);
	}

}
