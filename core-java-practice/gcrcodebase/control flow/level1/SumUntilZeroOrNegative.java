package level1;

//        11. Sum until user enters 0 or negative using while loop and break
import java.util.Scanner;
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter number: ");
            double value = sc.nextDouble();
            if (value <= 0) {
                break;
            }
            total += value;
        }
        System.out.println("Total = " + total);
        sc.close();
    }
}