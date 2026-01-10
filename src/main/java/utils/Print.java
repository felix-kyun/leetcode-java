package utils;

public class Print {

    public static <T> void Array(T[] arr) {
        System.out.print("[");
        if (arr.length > 0) {
            System.out.printf("%s", arr[0]);
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", %s", arr[i]);
        }
        System.out.println("]");
    }

    public static void Array(int[] arr) {
        System.out.print("[");
        if (arr.length > 0) {
            System.out.printf("%s", arr[0]);
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", %s", arr[i]);
        }
        System.out.println("]");
    }
}
