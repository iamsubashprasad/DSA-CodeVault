package LeetCode_Practise;

public class SmallestLetterGreaterThanTarget_744 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String letters ;
		char target ;
		
		int left = 0;
        int right = letters.length() - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target >= letters[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
	}

}
