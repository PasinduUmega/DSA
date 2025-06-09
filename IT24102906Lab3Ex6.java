import java.util.Stack;

class stackArray {

    // Method to check if parentheses are balanced
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }

                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false; // Mismatched pair
                }
            }
        }

        return stack.isEmpty(); // If stack is empty, it's balanced
    }

    // Helper method to check if characters are matching pairs
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}

public class IT24102906Lab3Ex6{

    public static void main(String[] args) {
        String test1 = "{[()]}";  // Balanced
        String test2 = "{{((]})]"; // Not balanced

        System.out.println("Test 1: " + stackArray.isBalanced(test1)); // Output: true
        System.out.println("Test 2: " + stackArray.isBalanced(test2)); // Output: false
    }
}

