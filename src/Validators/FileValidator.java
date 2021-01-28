package Validators;

public class FileValidator {
    public boolean CheckString(String line){
        return line.matches("[0-9/s/ /-]*");
    }
}
