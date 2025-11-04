import java.util.*;
public class FileManager {
    private String path;
    public void writeOnFile(String string) {
    try{
        FileWriter fileWriter = new FileWriter(path,true);
        fileWriter.write(string);
    }catch(Exeption e){
        System.out.println("Errore nella scrittura"+ e.getMessage());
    }


    }



    }
