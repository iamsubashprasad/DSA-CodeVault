package mandatoryHomeWork.week5.day4;

import org.junit.Test;

/* Pseudocode :
 * check if the char of each string is equal to x++ or x--
 * and create a variable with 0 and do increase and decrease by one
 * tehn return the int value*/
public class FindValAfterPerOper {
	@Test
	public void posCase() {
		String[] operations = { "--X", "X++", "X++" };
		System.out.println(findVal(operations));
	}

	@Test
	public void negCase() {
		String[] operations = { "X--", "--X" };
		System.out.println(findVal(operations));
	}

	@Test
	public void edgeCase() {
		String[] operations = { "X" };
		System.out.println(findVal(operations));
	}

	public int findVal(String[] str) {
		int value = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i] == "--X" || str[i] == "X--") {
				value--;
			} else if (str[i] == "++X" || str[i] == "X++") {
				value++;
			} else
				System.out.println("The input is not as expected");
		}
		return value;
	}
}
