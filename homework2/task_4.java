package homework2;

import java.util.Scanner;
/*
4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/
public class task_4 {
    public static void main(String [] args) {
        System.out.println(checkString());
    }
    public static String checkString(){
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        string = scanner.nextLine();
        scanner.close();
        if (string.isEmpty()) {
            throw new RuntimeException("Пустых строк не должно быть");
        }
        return string;
    }
}
