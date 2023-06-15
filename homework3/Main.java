package homework3;

/*
Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
Фамилия Имя Отчество датарождения номертелефона пол

Форматы данных:
фамилия, имя, отчество - строки
датарождения - строка формата dd.mm.yyyy
номертелефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m.

Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым,
вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано,
пользователю выведено сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку
должны записаться полученные данные, вида

<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

Не забудьте закрыть соединение с файлом.

При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано,
пользователь должен увидеть стектрейс ошибки.
 */

import homework3.function.classes.Program;
import homework3.function.classes.checkInputData.*;
import homework3.function.classes.parseData.CDataParseProcessor;
import homework3.function.classes.ui.CGetData;
import homework3.function.classes.workWithFile.CFileCreator;
import homework3.function.classes.workWithFile.CFileWriter;
import homework3.function.classes.workWithFile.CFindTheSameFileName;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String infoPathFolder = "C:/Users/homei/IdeaProjects/project/Exceptions/src/homework3/data/";
        Program program = new Program(new CGetData(),
                new CDataParseProcessor(),
                new CCheckDataProcessor(new CCheckQuantity(),
                        new CCheckFullName(),
                        new CCheckBirthday(),
                        new CCheckSex()),
                new CFileWriter(new CFileCreator(),
                        new CFindTheSameFileName(),
                        infoPathFolder));
        program.run();
    }
}

