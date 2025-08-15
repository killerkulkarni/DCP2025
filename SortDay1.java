public class SortDay1 {
    public static void sortColors(int[] arr) {
        int x = 0, y = 0, z = arr.length - 1;

        while (x <= z) {
            if (arr[x] == 0) swap(arr, x++, y++);
            else if (arr[x] == 1) x++;
            else swap(arr, x, z--);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 0};
        sortColors(arr);
        for (int num : arr) System.out.print(num + " ");
    }
}
