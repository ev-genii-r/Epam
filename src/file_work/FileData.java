package file_work;
import exceptions.CustomException;
import file_work.JustFileReader;
public class FileData {
    public JustFileReader TempString= new JustFileReader();
    public String str;
    public FileData() {
       try{
           str=TempString.ReadFile();
       }catch (CustomException ex) {
           ex.OpenFileException();
       }
        System.out.println("String");
    }
    public int[] StringToInt(){
        String TempStr="";
        int j=0;
        int[] ms=new int[5];
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                TempStr+=str.charAt(i);
            }else{
                ms[j]=Integer.parseInt(TempStr);
                j++;
                TempStr="";
            }
        }
        ms[j]=Integer.parseInt(TempStr);
        return ms;
    }
}
