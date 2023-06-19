package SDET;

public class Caesars_cipher_HackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "There's-a-starman-waiting-in-the-sky";
		int k =3;
		 int n = str.length();
		  int ascii_value=0;
		  char str_output;
		  int str_Final=0;;
		  char temp;
		  String Final_Output ="";
		  int Alpha = 26;
		  int midvalue ;
		 
		 for(int i=0;i<n;i++)
		 {
		 str_output = (str.charAt(i));
		 ascii_value = (int)str_output;
		 str_Final = ascii_value+k;
		 if ((ascii_value >=32 && ascii_value<=47) || (ascii_value>=58 && ascii_value<=64) || (ascii_value>=91 && ascii_value<=96)||(ascii_value>=123 && ascii_value<=126) )
		 {
			 Final_Output = Final_Output +str_output;
		 }
		 
		 else if (str_Final<=122)
		 {
			 
			 temp = (char)str_Final;
			 Final_Output = Final_Output +temp;
		 }
		 else
		 {
			 midvalue = Alpha-k;
			 int Result = ascii_value - midvalue; 
			 temp = (char)Result;
			 Final_Output = Final_Output +temp; 
		 }
		 }
		 
		 System.out.println(Final_Output); 
	}
}

		  
		
		 
		 
		 
		 
		 
		 
		

	
