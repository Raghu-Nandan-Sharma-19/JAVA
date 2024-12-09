package oops;

class Test {
    public Test() {
        System.out.println("Test constructor called");
    }

    public void printTest() {
        System.out.println("Printed test");
    }
}

class BankAccount {
    double balance;
    String accountType;

    public BankAccount(double balance) {
        System.out.println("Bank account created");
        this.balance = balance;
        this.accountType = "Savings";
    }

    public BankAccount(double balance, String accountType) {
        System.out.println("Bank account created");
        this.balance = balance;
        this.accountType = accountType;
    }

    public void printBalanceAndAccountType() {
        System.out.println(balance);
        System.out.println(accountType);
    }
}

public class LearnConstructors {
    public static void main(String[] args) {
        Test test = new Test();
        test.printTest();
        System.out.println();

        BankAccount bankAccount = new BankAccount(10.0);
        bankAccount.printBalanceAndAccountType();
        System.out.println();

        BankAccount bankAccount2 = new BankAccount(11.1, "Current");
        bankAccount2.printBalanceAndAccountType();
        System.out.println();
    }
}
