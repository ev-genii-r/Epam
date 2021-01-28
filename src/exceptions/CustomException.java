package exceptions;

public class CustomException extends Exception {
    public CustomException() {
        System.err.print("CustomException:");
    }
    public void OpenFileException() {
        System.err.println("File opening error");
    }
}
