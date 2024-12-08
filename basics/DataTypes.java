package basics;

public class DataTypes {
    public static void main(String[] args) {
        /*
         * boolean --> true or false
         * size --> 8 bits
         * range --> true, false
         */
        boolean isTrue = true;
        System.out.println("boolean -> " + isTrue);
        /*
         * byte --> twos complement integer
         * size --> 8 bits
         * range --> -128 to 127
         */
        byte byteNum = 127;
        System.out.println("byte -> " + byteNum);
        /*
         * char --> Unicode character
         * size --> 16 bits
         * range --> all 256 characters
         */
        char ch = 'a';
        System.out.println("char -> " + ch);
        /*
         * short --> twos complement integer
         * size --> 16 bits
         * range --> -32,768 to 32,767 
         */
        short shortNum = 32767;
        System.out.println("short -> " + shortNum);
        /*
         * int --> twos complement integer
         * size --> 32 bits
         * range --> -2147483648 to 2147483647
         */
        int intNum = 2147483647;
        System.out.println("int -> " + intNum);
        /*
         * long --> twos complement integer
         * size --> 64 bits
         * range --> -9223372036854775808 to 9223372036854775807
         */
        long longNum = 9223372036854775806L;
        System.out.println("long -> " + longNum);
        /*
         * float --> IEEE 754 floating point
         * size --> 32 bits
         * range --> upto 7 decimal digits
         */
        float floatNum = 1.1234567f;
        System.out.println("float -> " + floatNum);
        /*
         * double --> IEEE 754 floating point
         * size --> 64 bits
         * range --> upto 16 decimal digits
         */
        double doubleNum = 1.1234567891234567d;
        System.out.println("double -> " + doubleNum);
    }
}
