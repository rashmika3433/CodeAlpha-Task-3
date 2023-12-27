import java.util.Scanner;

public class bankApplication {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner=new Scanner(System.in);
        //Initialize balance to the zero
        double balance=0;

        boolean exit=false;  // Initialize the exit flag to false
        while (!exit) {
            System.out.println("********************Banking Application*******************");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            // Read the user's choice
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmt = scanner.nextDouble(); //Read the deposit Amount
                    balance += depositAmt; //Add the deposit amount to the previous balance
                    System.out.println("Amount is deposited successfully.");
                
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmt = scanner.nextDouble(); //Read the amount to Withdraw
                    //Check whether the balence is enough or not
                    if (withdrawAmt <= balance) {
                        balance -= withdrawAmt;
                        System.out.println("Amount is withdrawn successfully.");
                    } else {
                        System.out.println("You have Insufficient balance to withdraw.");
                    }

                    break;
                    
                case 3:
                    //print the current Balance
                    System.out.println("Your current balance is: " + balance);
                
                    break;

                case 4:
                    //Set the exit= true to exit from the while loop
                    exit = true;
                    System.out.println("Thank you for using the banking application. Goodbye!");
                    break;
            
                default:
                    //Hint the youser that he/ she entered the invalid option
                    System.out.println("Invalid choice. Please try again.");
                    
            }
            
        }
        scanner.close();
    }
}