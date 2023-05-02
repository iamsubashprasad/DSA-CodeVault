package SDET;

public class ValidPalindrom_2Pointer {

	public static void main(String[] args) {
		/*Even palindrom not working
		 * Oddd palindrom is working
		 Getting print by default_everytime
		 
		 1. chec	k for the reverse , if the string and reverse matched 
		 print the results
		 
		 */
//	
		String s1= "CANADA";
		int n = s1.length();
		int start=0, end =s1.length();
		while(start<end) {
			if(s1.charAt(start)!= s1.charAt(end-1))
			{
				System.out.println("Not a valid Palindrom");
				break;
			}
			start++;
			end--;
			}
		
		System.out.println("valid Palindrom");
		}
}
//		String rev="";
//		for(int i=n-1;i>=0;i--) {
//			rev = rev+s1.charAt(i);	
//		}
//		if (s1.equals(rev)) {
//			System.out.println(s1+" "+"is a palindrom");
//		}
//		else
//			System.out.println(s1+" "+"not a palindrom");
//			
//		}
//		}
			
		/*{
		/*StringBuilder sb= new StringBuilder(s1);
		sb.reverse();
		
		if(s1.equals(sb.toString())){
			System.out.println(s1+" "+"is a palindrom");
		}
		else
			System.out.println(s1+" "+"not a palindrom");
		}
	}
}*/
