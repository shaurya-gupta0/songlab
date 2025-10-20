import java.util.Scanner;
import java.io.File;
// import java.io.IOException;
import java.io.FileNotFoundException;

public class dataReader {
    public void read(){
        Scanner in;
        int num = 1;
        int year2000 = 0;
        int year1982 = 0;
        int year2015 = 0;
        int MichaelCounter = 0;
        int WhitneyCounter = 0;
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
                //System.out.print(num + ": "); 
                
                songs[num] = new Song(artist, track, release_date,genre,duration,shake, obscene, danceability, loudness, topic);
                num++;
                //below CAN be deleted but its for testing rn 
                //System.out.println(line.split(";")[2]); 
                if(release_date == 1982){
                    year1982++;
                }
                else if(release_date == 2000){
                    year2000++;
                }
                else if(release_date == 2015){
                    year2015++;
                }
                else if(artist=="Michael Jackson"){
                    MichaelCounter++;
                }
                //System.out.println(year2000);

            }
            
            in.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Error.");
            return;
        }

        //below is the code for these things
        /*
        Total number of songs ✔
        Total number of songs from 1982, 2000, 2015 (each separate reports)
        How many songs have danceability ratings > 0.80
        Song with largest len
        Song with lowest shakeability score
        Loudest song (song with the highest loudness rating)
        Average obscenity level in each decade (1950-1959, 1960-1969, etc.)
        How many songs have Michael Jackson in it? How many have Whitney Houston in it? 
        */ 

        System.out.println("Total number of songs is: " + num);
        System.out.println("2000: " + year2000);
        System.out.println("1982: " + year1982);
        System.out.println("2015: " + year2015);
        
    
    }
}
