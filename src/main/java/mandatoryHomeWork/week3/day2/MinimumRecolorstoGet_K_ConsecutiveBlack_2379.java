package LeetCode_Practise;

public class MinimumRecolorstoGet_K_ConsecutiveBlack_2379 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str = "WBBWWBBWBW";
	char arr[] = str.toCharArray();
	int len = str.length();
	int k = 7 ;
	int counter = 0;
	int Change = 0;
	
	//System.out.println(len);
	
	for(int i= 0;i<k;i++) {
		if (arr[i]=='W') {
			arr[i]='B';	
			counter = 0;
			Change++;
		}
		else {
			counter++;
			if (counter>2)
			System.out.println("No changes need to be made, since 2 consecutive black blocks already exist.");
		}
	}
	System.out.println(Change);
	}
	
	

	}

