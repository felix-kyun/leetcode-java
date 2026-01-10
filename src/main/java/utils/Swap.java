package utils;

public class Swap {
    public static <T> void Swap(T[] arr, int index_a, int index_b) {
        T tmp = arr[index_a];
        arr[index_a] = arr[index_b];
        arr[index_b] = tmp;
    }

    public static void Swap(int[] arr, int index_a, int index_b) {
        int tmp = arr[index_a];
        arr[index_a] = arr[index_b];
        arr[index_b] = tmp;
    }

    public static void Swap(char[] arr, int index_a, int index_b) {
        char tmp = arr[index_a];
        arr[index_a] = arr[index_b];
        arr[index_b] = tmp;
    }
}
