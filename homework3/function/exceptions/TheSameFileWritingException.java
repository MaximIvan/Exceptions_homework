package homework3.function.exceptions;

import java.io.IOException;

public class TheSameFileWritingException extends IOException {
    public TheSameFileWritingException(String message) {
        super("File not found: " + message);
    }
}
