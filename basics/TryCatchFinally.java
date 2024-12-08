package basics;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;
            int num3 = num1 / num2;
            System.out.println(num3);
        } catch (Exception e) {
           System.out.println(e); 
        } finally {
            System.out.println("Done");
        }
    }
}
