import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavAcct savings = new SavAcct("Alice", "S12345", 5000);
        CurAcct current = new CurAcct("Bob", "C12345", 2000);

        System.out.println("Savings Account:");
        savings.displayBalance();
        savings.deposit(1000);
        savings.displayBalance();
        savings.computeAndDepositInterest();
        savings.displayBalance();
        savings.withdraw(2000);
        savings.displayBalance();

        System.out.println("\nCurrent Account:");
        current.displayBalance();
        current.deposit(500);
        current.displayBalance();
        current.withdraw(2500);
        current.displayBalance();
        current.withdraw(300);
        current.displayBalance();

        scanner.close();
    }
}
