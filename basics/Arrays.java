package basics;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println(arr[2]);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
