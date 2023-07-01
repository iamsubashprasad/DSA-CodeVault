package SDET;
/* DI String Match 
 * D ---> Decrease
 * I----> Increase
 * Total length of string and then increase and decrease
 * IDID = Max length = 4 --->n+1
 * Output : [0,4,1,3,2]
 */
public class DIStringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,incr=0;
		String s="III";
		int n=s.length();
		int decr=n;
		int arr[] = new int[n];
		for(i=0;i<n;i++) {
			if(s.charAt(i)=='I') {
				arr[i]=incr;
				incr++;
				
				
			}
				else if(s.charAt(i)=='D') {
					arr[i]=decr;
					decr--;
					
				}
				
			}
		
		for (i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			if(i==arr.length-1)
				System.out.println(arr[i]=arr[i]+1);
		}
		
		}
		
		
		

	}


