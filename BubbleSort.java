import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];

        System.out.println("Enter 8 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        bubbleSort(numbers);

        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}


