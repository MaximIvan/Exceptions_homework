package homework1;// 2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
/*
public static int sum2d(String[][] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<5; j++){
                int val = Integer.parseInt(arr[i][j]);
                sum+=val;
            }
        }
        return sum;
    }
*/

public class task_2 {
    public static void main(String[] args) {
        String[][] arr = null;
            int rez = sum2d(arr);
    }
    public static int sum2d (String[][]arr){
        int sum = 0;
        CountExceptions(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    public static void CountExceptions (String[][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == null) {
                    throw new NullPointerException();
                } else if (j > 5) {
                    throw new IndexOutOfBoundsException();
                }
            }
        }
    }
}