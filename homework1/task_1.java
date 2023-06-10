package homework1;// 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class task_1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = null;
        float rez = DivineByZero(10, 0);
        int rez1 = IndexIsOutOfBounds(arr1, 100);
        int rez2 = NullPointer(arr2);
    }

    private static int NullPointer(int[]arr) {
        return arr.length;
    }

    private static int IndexIsOutOfBounds(int[] arr, int i) {
        return arr[i];
    }

    private static float DivineByZero(int a, int b) {
        return a/b;
    }
}
