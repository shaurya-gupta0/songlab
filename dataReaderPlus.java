import java.util.Scanner;
import java.io.File;
// import java.io.IOException;
import java.io.FileNotFoundException;

public class dataReader {
    public void read(){
        Scanner in;
        int num = 1;
        Song [] songs = new Song[28372];
        try{
            in = new Scanner (new File("songs 2025-2026 ANSI.csv"));
            in.nextLine();
            while (in.hasNext()){
                
                String line = in.nextLine();
                String artist = line.split(";")[0];
                String track = line.split(";")[1];
                int release_date = Integer.parseInt(line.split(";")[2]);
                String genre = line.split(";")[3];
                int duration = Integer.parseInt(line.split(";")[4]);
                double shake = Double.parseDouble(line.split(";")[5]);
                double obscene = Double.parseDouble(line.split(";")[6]);
                double danceability = Double.parseDouble(line.split(";")[7]);
                double loudness = Double.parseDouble(line.split(";")[8]);
                String topic = line.split(";")[9];
                System.out.print(num + ": ");
                System.out.println(line.split(";")[2]); 
    
                songs[num] = new Song(artist, track, release_date,genre,duration,shake, obscene, danceability, loudness, topic);

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
