/**
 * 
 */
package LeetCode_Practise;

/**
 * @author subash
 * 
 *
 */
public class MinimumDifferenceBetweenHighestandLowestofKScores_1984 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {70};
		int k = 2;
		int temp ; 
		int counter  = 0;
		int MAX_value = 999;
		
		for(int i = 0 ; i<arr.length;i++) {
			if (arr.length == 1) {
				System.out.println(arr[i]-arr[i]);
				break;
			}
			else {
			temp = arr[i+1]-arr[i];
			temp = Math.abs(temp);
			if (temp < MAX_value)
			{
				MAX_value = temp;
				counter++;
			}
			
		}
		System.out.println(counter);
	}

	}
}
