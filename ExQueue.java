class ExQ {
    private int[] queue1;
    private int[] queue2;
    private int front1;
    private int front2;
    private int rear1;
    private int rear2;
    private int capacity;

    // Constructor for ExQ class
    public ExQ(int size) {
        front1 = -1;
        front2 = -1;
        rear1 = -1;
        rear2 = -1;
        capacity = size;
        queue1 = new int[capacity];
        queue2 = new int[capacity];
    }

    // Check whether queue1 is empty
    public boolean isEmpty1() {
        return (front1 == -1);
    }

    // Check whether queue2 is empty
    public boolean isEmpty2() {
        return (front2 == -1);
    }

    // Check whether queue1 is full
    public boolean isFull1() {
        return (rear1 == capacity - 1);
    }

    // Check whether queue2 is full
    public boolean isFull2() {
        return (rear2 == capacity - 1);
    }

    // Insert elements into queue1
    public void insert1(int element) {
        if (isFull1()) {
            System.out.println("Queue1 is already full: " + element);
        } else {
            if (front1 == -1) front1 = 0;  // Initialize front if it's the first element
            queue1[++rear1] = element;
        }
    }

    // Insert elements into queue2
    public void insert2(int element) {
        if (isFull2()) {
            System.out.println("Queue2 is already full: " + element);
        } else {
            if (front2 == -1) front2 = 0;  // Initialize front if it's the first element
            queue2[++rear2] = element;
        }
    }

    // Remove element from queue2
    public int remove2() {
        if (isEmpty2()) {
            System.out.println("Queue2 is already empty");
            return -1;
        } else {
            int element = queue2[front2];
            if (front2 == rear2) {
                front2 = rear2 = -1; // Reset the queue when it's empty
            } else {
                front2++;
            }
            return element;
        }
    }

    // Display elements of both queues
    public void displayQueue() {
        if (isEmpty1() && isEmpty2()) {
            System.out.println("Both queues are empty");
            return;
        }

        System.out.print("Queue1 Elements: ");
        if (!isEmpty1()) {
            for (int i = front1; i <= rear1; i++) {
                System.out.print(queue1[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Queue2 Elements: ");
        if (!isEmpty2()) {
            for (int i = front2; i <= rear2; i++) {
                System.out.print(queue2[i] + " ");
            }
        }
        System.out.println();
    }
}

public class ExQueue {
    public static void main(String[] args) {
        ExQ queue = new ExQ(3);

        // Insert elements into both queues
        queue.insert1(10);
        queue.insert1(20);
        queue.insert1(30);

        queue.insert2(10);
        queue.insert2(20);
        queue.insert2(30);

        // Display both queues
        System.out.println("Initial Queue:");
        queue.displayQueue();

        // Remove element from queue2 and display queues again
        System.out.println("Removed from Queue2: " + queue.remove2());
        System.out.println("Queues after removing from Queue2:");
        queue.displayQueue();
    }
}
