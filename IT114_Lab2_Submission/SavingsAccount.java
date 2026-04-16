public class SavingsAccount extends BankAccount {
    // DO NOT CHANGE ANY VARIABLE, METHOD, OR CLASS NAMES. THE AUTOGRADER DEPENDS ON THEM.
    public SavingsAccount(String accountHolder, double initialDeposit) {
        super(accountHolder, initialDeposit);
    }

    @Override
    public void withdraw(double amount) {
        double currentBalance = getBalance();

        if (amount > currentBalance) {
            System.out.println("Transaction Denied: Insufficient funds");
        } else {
            currentBalance -= amount;
            setBalance(currentBalance);
        }

        System.out.println("Balance: $" + getBalance());
    }
}
