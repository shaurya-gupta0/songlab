import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class dataReader {
    public void read(){
        Scanner in;
        try{
            in = new Scanner (new File("songs 2025-2026.csv"));
            if(in.hasNext()){
                System.out.println(in.nextLine()); 
            }
            in.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Error.");
            return;
        }
    }
}
