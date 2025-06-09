import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
public class QueueEvenNumber {
    public static void main(String[] args){

 // create the scanner object to the read
    Scanner scanner = new Scanner(System.in);

 // create the queue object
  Queue<Integer> queue1 = new LinkedList<>();
  Queue<Integer> queue2 = new LinkedList<>();

  // user input the queue
        System.out.print("Enter the number of elements:");
        int n = scanner.nextInt();

  // take the queue1 store int queue1
     System.out.print("Enter the elements:");
     for (int i = 0; i<n; i++){
         int elements = scanner.nextInt();
         queue1.add(elements);
     }

  // take the user input pop the queue2
        while (!queue1.isEmpty()){
            int elements = queue1.remove();
            if(elements %2 == 0){
                queue2.add(elements);
            }
        }

   // display the after the pop queue1
       System.out.println("after the pop queue1:" + queue1);
        System.out.println("after the push queue2:" + queue2);
    }
}
