import java.util.Scanner;

public class CoffeeShop {

    String CoffeeTypes;
    int Quantity;

    public double calculatePrice(double price) {
        double bill = price * Quantity;
        double gst = bill * 0.18;
        double finalBill = bill + gst;
        return finalBill;
    }

    public void generateBill(double bill) {
        System.out.println("------------------------------------------------");
        System.out.println("COFFEE TYPE -> " + CoffeeTypes);
        System.out.println("QUANTITY    -> " + Quantity);
        System.out.println("BILL AMOUNT -> " + bill);
        System.out.println("THANK YOU FOR VISITING US");
        System.out.println("------------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Coffee Type");
        System.out.println("1. Cappuccino  - 150");
        System.out.println("2. Espresso    - 100");
        System.out.println("3. Latte       - 120");
        System.out.println("4. Americano   - 80");
        System.out.println("5. Black Coffee- 50");
        System.out.println("6. Exit");

        int choice = scanner.nextInt();

        

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        CoffeeShop coffeeShop = new CoffeeShop();
        coffeeShop.Quantity = quantity;

        switch (choice) {
            case 1:
                coffeeShop.CoffeeTypes = "Cappuccino";
                coffeeShop.generateBill(coffeeShop.calculatePrice(150));
                break;

            case 2:
                coffeeShop.CoffeeTypes = "Espresso";
                coffeeShop.generateBill(coffeeShop.calculatePrice(100));
                break;

            case 3:
                coffeeShop.CoffeeTypes = "Latte";
                coffeeShop.generateBill(coffeeShop.calculatePrice(120));
                break;

            case 4:
                coffeeShop.CoffeeTypes = "Americano";
                coffeeShop.generateBill(coffeeShop.calculatePrice(80));
                break;

            case 5:
                coffeeShop.CoffeeTypes = "Black Coffee";
                coffeeShop.generateBill(coffeeShop.calculatePrice(50));
                break;

            default:
                System.out.println("THANK YOU FOR VISITING US");
        }

        scanner.close();
    }
}