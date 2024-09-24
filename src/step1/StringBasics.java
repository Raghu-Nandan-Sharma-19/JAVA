package step1;

public class StringBasics {
    public static void main(String[] args) {
        String name = "Novak";
        System.out.println(name);
        String sameName = "novak";

        if(name.equals(sameName)) {
            System.out.println("Both are same");
        } else {
            System.out.println("Both are not same");
        }

        if(name.equalsIgnoreCase(sameName)) {
            System.out.println("Both are same");
        } else {
            System.out.println("Both are not same");
        }
    }
}
