import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class dataReader {
    public void read(){
        Scanner in;
        int num = 1;
        try{
            in = new Scanner (new File("songs 2025-2026 ANSI.csv"));
            while (in.hasNext()){
                System.out.print(num + ": ");
                System.out.println(in.nextLine()); 
                num++;
            }
            in.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Error.");
            return;
        }
    }
}
