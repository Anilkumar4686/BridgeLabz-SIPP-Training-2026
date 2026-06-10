
// 1. Odd and Even Numbers from 1 to N
// Print whether each number from 1 to the entered natural number is odd or even.
import java.util.Scanner;

public class OddEvenNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println(number + " is not a natural number.");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        }
        sc.close();
    }
}



2. Employee Bonus Based on Years of Service
Give 5% bonus if years of service is more than 5 years.
import java.util.Scanner;
public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        double bonus = 0;
        if (years > 5) {
            bonus = salary * 0.05;
        }
        System.out.println("Bonus amount is " + bonus);
        sc.close();
    }
}



3. Multiplication Table from 6 to 9
Print multiplication table of the entered number from 6 to 9.
import java.util.Scanner;
public class MultiplicationTable6To9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        sc.close();
    }
}



4. FizzBuzz using For Loop
For multiples of 3 print Fizz, multiples of 5 print Buzz, and multiples of both print FizzBuzz.
import java.util.Scanner;
public class FizzBuzzFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            Page 2
 for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}



5. FizzBuzz using While Loop
Same FizzBuzz program using a while loop.
import java.util.Scanner;
public class FizzBuzzWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1;
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        }
        sc.close();
    }
}



6. Youngest and Tallest Friend
Find youngest and tallest among Amar, Akbar, and Anthony.
import java.util.Scanner;
public class YoungestTallestFriend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amar age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Amar height: ");
        double amarHeight = sc.nextDouble();
        System.out.print("Enter Akbar age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Akbar height: ");
        double akbarHeight = sc.nextDouble();
        System.out.print("Enter Anthony age: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter Anthony height: ");
        double anthonyHeight = sc.nextDouble();
        String youngest;
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            youngest = "Amar";
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }
        String tallest;
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            tallest = "Amar";
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }
        System.out.println("Youngest friend is " + youngest);
        System.out.println("Tallest friend is " + tallest);
        sc.close();
    }
}



7. Factors of a Number using For Loop
Print all factors of a positive integer using for loop.
import java.util.Scanner;
public class FactorsForLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);

                }Page 
        
            
        
            
        
        3
 }
 }
 sc.close();
    }
}



8. Factors of a Number using While Loop
Print all factors of a positive integer using while loop.
import java.util.Scanner;
public class FactorsWhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
            int counter = 1;
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        }
        sc.close();
    }
}



9. Greatest Factor beside Itself using For Loop
Find greatest factor of a number except the number itself.
import java.util.Scanner;
public class GreatestFactorFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
        } else {
            int greatestFactor = 1;
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }
            System.out.println("Greatest factor beside itself is " + greatestFactor);
        }
        sc.close();
    }
}



10. Greatest Factor beside Itself using While Loop
Find greatest factor of a number except the number itself using while loop.
import java.util.Scanner;
public class GreatestFactorWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
        } else {
            int greatestFactor = 1;
            int counter = number - 1;
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }
            System.out.println("Greatest factor beside itself is " + greatestFactor);
        }
        sc.close();
    }
}
Page

4
11. Multiples of a Number below 100 using For Loop
Print multiples of entered number below 100 using for loop.
import java.util.Scanner;
public class MultiplesBelow100For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive number less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            for (int i = 1; i < 100; i++) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}



12. Power of a Number using For Loop
Find number raised to power using repeated multiplication.
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



13. Multiples of a Number below 100 using While Loop
Print multiples of entered number below 100 using while loop.
import java.util.Scanner;
public class MultiplesBelow100While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive number less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            int counter = 1;
            while (counter < 100) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        }
        sc.close();
    }
}



14. Power of a Number using While Loop
Find number raised to power using while loop.
import java.util.Scanner;
public class PowerWhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();
        if (power < 0) {
            System.out.println("Power should be zero or positive.");

        }Page 5
 else {
 long result = 1;
 int counter = 0;
 while (counter < power) {
 result = result * number;
 counter++;
 }
 System.out.println(number + " power " + power + " is " + result);
 }
        sc.close();
    }
}
