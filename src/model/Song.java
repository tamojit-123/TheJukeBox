package model;

import java.sql.Time;

public class Song {

    private int songId;
    private String songName;
    private Time songDuration;
    private String albumName;
    private String artistName;
    private String genre;

    public Song() {
    }

    public Song(int songId, String songName, Time songDuration, String albumName, String artistName, String genre) {

        this.songId = songId;
        this.songName = songName;
        this.songDuration = songDuration;
        this.albumName = albumName;
        this.artistName = artistName;
        this.genre = genre;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Time getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(Time songDuration) {
        this.songDuration = songDuration;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", songName='" + songName + '\'' +
                ", songDuration=" + songDuration +
                ", albumName='" + albumName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
