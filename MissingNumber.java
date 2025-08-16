import java.util.*;

class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) arr[i] = Integer.parseInt(parts[i]);

        int n = arr.length + 1, sum = n * (n + 1) / 2;
        for (int x : arr) sum -= x;
        System.out.println("Missing number: " + sum);
    }
}
