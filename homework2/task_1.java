package homework2;

import java.util.Scanner;

/*
1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить
 пользователя ввод данных.

2. Если необходимо, исправьте данный код
(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

3. Дан следующий код, исправьте его там, где требуется
(задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
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
