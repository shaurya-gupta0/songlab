import java.util.Scanner;
import java.io.file;
import java.io.IOException;

public class DataReader {
    Scanner in;
    try{
        in = new Scanner ("songs 2025-2026.csv");
        if(in.hasNext){
            System.out.println(in.nextLine); 
        }
        in.close();
    }
    catch(IOException e){
        System.out.println("Error.")
        return;
    }
}