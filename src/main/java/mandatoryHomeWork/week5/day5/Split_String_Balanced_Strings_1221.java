package LeetCode_Practise;

public class Split_String_Balanced_Strings_1221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "RLRRRLLRLL" ;
		
		int count = 0;
		int R=0, L=0;
		
		for (int i = 0;i<s.length();i++)
		{
			if(s.charAt(i)== 'R')
			{
				R++;
			}
				
			else if (s.charAt(i)== 'L')
			{
				L++ ;
			}
			
			if (R==L)
			{
				count++ ;
			}
					
		}
	
		System.out.println(count);
		
	}
		
}
