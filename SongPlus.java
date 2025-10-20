public class Song {
    // artist_name;track_name;release_date;genre;len;shake the audience;obscene;danceability;loudness;topic
    private String artist, track, genre, topic;
    private int year, releaseDate, length;
    private double danceability, shake, obscene, loudness;

    public Song(String artist, String track, int release_date, String genre, int duration, double shake, double obscene, double danceability, double loudness, String topic) {
        this.artist = artist;
        this.track = track;
        this.genre = genre;
        this.year = year;
        this.danceability = danceability;
        this.topic = topic;
        this.length = length;
        this.shake = shake;
        this.obscene = obscene;
        this.loudness = loudness;
    }

    public String getTitle() {
        return track;
    }

    public String getLongestTitle(Song [] List) {
        String longest = "";
        for (int i=0; i<=28371; i++) {
            String title = List[i].getTitle();

            if(title.length() > longest.length()) {
                longest = track;
            }
        }
        return track;
    }

    public double getLoudness() {
        return loudness;
    }

    public double getLoudestSong(Song [] list) {
        Double loudest = 0.0;
        for (int i = 0; i<=28371; i++) {
            Double loudness = list[i].getLoudness();

            if(loudness > loudest) {
                loudest = loudness;
            }
        }

        return loudest;
    }
    


}
