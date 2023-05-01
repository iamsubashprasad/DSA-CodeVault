package SDET;

public class ValidPalindrom_2Pointer {

	public static void main(String[] args) {
		/*Even palindrom not working
		 * Oddd palindrom is working
		 Getting print by default_everytime*/
	
		
		
		String s1= "CANADA";
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
	
	


