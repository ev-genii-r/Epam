package file_work;
import java.io.*;

import Validators.FileValidator;
import exceptions.CustomException;

public class JustFileReader {
    public String FileString="";
    public String FileName="Array.txt";
    public String FilePos= "file/Array.txt";
    public FileValidator validator = new FileValidator();
    public String ReadFile()throws CustomException{
            File file = new File(FilePos);
            if(!file.exists()){
                throw new CustomException();
            }
            //File file = new File(FilePos);
        try {
            FileReader fr = new FileReader(file);

            BufferedReader reader = new BufferedReader(fr);
            while(true){
                FileString = reader.readLine();
                if(validator.CheckString(FileString)){
                    break;
                }
            }
            System.out.print(FileString);
        }catch (FileNotFoundException ex){
            ex.getMessage();
        }catch (IOException e){
            e.getCause();
        }
        return FileString;
    }
    public String getString() {
        return FileString;
    }
}
