package mandatoryHomeWork.week5.day2;

import org.junit.Test;

/*Input: command = "G()(al)"  Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G 
() -> o
(al) -> al 

Pseudocode :
1. change the string to char[] and creat a out string
2. usign for toop traverse throught the char[]
3. if ch[i] == 'G' then append -> G -> in the output string
4. else if ch[i] = '(' && ch[i+1] = ')' ->then append -> O -> in the output string
5.  else if ch[i] = '(' && ch[i+1] = 'a' && ch[size-1] = ')' ->then append -> al -> in the output string
6. else the input is not goal*/
public class GoalParser {
	@Test
	public void posCase() {
		String command = "G()(al)";
		System.out.println(goalParse(command));
	}
	@Test
	public void negCase() {
		String command = "opq";
		System.out.println(goalParse(command));
	}
	@Test
	public void edgeCase() {
		String command = "(al)G()()()()";
		System.out.println(goalParse(command));
	}

	public String goalParse(String s) {
		char ch[] = s.toCharArray();
		String out = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'G')
				out += ch[i];
			else if (ch[i] == '(' && ch[i + 1] == ')') {
				out += "o";
				i++;
			}
			else if (ch[i] == '(' && ch[i + 1] == 'a' && ch[i+2] == 'l' && i+3 == ch.length-1 ) {
				out += "al";
				break;
			}
			 else if (ch[i] == '(' && ch[i + 1] == 'a' && ch[i+2] == 'l'  && i+3 < ch.length-1) {
				out += "al";	
				i+=3;
			} 
			
			else if(ch[i] != 'G' || ch[i] != '(' || ch[i] != ')'|| ch[i] != 'a'|| ch[i] != 'l'){
				System.out.print("The input is not goal  :");
				return s;
			}
		}
		return out;
	}
}
