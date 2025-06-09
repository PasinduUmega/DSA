import java.util.Locale;
import java.util.Scanner;
public class IT24102906Ex3 {
    public static void main(String[] args) {
        char[] shirts = new char[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sizes of t-shirts for 10 customers (S, M, L):");

        // Read and store t-shirt sizes
        for (int i = 0; i < shirts.length; i++) {
            char size;
            do {
                System.out.print("Customer " + (i + 1) + " size: ");
                size = scanner.next().toUpperCase().charAt(0);
                if (size != 'S' && size != 'M' && size != 'L') {
                    System.out.println("Invalid input. Please enter S, M, or L.");
                }
            } while (size != 'S' && size != 'M' && size != 'L');
            shirts[i] = size;
        }

        // Count t-shirt sizes
        int countS = 0, countM = 0, countL = 0;
        for (char size : shirts) {
            switch (size) {
                case 'S': countS++; break;
                case 'M': countM++; break;
                case 'L': countL++; break;
            }
        }

        // Display counts
        System.out.println("\nT-shirt sizes summary:");
        System.out.println("Small (S): " + countS);
        System.out.println("Medium (M): " + countM);
        System.out.println("Large (L): " + countL);


      }
    }

