import java.util.*;
public class SelectionSort {
    public static void selectionSort( int[] arr){

  // Create the array length to declare the n
     int n = arr.length;
     for(int i = 0 ; i< n; i++){
         //to initialized for the variable in min index
         int min_index = i;

      // iterate to the array compare the other elements
         for(int j=1; j<n; j++){
      // if the (i+1) value smaller than min_index swap the elements
            if (arr[j] < arr[min_index]){

     // update the min_index swap the (j) elements
           min_index = j;

            }
         }

     // the min_index of the correct position
         int temp = arr[i];
         arr[i] = arr[min_index];
         arr[min_index] = temp;
        }
    }

   // create the methods of the print the array
       public static void printArray(int[] arr){
   // for the current position number print the elements
      for(int num: arr){
          System.out.print(num + " ");
       }
      System.out.println();
    }

    public static void main(String[] args){
   // Declare the array
      int[] arr = {10,12,4,2,9,15};

   // Before the sorting array
      System.out.print("Before the Sorting Array : ");
      printArray(arr);

   // Called of the selection sort
      selectionSort(arr);

   // After  the sorting array
       System.out.print("After the Sorting Array : ");
       printArray(arr);
    }
}
