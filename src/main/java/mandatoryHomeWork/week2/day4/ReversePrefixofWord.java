package SDET;

public class ReversePrefixofWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "subash";
		char ch = 'b';
		char reversestr = 0;
		
		int indexofch = s1.indexOf(ch);
		int n= s1.length();
		
		
		
		int Remchar=(n-1)-indexofch;
		String laststr= s1.substring(indexofch+1);
		String firststr = s1.substring(0,indexofch+1);
		StringBuilder sb = new StringBuilder(firststr);
		
		
		sb.reverse();
		sb.append(laststr);
		
		System.out.print("Reverse of String is"+" "+sb);
		
		
		

	}

}
