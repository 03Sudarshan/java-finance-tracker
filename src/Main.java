import java.util.Scanner;



public class Main { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        FinanceManager manager = new FinanceManager();


        // Greet the user!
        System.out.println("Welcome to the Finance Tracker!");


        // Creating the Main Loop

            while(true) {
                
                System.out.println("/n1. Add Income");
                System.out.println("2. Add Expense");
                System.out.println("3. Add Balance");
                System.out.println("4. Exit");

        // Looking to use the userinput, scanner should work

            // For choices 

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            // Read and use the entire user's input 
            
            switch (choice) {

                // Income first:
                case 1:
                System.out.print("Enter income description (Where the income is coming from): ");
                // Hoping for means of income, like job, side hustle etc. so labeling will be easier and more organized. <- Made that easier to understand
                String incomeDescription = scanner.nextLine();
                System.out.print("Enter income amount: ");
                // Pairing with first question.
                double incomeAmount = scanner.nextDouble();
                manager.addTransaction(incomeDescription, incomeAmount, "Income");
                break;

                //Expense next:
                case 2:
                System.out.print("Enter expense description (Where the money is going): ");
                // Same outcome as the first case expected
                String expenseDescription = scanner.nextLine();
                System.out.print("Enter income amount: ");
                double expenseAmount = scanner.nextDouble();
                manager.addTransaction(expenseDescription, expenseAmount, "Expense");
                break;

                // Let's allow for the user to view their whole balance
                case 3:
                System.out.println("Current balance: $" + manager.getBalance());
                break;

                // Finally, lets let the user exit when needed
                case 4:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid option. Try again.");
                // Forgot about error message lol
            }

            }
    }

}