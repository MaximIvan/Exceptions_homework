package homework2;

import java.util.Scanner;

/*
1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить
 пользователя ввод данных.
 */

public class task_1 {
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        boolean start = true;
        while(start){
            System.out.println("Введите дробное число");
            try {
               float a;
                a = Float.parseFloat(iScanner.nextLine());
                System.out.println(a);
                start = false;
                iScanner.close();
            } catch (NumberFormatException e) {
                System.out.println("Формат числа не соответствует запрашиваемому. Попробуйте снова." + e);
            }
        }
    }
}
