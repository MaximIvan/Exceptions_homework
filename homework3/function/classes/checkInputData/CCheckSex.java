package homework3.function.classes.checkInputData;

import homework3.function.abstractClasses.ACheckData;
import homework3.function.exceptions.CheckSexException;
import homework3.function.exceptions.IncorrectSexValuesException;

public class CCheckSex extends ACheckData {
    @Override
    public boolean checkElement(String data) {
        if(data.equals(""))
            throw new CheckSexException();
        if(!(data.contains("f") || data.contains("m")))
            throw new IncorrectSexValuesException();
        return true;
    }
}
