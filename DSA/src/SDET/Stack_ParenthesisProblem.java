package SDET;
import java.util.*;

public class Stack_ParenthesisProblem {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<>();
		String s = "[{(})}";
		
		int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
                count++;
            } else {
                
                char ch = stack.pop();
                if ((s.charAt(i) == ')' && ch == '(') || (s.charAt(i) == ']' && ch == '[') || (s.charAt(i) == '}' && ch == '{')) {
                } else {
                    return;
                }

	}

}
	}
}
