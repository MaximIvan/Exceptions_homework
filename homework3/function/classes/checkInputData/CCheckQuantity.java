package homework3.function.classes.checkInputData;

import homework3.function.abstractClasses.ACheckQuantity;
import homework3.function.exceptions.CheckQuantityException;

public class CCheckQuantity extends ACheckQuantity {
    @Override
    public boolean checkQuantity(String data[]) {
        if(data.length!=6)
            throw new CheckQuantityException();
        return true;
    }
}
