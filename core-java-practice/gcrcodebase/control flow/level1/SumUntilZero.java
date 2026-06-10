package level1;

//        10. Sum numbers until user enters 0 using while loop
import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        System.out.print("Enter number: ");
        double value = sc.nextDouble();
        while (value != 0) {
            total += value;
            System.out.print("Enter number: ");
            value = sc.nextDouble();
        }
        System.out.println("Total = " + total);
        sc.close();
    }
}