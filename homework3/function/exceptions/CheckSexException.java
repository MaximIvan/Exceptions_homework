package homework3.function.exceptions;

public class CheckSexException extends RuntimeException{
    public CheckSexException() {
        super("Sex's value is empty!!!");
    }
}
