package level1;

//13. Sum of n natural numbers using for loop and formula
import java.util.Scanner;
public class SumNaturalForCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        if (number > 0) {
            int formulaSum = number * (number + 1) / 2;
            int forSum = 0;
            for (int i = 1; i <= number; i++) {
                forSum += i;
            }
            System.out.println("Sum by formula = " + formulaSum);
            System.out.println("Sum by for loop = " + forSum);
            System.out.println("Both computations are correct? " + (formulaSum == forSum));
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        Page 6
        sc.close();
    }
}