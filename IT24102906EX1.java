import java.util.Scanner;
public class IT24102906EX1 {
    public static void main(String[] args){
// to declare the elements for the array
        int[] count = new int[10];

// initialized for the all elements to -1
    for(int i =0; i< count.length;i++){
        count[i] = -1;

    }
 // Create the scanner object class
 Scanner scanner =  new Scanner(System.in);
 System.out.println("Enter the each numbers between(10 to 100):");

 //Read and store 10 numbers each of which is between 10 to 100
   for(int i=0; i< count.length;i++ ){
       int num;
   do{
       System.out.print("Numbers "+(i+1) + ":");
       num = scanner.nextInt();
       if(num<10|| num<100){
           System.out.println("Please Enter the number (between 10 to 100):");
       }

     }while (num < 10 || num > 100);
         count[i] = num;

       }


   // Find the maximum number form store the numbers
        int maxNum = count[0]; ;
        for(int i = 1; i< count.length; i++){
            if(count[i] > maxNum) {
                maxNum = count[i];
            }
        }


        System.out.println("The maximum number is: " + maxNum);
    }
}

