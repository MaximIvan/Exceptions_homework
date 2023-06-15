package homework3.function.abstractClasses;

import homework3.function.classes.workWithFile.CFileCreator;
import homework3.function.classes.workWithFile.CFindTheSameFileName;
import homework3.function.interfaces.IWriteToFile;

import java.io.FileWriter;

public abstract class AFileWriter implements IWriteToFile {
    protected FileWriter fileWriter;
    protected CFileCreator fileCreator;
    protected CFindTheSameFileName findTheSameFileName;
}
