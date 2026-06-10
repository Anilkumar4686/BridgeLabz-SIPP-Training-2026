package level2;
import java.util.Scanner;
public class PowerForLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();
        if (power < 0) {
            System.out.println("Power should be zero or positive.");
        } else {
            long result = 1;
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }
            System.out.println(number + " power " + power + " is " + result);
        }
        sc.close();
    }
}