package Day7;
import java.util.Scanner;
public class Array1 {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Array size must be positive.");
                sc.close();
                return;
            }

            int[] arr = new int[n];
            int sum = 0;

            System.out.println("Enter " + n + " elements:");

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            double average = (double) sum / n;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

            sc.close();
        }

}
