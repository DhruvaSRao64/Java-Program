class CurAcct extends Account {
    private static final double MIN_BALANCE = 1000.0;
    private static final double PENALTY = 50.0;

    public CurAcct(String customerName, String accountNumber, double initialBalance) {
        super(customerName, accountNumber, "Current", initialBalance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            checkMinimumBalance();
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    private void checkMinimumBalance() {
        if (balance < MIN_BALANCE) {
            balance -= PENALTY;
            System.out.println("Balance fell below minimum. Penalty imposed: " + PENALTY);
        }
    }
}
