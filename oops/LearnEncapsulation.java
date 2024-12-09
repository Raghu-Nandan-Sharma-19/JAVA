package oops;

class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class LearnEncapsulation {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(100.12);
        System.out.println("Balance : " + bankAccount.getBalance());
    }
}
