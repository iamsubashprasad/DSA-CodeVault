package SDET;

public class MergeStringsAlternately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "abcpoiuytr";
		String s2= "defghj";
		
		int l1= s1.length(),i;
		int l2= s2.length();
		char merge1;
		char merge2;
		StringBuilder sb= new StringBuilder();
		
		if (l1==l2) {
			for(i=0;i<l1;i++) {
				merge1=s1.charAt(i);
				merge2=s2.charAt(i);
				sb.append(merge1);
				sb.append(merge2);
				
			}
		}
		
		else if (l2>l1) {
			String middlestr= s2.substring(l1);
			for(i=0;i<l1;i++) {
				merge1=s1.charAt(i);
				merge2=s2.charAt(i);
				sb.append(merge1);
				sb.append(merge2);
		}
		System.out.println(sb.append(middlestr));
		

	}
		else
		{
			String middlestr= s1.substring(l2);
			for(i=0;i<l2;i++) {
				merge1=s1.charAt(i);
				merge2=s2.charAt(i);
				sb.append(merge1);
				sb.append(merge2);
		}
		System.out.println(sb.append(middlestr));
		}

}
}
