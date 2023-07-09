package mandatoryHomeWork.week11.day4;

import org.junit.Test;

public class SaveThePrisoner {
	//@Test
	public void posCase() {
	int n = 5, m = 2, s=4;	
	System.out.println(saveThePrisoner(n, m, s));
	}
	@Test
	public void posCase2() {
	int n = 5, m = 7, s=5;	
	System.out.println(saveThePrisoner(n, m, s));
	}
	
	//@Test
	public void negCase() {
	int n = 5, m = 1, s=0;	
	System.out.println(saveThePrisoner(n, m, s));
	}
	
	//@Test
	public void edge() {
	int n = 5, m = 2, s=6;	
	System.out.println(saveThePrisoner(n, m, s));
	}
	
	public int saveThePrisoner(int n, int m, int s) {

		 int r = m % n;
	        if ((r + s - 1) % n == 0) {
	            return n;
	        } else {
	            return ((r + s - 1) % n);
	        }		
	}

}
