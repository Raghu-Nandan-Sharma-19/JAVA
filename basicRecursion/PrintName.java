package basicRecursion;

class Print {
    int cnt = 0;
    public void printName() {
        if(cnt == 4) {
            return;
        }
        System.out.println("Raghu");
        cnt += 1;
        printName();
    }
}

public class PrintName {
    public static void main(String[] args) {
        Print print = new Print();
        print.printName();
    }
}
