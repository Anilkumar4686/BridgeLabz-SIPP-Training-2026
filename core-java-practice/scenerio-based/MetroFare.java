import java.util.Scanner;
public class MetroFare{
    public static void main(String[] args){
        double balance=600.00;
        while(balance>0){
            System.out.println("-----------------------------------------------");
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter distance in KM or type -1 to exit:");

            double distance=scanner.nextDouble();
            System.out.print("no of passengers:");
            int passenger=scanner.nextInt();
            if(distance==-1){
                break;
            }
            // fare calculation based on distance
            double fare=(distance<=5)? 10 : (distance<=10)? 20 :(distance<=20)? 30 : 50;
            System.out.println("Fare for "+distance+" KM: "+fare);
            
            //balance calculation
            if(balance>=fare){

                fare*=passenger;
                balance-=fare;
                
                System.out.println("Remaining balance: "+balance);
            }else{
                System.out.println("Insufficient balance. Please recharge."); 
            }
            System.out.println("thank you for using metro services.");
            System.out.println("--------------------------------------------------");
        }
        System.out.println("card time exceded or balance is zero!!!!");

    }
}