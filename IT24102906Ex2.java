import java.util.Scanner;
public class IT24102906Ex2 {
    public static void main(String[] args) {

// Declare the salary elements for the array
        double[] salary = new double[8];

        // Create the scanner object class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 8 Employee Salary:");

        // store the salaries
        for (int i = 0; i < salary.length; i++) {
            System.out.print("Employee Salary" + " " + (i + 1) + ":");
            salary[i] = scanner.nextDouble();
        }

        // Display the salaries stored in the array
        for (double sal : salary) {
            System.out.println(sal);
        }

        // Count and display the salaries
        double countLow = 0;
        double countMid = 0;
        double countHigh = 0;
        for (double sal : salary) {
            if (sal < 30000) {
                countLow++;
            } else if (sal <= 60000) {
                countMid++;
            } else {
                countHigh++;
            }
        }

// Display counts
        System.out.println("\nNumber of employees in different salary ranges:");
        System.out.println("Less than 30,000: " + countLow);
        System.out.println("Between 30,000 and 60,000: " + countMid);
        System.out.println("More than 60,000: " + countHigh);


    }
}
