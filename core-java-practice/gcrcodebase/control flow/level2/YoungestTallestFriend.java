package level2;
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