import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class QueueExx {
    public static void main(String[] args) {

        // create the scanner object to the read
        Scanner scanner = new Scanner(System.in);

        // create the queue object
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        // enter the user input
        System.out.print("Enter the number of elements:");
        int n = scanner.nextInt();

        // take the user input assume the queue
        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int elements = scanner.nextInt();
            queue1.add(elements);
        }

    // queue1 for the all elements take the queue2
      while (!queue1.isEmpty()) {
          int elements = queue1.remove();
          if(elements%2==0) {
              queue2.add(elements);
          }
      }

    // display ths queue
     System.out.println("Queue elements after the pop:" + queue1);
     System.out.println("Queue elements after the push:" + queue2);


    }
}
