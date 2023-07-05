package mandatoryHomeWork.week5.day1;

import org.junit.Test;


/* count the  */
public class LuchSandwitch {
	//@Test
	public void posCase() {
		int [] stu= {1,1,0,0};
		int [] burger= {0,1,0,1};
		System.out.println(remaningStu(stu, burger));
		}
	
	//@Test
	public void negCase() {
		int [] stu= {1,1,1,0,0,1};
		int [] burger= {1,0,0,0,1,1};
		System.out.println(remaningStu(stu, burger));
		}
	@Test
	public void edgeCase() {
		int [] stu= {0,0,0,0,0,0};
		int [] burger= {1,0,0,0,1,1};
		System.out.println(remaningStu(stu, burger));
		}
	
	
	int remaningStu (int[] students, int[] sandwiches) {
	    int count_0 = 0;
        int count_1 = 0;
        
        for (int student : students) {
            if (student == 0)
                count_0++;
            else
                count_1++;
        }
        
        for (int sandwich : sandwiches) {
            if (sandwich == 0) {
                if (count_0 > 0)
                    count_0--;
                else
                    break;
            } else {
                if (count_1 > 0)
                    count_1--;
                else
                    break;
            }
        }        
        return count_0 + count_1;		
	}
}
