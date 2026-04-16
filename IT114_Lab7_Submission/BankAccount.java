public abstract class BankAccount {
    private String accountHolder;
    private double balance;


    public BankAccount(String accountHolder, double initialDeposit) {
        // TODO: Initialize the instance variables
    }

    
    public void deposit(double amount) {
        // TODO: Implement deposit logic and error handling for incorrect input

    }

    /**
     * Abstract method: Child classes must implement this.
     */
    public abstract void withdraw(double amount);

   
    // --- GETTERS AND SETTERS ---
    
    public String getAccountHolder() {
        // TODO: Return the account holder name
        return ""; // Placeholder
    }

    public double getBalance() {
        // TODO: Return the current balance
        return 0.0; // Placeholder
    }

    protected void setBalance(double balance) {
        // TODO: Set the balance
    }
}