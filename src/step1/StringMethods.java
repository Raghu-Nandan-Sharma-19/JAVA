package step1;

public class StringMethods {
    public static void main(String[] args) {
        String name = "novak";

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String name1 = "   abc   ";
        System.out.println(name1.trim());

        System.out.println(name.startsWith("n"));
        System.out.println(name.endsWith("ak"));
        System.out.println(name.equals(name1));
        System.out.println(name.equalsIgnoreCase(name1));
        System.out.println(name.charAt(3));
        int age = 123;
        String stringAge = String.valueOf(age);
        System.out.println(stringAge+2);
        System.out.println(name1.replace("a", "d"));
        System.out.println(name.contains("nov"));
        System.out.println(name.substring(0, 3));

        String[] words = name.split("o");
        for(String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

        char[] characters = name.toCharArray();
        for(char character : characters) {
            System.out.print(character + " ");
        }
        System.out.println();

        System.out.println(name.isEmpty());
    }
}
