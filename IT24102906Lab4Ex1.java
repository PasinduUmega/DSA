class queue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    // Constructor to initialize the queue
    public queue(int size) {
        queue = new int[size];
        front = 0;
        rear = -1; // rear is start that -1 because queue start point not end
        capacity = size; // Correctly initializing capacity
    }

    // Insert method
    public void insert(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert the value " + value);
        } else {
            rear++;
            queue[rear] = value;
        }
    }

    // Remove method
    public void remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove elements.");
        } else {
            System.out.println("Removed: " + queue[front]);
            front++;
        }
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Check if queue is full
    public boolean isFull() {
        return rear == capacity - 1;
    }

    // Display queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // Peek front element
    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

}

public class IT24102906Lab4Ex1 {
    public static void main(String[] args) {
        // Create the queue object
        queue queue = new queue(3);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.display();

        // Remove an element
        queue.remove();

        // Display elements after removal
        queue.display();

        // Display the next front element
        queue.peekFront();

    }
}
