import java.util.Stack;

public class RemoveBrackets {

    public int removeBrackets(String str) {

        Stack<Character> stack = new Stack<>();

        int closingBrackets = 0;

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }

            if (c == ')') {
                if (!(stack.isEmpty()) && stack.peek() == '(')
                    stack.pop();
                else {
                    closingBrackets++;
                }
            }

        }

        return stack.size() + closingBrackets;
    }

    public static void main(String[] args) {
        RemoveBrackets rb = new RemoveBrackets();

        // Test case 1: "(()))" -> 1
        System.out.println(rb.removeBrackets("(()))") == 1 ? "Passed" : "Failed");

        // Test case 2: "((()))" -> 0
        System.out.println(rb.removeBrackets("((()))") == 0 ? "Passed" : "Failed");

        // Test case 3: "()())()" -> 1
        System.out.println(rb.removeBrackets("()())()") == 1 ? "Passed" : "Failed");

        // Test case 4: "))))))" -> 6
        System.out.println(rb.removeBrackets("))))))") == 6 ? "Passed" : "Failed");

        // Test case 5: "((((((" -> 6
        System.out.println(rb.removeBrackets("((((((") == 6 ? "Passed" : "Failed");

    }
}
