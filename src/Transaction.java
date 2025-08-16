public class Transaction {
    
    private String description;
    private double amount;
    private String type; // This would be either Income or Expense 

    // Lets build a constructor 
    public Transaction(String description, double amount, String type) {
        this.description = description;
        this.amount = amount;
        this.type = type;

    }

    // Getters next 
    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    // I will be using toString to display the transaction 
    public String toString(){
        return type + ": " + description + " - $" + amount;
    }
}
