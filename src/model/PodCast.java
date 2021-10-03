package model;

import java.sql.Date;
import java.sql.Time;

public class PodCast {

    private int podCastId;
    private String podCastName;
    private Time podCastDuration;
    private Date publishedDate;
    private String podCastAlbum;
    private String podCastHost;
    private String genre;

    public PodCast() {
    }

    public PodCast(int podCastId, String podCastName, Time podCastDuration, Date publishedDate, String podCastAlbum, String podCastHost, String genre) {

        this.podCastId = podCastId;
        this.podCastName = podCastName;
        this.podCastDuration = podCastDuration;
        this.publishedDate = publishedDate;
        this.podCastAlbum = podCastAlbum;
        this.podCastHost = podCastHost;
        this.genre = genre;
    }

    public int getPodCastId() {
        return podCastId;
    }

    public void setPodCastId(int podCastId) {
        this.podCastId = podCastId;
    }

    public String getPodCastName() {
        return podCastName;
    }

    public void setPodCastName(String podCastName) {
        this.podCastName = podCastName;
    }

    public Time getPodCastDuration() {
        return podCastDuration;
    }

    public void setPodCastDuration(Time podCastDuration) {
        this.podCastDuration = podCastDuration;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getPodCastAlbum() {
        return podCastAlbum;
    }

    public void setPodCastAlbum(String podCastAlbum) {
        this.podCastAlbum = podCastAlbum;
    }

    public String getPodCastHost() {
        return podCastHost;
    }

    public void setPodCastHost(String podCastHost) {
        this.podCastHost = podCastHost;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "PodCast{" +
                "podCastId=" + podCastId +
                ", podCastName='" + podCastName + '\'' +
                ", podCastDuration=" + podCastDuration +
                ", publishedDate=" + publishedDate +
                ", podCastAlbum='" + podCastAlbum + '\'' +
                ", podCastHost='" + podCastHost + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
