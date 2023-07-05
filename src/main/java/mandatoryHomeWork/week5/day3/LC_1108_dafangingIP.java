package mandatoryHomeWork.week5.day3;

import org.junit.Test;

/*ex pos :  String ipAddress = "192.168.0.1";
 * ex neg :  String ipAddress = "19216801";
 * ex edge : String ipAddress = "192.;
 * 
 * Pseudocode :
 * 1. creat a new string buffer space to store the output
 * 2. then using for loop check each char is equal to = '.'
 * 		then string buffer append "[.]
 * 3. else append the exiting number*/
public class LC_1108_dafangingIP {
	@Test
	public void posCase() {
		 String ipAddress = "192.168.0.1";
		 System.out.println(defangedIp(ipAddress));
	}
	@Test
	public void negCase() {
		 String ipAddress = "19216801";
		 System.out.println(defangedIp(ipAddress));
	}
	@Test
	public void edgeCase() {
		 String ipAddress = "192";
		 System.out.println(defangedIp(ipAddress));
	}
	public String defangedIp(String s) {
		StringBuffer sb = new StringBuffer();
		for(int i =0; i< s.length(); i++) {
			if(s.charAt(i) == '.') {
				sb.append("[.]");
			}else  sb.append(s.charAt(i));
		}
		String out = sb.toString();
		return out;
		
	}
}
