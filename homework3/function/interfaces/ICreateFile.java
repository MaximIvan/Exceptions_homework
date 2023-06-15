package homework3.function.interfaces;

import homework3.function.exceptions.FileCreateException;

import java.io.IOException;

public interface ICreateFile {
    public boolean createFile(String path) throws FileCreateException;
}
