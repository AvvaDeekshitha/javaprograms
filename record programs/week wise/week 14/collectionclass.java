import java.util.*;

public class collectionclass {
    public static void main(String[] args) {
        String s = "({)}";
        Stack<Character> stack = new Stack<>();
        boolean valid = true;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    valid = false;
                    break;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    valid = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty())
            valid = false;

        if (valid)
            System.out.println("Valid");
        else
            System.out.println("Not valid");
    }
}
