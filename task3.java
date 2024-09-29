//ATM Interface

import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 5000.00;
        while (true) {
            
            System.out.println("Welcome to State Bank Of India!");
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice:");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:System.out.println("Balance: " + "$" + balance);
                    break;
                case 2:System.out.print("Enter the amount to deposit: ");
                       double withdraw = sc.nextDouble();
                       balance += withdraw;
                       break;
                case 3:System.out.print("Enter the amount to : ");
                       double deposit = sc.nextDouble();
                       balance -= deposit;
                       break;
                case 4:System.out.println("Thank you for using the SBI ATM!");
                       return; 
                default:System.out.println("Invalid");
                
            }
        }
    }
}

