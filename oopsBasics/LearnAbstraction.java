package oopsBasics;

abstract class BankAccount {
    double balance;
    abstract void addMoney(double amount);
    abstract void withdrawMoney(double amount);

    void updateBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount() {
        System.out.println("Savings account");
    }

    public void addMoney(double amount) {
        super.updateBalance(super.getBalance() + amount);
    }

    public void withdrawMoney(double amount) {
        if(amount <= super.getBalance()) {
            System.out.println("User can");
        } else {
            System.out.println("User can't");
        }
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount() {
        System.out.println("Current account");
    }

    double minimumLimit = 1000.0;
    
    public void addMoney(double amount) {
        super.updateBalance(super.getBalance() + amount);
    }

    public void withdrawMoney(double amount) {
        if(super.getBalance() - amount >= minimumLimit) {
            System.out.println("User can");
        } else {
            System.out.println("User can't");
        }
    }
}

public class LearnAbstraction {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.addMoney(10000.0);
        System.out.println(savingsAccount.getBalance());

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.addMoney(20000.0);
        currentAccount.withdrawMoney(30000.00);
    }
}
