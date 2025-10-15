public class Song {
    // artist_name;track_name;release_date;genre;len;shake the audience;obscene;danceability;loudness;topic
    private String artist, track, genre, topic;
    private int year, releaseDate, length,loudness;
    private double danceability;
    private boolean obscene;

    public Song(String artist, String title, String genre, int year, double danceability) {
        this.artist = artist;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.danceability = danceability;
    }

}
