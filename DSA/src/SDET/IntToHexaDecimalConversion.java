package SDET;

public class IntToHexaDecimalConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 47;
		int temp;
		String HexCode= "";
		char CodeArr[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		
		while (num>0) {
			temp = num%16;
			HexCode=CodeArr[temp]+HexCode;
			num = num/16;
			
		}
		System.out.println(HexCode);
		
		
		

	}

}
