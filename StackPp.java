import java.util.Scanner;
import java.util.Stack;

public class StackPp {
    public static void main(String[] args){

 // create the scanner object to the read
     Scanner scanner = new Scanner(System.in);

 // create the stack object
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

// enter the user input
  System.out.print("Enter the number of elements:");
  int n = scanner.nextInt();

// take the user input
  System.out.print("Enter the elements:");
   for(int i =0; i<n;i++){
       int elements = scanner.nextInt();
       stack1.push(elements);
       }

 // all the stack1 elements add the stack2 elements
   while (!stack1.isEmpty()){
       int elements = stack1.pop();
       stack2.push(elements);
      }

 // display the results
    System.out.println("after the remove the elements:" + stack1);
   System.out.println("after the add the elements:" + stack2);

    }
}
