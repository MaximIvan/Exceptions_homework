package homework3.function.exceptions;

public class MyFileCreateException extends FileCreateException{
    public MyFileCreateException(String message) {
        super("Can't create file in CFileCreator: " + message);
    }
}
