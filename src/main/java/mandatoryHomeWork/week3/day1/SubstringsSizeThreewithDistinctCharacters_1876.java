package LeetCode_Practise;

public class SubstringsSizeThreewithDistinctCharacters_1876 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aababcabc";
		int count = 0;
		
		for (int  i = 0;i<s.length()-2;i++) {
			String sub = s.substring(i, i+3);
			
			if(sub.charAt(0)!=sub.charAt(1)&& (sub.charAt(0)!= sub.charAt(2))&& (sub.charAt(0)!= sub.charAt(1))){
				count++;
			}
		}
		
		System.out.println(count);
		

	}

}
