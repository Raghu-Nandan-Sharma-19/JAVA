package oops;

class Test {
    public Test() {
        System.out.println("Test constructor called");
    }

    public void printTest() {
        System.out.println("Printed test");
    }
}

class BankAccount1 {
    double balance;
    String accountType;

    public BankAccount1(double balance) {
        System.out.println("Bank account created");
        this.balance = balance;
        this.accountType = "Savings";
    }

    public BankAccount1(double balance, String accountType) {
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

        BankAccount1 bankAccount = new BankAccount1(10.0);
        bankAccount.printBalanceAndAccountType();
        System.out.println();

        BankAccount1 bankAccount2 = new BankAccount1(11.1, "Current");
        bankAccount2.printBalanceAndAccountType();
        System.out.println();
    }
}
