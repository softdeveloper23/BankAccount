package main;
import bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.accountHolder = "Brannon";
        account1.accountNumber = 555221;
        account1.balance = 500;

        System.out.println("Account number: " + account1.accountNumber);
        System.out.println("Account holder: " + account1.accountHolder);
        System.out.println("Balance: " + account1.balance);
    }
}
