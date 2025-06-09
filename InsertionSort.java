import java.util.*;

public class InsertionSort {
    // Method to perform Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Swap the elements greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // The key is correct position
            arr[j + 1] = key;
        }
    }

    // Method to print the array elements
    public static void printArray(int []arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 6, 12, 2, 9, 15};

        System.out.println("Before Sorting:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("After Insertion Sort:");
        printArray(arr);
    }
}

