package SDET;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String str = "Chennai Super King";
		String reversedStr = "";
		
		for (int i=0; i<str.length();i++)
		{
			reversedStr = str.charAt(i) + reversedStr;
			
		}
		System.out.println(reversedStr);

	}*/

	String Str = "Chennai Super King";
	String s[]= Str.split(" ");
	String reverse= "";
	for(int i= 0;i<s.length;i++) {
		reverse = s[i]+" "+reverse;
		
	}
		System.out.print(reverse);
}
}
