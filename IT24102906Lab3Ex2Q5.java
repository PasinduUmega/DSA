import java.util.Stack;
import java.util.Scanner;

public class IT24102906Lab3Ex2Q5 {
    public static void main(String[] args) {
        // Create a scanner object to the read
        Scanner scanner = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the reverseString  print the result
        System.out.println("Reversed string: " + reverseString(inputString));

    }

    // Method to reverse the input string using a stack
    public static String reverseString(String inputString) {
        Stack<Character> stack = new Stack<>();

        // Push all characters of the string onto the stack
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        // Pop characters from the stack to form the reversed string
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }
}
