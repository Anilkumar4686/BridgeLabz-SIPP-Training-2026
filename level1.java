

//1. Check if a number is divisible by 5
import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        boolean result = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + result);
        sc.close();
    }
}
//2. Check if the first number is smallest among 3 numbers
import java.util.Scanner;
public class FirstSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();
        boolean result = (number1 < number2 && number1 < number3);
        System.out.println("Is the first number the smallest? " + result);
        sc.close();
    }
}
//3. Check largest among first, second and third number
import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();
        System.out.println("Is the first number the largest? " +
                (number1 > number2 && number1 > number3));
        System.out.println("Is the second number the largest? " +
                (number2 > number1 && number2 > number3));
        System.out.println("Is the third number the largest? " +
                (number3 > number1 && number3 > number2));
        sc.close();
    }
}
//4. Check natural number and find sum of n natural numbers
import java.util.Scanner;
public class SumNaturalFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        Page 2
        if (number > 0) {
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        sc.close();
    }
}
//5. Check whether a person can vote
import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        sc.close();
    }
}

//        6. Check whether a number is positive, negative or zero
import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        sc.close();
    }
}
//7. SpringSeason program using command line arguments
public class SpringSeason {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        boolean isSpring = (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
//8. Countdown using while loop
import java.util.Scanner;
public class CountdownWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown value: ");
        int counter = sc.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Rocket Launch!");
        sc.close();
    }
}
//9. Countdown using for loop
import java.util.Scanner;
public class CountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown value: ");
        int counter = sc.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket Launch!");
        sc.close();
    }
}

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
//Page 5
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
//14. Factorial using while loop
import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        if (number >= 0) {
            long factorial = 1;
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }
        sc.close();
    }
}
//15. Factorial using for loop
import java.util.Scanner;
public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        if (number >= 0) {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }
        sc.close();
    }
}
//Page 7
//        16. Print odd and even numbers between 1 and given number
import java.util.Scanner;
public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even number");
                } else {
                    System.out.println(i + " is odd number");
                }
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        sc.close();
    }
}
//17. Bonus of employee based on years of service
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        double bonus = 0.0;
        if (years > 5) {
            bonus = salary * 0.05;
        }
        System.out.println("Bonus amount = " + bonus);
        sc.close();
    }
}
//18. Multiplication table from 6 to 9
import java.util.Scanner;
public class MultiplicationTable6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        sc.close();
    }
}