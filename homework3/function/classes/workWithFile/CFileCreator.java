package homework3.function.classes.workWithFile;

import homework3.function.abstractClasses.AFileCreator;
import homework3.function.exceptions.FileCreateException;

import java.io.File;
import java.io.IOException;

public class CFileCreator extends AFileCreator {

    @Override
    public boolean createFile(String path) throws FileCreateException {
        super.file = new File(path);
        try {
            return super.file.createNewFile();
        }catch (IOException e){
            throw new FileCreateException(e.getMessage());
        }
    }
}
