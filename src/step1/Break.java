package step1;

public class Break {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i += 2) {
            System.out.println(i);
            if(i >= 10) break;
        }
    }
}
