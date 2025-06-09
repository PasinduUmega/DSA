import java.util.Stack;
public class StackAlgorithm {
    public static void main(String[] args){

// Create the object of the stack class
  Stack<String> animals = new Stack<>();

// push elements to top of the stack
  animals.push("Dog");
  animals.push("Horse");
  animals.push("Cat");
  animals.push("Lion");
  System.out.println("Stack:" + animals);

// pop element from top of stack
animals.pop();
animals.peek();
int position  = animals.search("Cat");
System.out.println("Stack after pop:" + animals);
System.out.println("Stack after peek:" + animals.peek());
System.out.println("Position of the Cat:" + position);
    }

}
