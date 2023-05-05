package LeetCode_Practise;

public class ReverseWordsinaString_557 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "India is great";
		
		String arr[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String words:arr) {

			StringBuilder newsb = new StringBuilder(words);
			newsb.reverse();
			sb.append(newsb);
			sb.append(" ");
			
			
		}
		System.out.println(sb);

	}

}
