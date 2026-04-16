public class CheckingAccount extends BankAccount {
    private final double OVERDRAFT_FEE = 35.00;

    public CheckingAccount(String accountHolder, double initialDeposit) {
        // TODO: Call the parent constructor using 'super'
    }

    @Override
    public void withdraw(double amount) {
        // TODO: Implement Checking withdrawal logic and error handling for incorrect input
    }
}