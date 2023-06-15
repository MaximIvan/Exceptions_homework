package homework3.function.exceptions;

public class CheckQuantityException extends RuntimeException{
    public CheckQuantityException() {
        super("Wrong number of elements in the entered data!");
    }
}
