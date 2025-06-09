class stack {
     private int[] stack;
     private int top;
     private int capacity;

// constructor to initialized the stack class
     public stack(int size) {
         stack = new int[size];
         capacity = size;
         top = -1;
     }

     public void push(int item) {
         if (isFull()) { // check weather the stack of the full
             System.out.println("Stack is full. Cannot push " + item);
         } else {
             top++;
             stack[top] = item;
         }
     }

     public int peek() {
         if (isEmpty()) { // check the stack of the empty
             System.out.println("Stack is empty. Cannot peek.");
             return -1; // negative value are not valid stack elements
         }
         return stack[top]; // return the top elements
     }


     public int pop() {
         int Items; // declare the variable of the items
         if (isEmpty()) { // check weather the current stack for the empty
             System.out.println("Stack is empty. Cannot pop.");
         }
         Items = stack[top]; // the stack is not empty decrement the value
         top--;
         return Items; // return the value of the decrement
     }


     public boolean isEmpty() {
         return top == -1; // check weather the empty methods of top element is not value don't  peek the value
     }

     public boolean isFull() {
         return top == capacity - 1; // check weather the full methods of the top stack is already fill not add the elements
     }

     public void display() {
         for (int i = 0; i <= top; i++) { // declare the array to print the elements
             System.out.print(stack[i] + " ");

         }
         System.out.println();
     }
 }

  public class IT24102906Lab3Ex1{
    public static void main(String[] args) {
        stack stack = new stack(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.print("Stack elements:"); stack.display();

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.print("Stack elements:");  stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());

       }
    }

