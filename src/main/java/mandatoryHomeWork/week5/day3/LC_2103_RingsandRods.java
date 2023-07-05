package mandatoryHomeWork.week5.day3;

import java.util.Collections;
import java.util.HashMap;

import org.junit.Test;

/*pos case : R0G0B0
 * neg case : R0G1B2
 * edge :  RGB or 0123
 * 
 * pseudocode :
 * 1. find the numbers and store it in hashmap key with number and value with no of occurance
 * 2. then get the key with vlaue >= 3
 * 3. while  find that key in the string and check the value before that is R or G or B or 
 * 		if its R then increase the Rcount to 1
 * 		else if its G then increase the Gcount to 1
 * 		else if its B then increase the Bcount to 1 
 * 4. out this loop if the Rcount >=1 and Gcount >= 1 and Gcount >= 1
 * 		increase the rodCount to 1
 * 5. return the rodCount finally */

public class LC_2103_RingsandRods {
	@Test
	public void posCase() {
		String s = "R0G0B0D1E2";
		ringsAndRods(s);
	}

	public int ringsAndRods(String s) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i <= s.length(); i++) {
			if (i % 2 != 0) {
				//int a = Character.getNumericValue(s.charAt(i));
				hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
			} 
		}System.out.println(hm);
		
		int maxValueInMap = (Collections.max(hm.values()));
		 
        // Iterate through HashMap
        for (Entry<Integer, Integer> entry :
             hm.entrySet()) {
 
            if (entry.getValue() == maxValueInMap) {
 
                // Print the key with max value
                System.out.println(entry.getKey());
            }
        }
		
		return 0;

	}

}
