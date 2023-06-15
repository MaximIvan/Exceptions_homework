package homework3.function.classes.ui;

import homework3.function.abstractClasses.AGetData;
import homework3.function.exceptions.GetDataException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CGetData extends AGetData {
    BufferedReader reader;


    public CGetData() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String getData() throws IOException {
        String text = """
                Введите данные в произвольном порядке, разделенные пробелом:
                Фамилия Имя Отчество дата рождения номер телефона пол.
                                
                Форматы данных:
                Фамилия, имя, отчество - строки.            
                Дата_рождения - строка формата dd.mm.yyyy.           
                Номер_телефона - целое беззнаковое число без форматирования.
                Пол - символ латиницей f или m.
                """;
        System.out.println(text);
        System.out.print("Введите данные: ");
        String data = "";
        try {
            data = this.reader.readLine();
        }catch (IOException e){
            throw new GetDataException(new IOException());
        }
        return data;
    }
}
