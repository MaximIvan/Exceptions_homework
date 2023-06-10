package homework1;/*
3.Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
 Если длины массивов не равны, необходимо как-то оповестить пользователя.
*/

import java.util.Arrays;
import java.util.Random;

public class task_3 {
    public static void main(String[] args) {
        int[] arr1 = genArray(100);
        System.out.println("arr1 "+Arrays.toString(arr1));
        int[] arr2 = genArray(10);
        System.out.println("arr2 "+Arrays.toString(arr2));
        int[] rez = slArray(arr1, arr2);
        System.out.println("rez "+Arrays.toString(rez));
    }
    public static int[] genArray(int n) {
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(101);
        }
        return arr;
    }
    public static int[] slArray(int[]arr1, int[]arr2){

        if (arr1.length !=arr2.length) {
            throw new RuntimeException(("Размеры массивов не совпадают"));
        }
        int[] rez = new int[arr1.length];
        for (int i = 0; i< arr1.length; i++){
            rez[i] = arr1[i] - arr2[i];
        }
        return rez;
    }
}
