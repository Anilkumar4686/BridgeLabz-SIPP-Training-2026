package level1;

//12. Sum of n natural numbers using while loop and formula
import java.util.Scanner;
public class SumNaturalWhileCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        if (number > 0) {
            int formulaSum = number * (number + 1) / 2;
            int whileSum = 0;
            int i = 1;
            while (i <= number) {
                whileSum += i;
                i++;
            }
            System.out.println("Sum by formula = " + formulaSum);
            System.out.println("Sum by while loop = " + whileSum);
            System.out.println("Both computations are correct? " + (formulaSum ==
                    whileSum));
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        sc.close();
    }
}
