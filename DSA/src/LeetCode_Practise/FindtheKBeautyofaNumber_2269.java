package LeetCode_Practise;
import java.util.Scanner;
/*
 * 240 = 24  -- i,k
 * 40 ---i,
 */

public class FindtheKBeautyofaNumber_2269 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter Num Value- ");  
		int a= sc.nextInt();  
		
		System.out.print("Enter K Value- ");  
		int k = sc.nextInt(); 
		
		String convert_num = Integer.toString(a);
		for (int i = 0 ; i<convert_num.length()-1;i++)
		{
			String pos  = convert_num.substring(i,k);
			System.out.println(pos);
			if (a%Integer.valueOf(pos) ==0) {
				counter++ ;
				
				
			}
			k++;
		}
		
		
		System.out.println(counter);
	}

}
