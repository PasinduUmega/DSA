public  class StackTest{
    private  int[] stack;
    private int top;
    private int capacity;

  public StackTest(int size){
      top = -1;
      capacity = size;
      stack = new int[size];
  }

  boolean isEmpty(){
      return (top == -1);
  }
  boolean isFull(){
      return (top==capacity-1);
  }
  void push(int elements){
      if(isFull()){
          System.out.println("Stack is already full");
      }else {
          top++;
          stack[top] = elements;
      }
  }
  int pop (){
      int elements = 0;
      if(isEmpty()){
          System.out.println("Stack is already empty");
          return -1;
      }else {
          stack[top] = elements;
          top--;
          return elements;
      }
  }
  int findMin(){
     if(isEmpty()){
         System.out.println("Stack is already empty");
         return -1;
     }
     int min = stack[0];
     for(int i =0; i<=top;i++){
         if(stack[0]<min){
             stack[0] = min;
         }
     }
     return min;
  }
  int findSum(){
      if(isEmpty()){
          System.out.println("Stack is already empty");
      }
      int sum = stack[0];
      for(int i =0; i<=top;i++){
         sum += stack[i];
      }
      return  sum;
  }


  void displayStack(){
     if (isEmpty()){
         System.out.println("Stack is already empty ");
     }
      for (int i =0; i<=top;i++){
          System.out.print(stack[i] + " ");
      }
      System.out.println();
  }

  public static void main(String[] args){
      StackTest stack = new StackTest(5);

      stack.push(7);
      stack.push(8);
      stack.push(5);
      stack.push(9);
      stack.push(9);
      stack.displayStack();

     stack.pop();
     stack.pop();
     stack.displayStack();

      System.out.println("Sum:" +  stack.findSum() );
  }
}

