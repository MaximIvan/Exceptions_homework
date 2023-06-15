package homework3.function.interfaces;

import homework3.function.exceptions.MyFileCreateException;
import homework3.function.exceptions.TheSameFileWritingException;

public interface IWriteToFile {
    public boolean writeToFile(String[] infoToWrite) throws TheSameFileWritingException, MyFileCreateException;
}
