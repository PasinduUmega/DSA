 class CQueue {
     private int capacity;
     private int front;
     private int rear;
     private int CQueueArr[];

     CQueue(int size) {
         front = -1; // declare the variable of front = -1 the queue start to empty
         rear = -1; //  declare the variable of rear = -1 the queue start to empty
         capacity = size; // the size declare of the constructor for initialized size
         CQueueArr = new int[capacity]; // CQueueArr the declare the capacity so user enter the size of the elements
     }

     public boolean isEmpty() {
         if (front == -1) { // queue start is empty there for assume the value for the front =-1
             return true; // already queue is empty return the true
         } else
             return false; // already queue is not empty return the false
     }

     public boolean isFull() {
         if (front == 0 && rear == capacity - 1) { // the queue is full front value is 0 and rear value is capacity to initialized for thr size
             return true; // CQueue is already full return by the true
         } else if (front == rear + 1) { // this function is create the decrement the value front is come to froward
             return true; // this function called of the front value decrement there for front froward to go the next elements
         } else {
             return false; // current of CQueue already not full return by the false
         }
     }

     public void enQueue(int element) {
         if (isFull()) {
             System.out.println("Queue is full");
         } else {
             if (front == -1) { // queue is not start queue is already -1
                 front = 0; // insert the elements front is go to 0 elements
             }
             rear = (rear + 1) % capacity; // rear to move forward

             CQueueArr[rear] = element; // rear is go to the ahead

             System.out.println("Inserted : " + element);

         }
     }

     public int deQueue() {
         if (isEmpty()) {
             System.out.println("Queue is empty");
             return -1; // Indicating an empty queue
         }
            int element = CQueueArr[front]; // Store the element before removing
         if (front == rear) { // If only one element was left
             front = -1;
             rear = -1;
         } else {
             front = (front + 1) % capacity; // Move front forward
         }

         System.out.println("Deleted: " + element);
         return element;
     }


     void display() {
         int i; // declare the variable of the i

         if (isEmpty()) {
             System.out.println("Queue is empty"); // current of the CQueue is already empty
         } else {
             System.out.print("Queue elements:  "); // current variable of the array

             for (i = front; i != rear; i = (i + 1) % capacity) { // rear to not equal meaning of the function rear equal loop exits last elements not print
                 System.out.print(CQueueArr[i] + " ");
             }
             System.out.print(CQueueArr[i] + "\n"); // last element print the array
         }
     }
 }

 public class IT24102906Lab4Ex2{
    public static void main(String[] arg) {

 // Create the CQueue object
        CQueue q1 = new CQueue(4);

        q1.enQueue(10);
        q1.enQueue(20);
        q1.enQueue(30);
        q1.enQueue(40);
        q1.enQueue(50);

// display the current elements
        q1.display();

// remove the elements
        q1.deQueue();
// after the remove elements of the array
        q1.display();

// add the new elements of the array
        q1.enQueue(60);

 // after the add the elements of the array
        q1.display();
    }
}