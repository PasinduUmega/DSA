import java.util.Scanner;
import java.util.Stack;
public class EvenNumbers {
    public static void main(String[] args){

 // Create the scanner object to the read
    Scanner scanner = new Scanner(System.in);

 // create the both of the stack object
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

 // take the user input
     System.out.print("Enter the number of elements:");
     int n = scanner.nextInt();

 // input the elements of the stack1
        System.out.print("Enter the elements:");
        for (int i =0; i<n;i++){
            int elements = scanner.nextInt();
            stack1.push(elements);
        }

  // enter the stack1 element selected the even numbers
      while (!stack1.isEmpty()){
         int elements = stack1.pop();
         if(elements %2 == 0){
             stack2.push(elements);
         }
      }

  // display the results of the after the pop to stack2
      System.out.println("after the stack1 pop:" + stack1);

  // display the results of the   even of the stack2
        System.out.println("even numbers of add the stack2 push:" + stack2);
    }
}
