import java.util.ArrayList;

public class FinanceManager {
    private ArrayList<Transaction> transactions;

    // Constructor
    public FinanceManager() {
        transactions = new ArrayList<>();
    
    }

    // Lets add the transactions, both expense and income
    public void addTransaction(String description, double amount, String type) {
        Transaction transaction = new Transaction(description, amount, type);
        transactions.add(transaction);
        System.out.println("Transaction added: " + transaction);

    }


    // Finally, lets calculate the balance 
    public double getBalance() {
        double balance = 0;
        for (Transaction t : transactions) {
            if (t.getType().equals("Income")) {
                balance += t.getAmount();
            }
            else {
                balance -= t.getAmount();
            }
        }
        return balance;
    }

}
