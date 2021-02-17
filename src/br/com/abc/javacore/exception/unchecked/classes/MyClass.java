package br.com.abc.javacore.exception.unchecked.classes;

public class MyClass {
    public void causeANullPointerException() {
        String thisStringIsNull = getMessage(false);
        thisStringIsNull.toLowerCase();
    }

    public String getMessage(boolean messageIsAvailable) {
        if (messageIsAvailable) {
            return "message";
        }
        return null;
    }
}

