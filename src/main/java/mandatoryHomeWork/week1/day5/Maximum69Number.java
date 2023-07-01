package SDET;

public class Maximum69Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 9669;
		String str = String.valueOf(num);
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if (ch[i]=='6') {
				ch[i]='9';
			}
		}
		System.out.println(Integer.parseInt(String.valueOf(ch)));
		}
		

	}


