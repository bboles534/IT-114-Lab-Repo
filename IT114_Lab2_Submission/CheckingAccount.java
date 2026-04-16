public class CheckingAccount extends BankAccount {
    // DO NOT CHANGE ANY VARIABLE, METHOD, OR CLASS NAMES. THE AUTOGRADER DEPENDS ON THEM.
    private final double OVERDRAFT_FEE = 35.00;

    public CheckingAccount(String accountHolder, double initialDeposit) {
        super(accountHolder, initialDeposit);
    }

    @Override
    public void withdraw(double amount) {
        double currentBalance = getBalance();
        currentBalance -= amount;

        if (currentBalance < 0) {
            System.out.println("Overdraft! $35.00 fee");
            currentBalance -= OVERDRAFT_FEE;
        }

        setBalance(currentBalance);
        System.out.println("New Balance: $" + currentBalance);
    }
}
