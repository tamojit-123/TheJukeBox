package controller;

import JukeBoxDao.PodCastDaoImplement;
import JukeBoxDao.SongDaoImplement;
import exception.PodCastNotFoundException;
import model.PodCast;
import model.Song;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String runAgain;
        do {

            Scanner scanner = new Scanner(System.in);
            SongDaoImplement songs = new SongDaoImplement();
            PodCastDaoImplement podcast = new PodCastDaoImplement();

            List<Song> songList = songs.fetchData();
            List<PodCast> podCastList = podcast.fetchData();

            System.out.println("===========================The Modern JukeBox===========================");
            System.out.println("Select What You Want to Listen");
            System.out.println("Press '1' - For Song");
            System.out.println("Press '2' - For Podcast");
            System.out.print("Jukebox $~ ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("-------------Song Menu-----------");
                    System.out.println("Functionality--------------------");
                    System.out.println("1 - Display all Song");
                    System.out.println("2 - Search by Song Name");
                    System.out.println("3 - Search by Artist");
                    System.out.println("4 - Search by Genre");
                    System.out.println("5 - Search by Album");
                    System.out.println("---------------------------------");
                    System.out.print("Jukebox $~ ");

                    int songChoice = scanner.nextInt();

                    switch (songChoice) {
                        case 1:
                            songs.display(songList);
                            break;
                    }
                    switch (songChoice) {
                        case 2:
                            System.out.println("Enter Song Name to search");
                            scanner.nextLine();
                            System.out.print("Jukebox $~ ");
                            String name = scanner.nextLine();
                            List<Song> songsName = songs.searchBySongName(songList, name);
                            songs.display(songsName);
                            break;
                    }
                    switch (songChoice) {
                        case 3:
                            System.out.println("Enter Artist Name to search");
                            scanner.nextLine();
                            System.out.print("Jukebox $~ ");
                            String artist = scanner.nextLine();
                            List<Song> artistName = songs.searchByArtist(songList, artist);
                            songs.display(artistName);
                            break;
                    }
                    switch (songChoice) {
                        case 4:
                            System.out.println("Enter Genre to search");
                            scanner.nextLine();
                            System.out.print("Jukebox $~ ");
                            String genre = scanner.nextLine();
                            List<Song> genreName = songs.searchByGenre(songList, genre);
                            songs.display(genreName);
                            break;
                    }
                    switch (songChoice) {
                        case 5:

                            System.out.println("Enter Album Name to search");
                            scanner.nextLine();
                            System.out.print("Jukebox $~ ");
                            String album = scanner.nextLine();
                            List<Song> albumName = songs.searchByAlbum(songList, album);
                            songs.display(albumName);
                            break;
                    }
                    break;
            }

            switch (choice) {
                case 2:

                    System.out.println("-------------Podcast Menu-----------");
                    System.out.println("Functionality-----------------------");
                    System.out.println("1 - Display all Song");
                    System.out.println("2 - Search by Podcast Name");
                    System.out.println("3 - Search by Host");
                    System.out.println("4 - Search by Release Date");
                    System.out.println("------------------------------------");
                    System.out.print("Jukebox $~ ");


                    int podcastChoice = scanner.nextInt();

                    switch (podcastChoice) {
                        case 1:
                            podcast.display(podCastList);
                            break;
                    }
                    switch (podcastChoice) {
                        case 2:
                            System.out.println("Enter Podcast Name to search");
                            scanner.nextLine();
                            System.out.print("Jukebox $~ ");
                            String name = scanner.nextLine();
                            List<PodCast> podCastName = podcast.searchByPodCastName(podCastList, name);
                            podcast.display(podCastName);
                            break;
                    }
                    switch (podcastChoice) {
                        case 3:
                            System.out.println("Enter Host Name to search");
                            scanner.nextLine();
                            System.out.print("Jukebox $~ ");
                            String host = scanner.nextLine();
                            List<PodCast> hostName = podcast.searchByHost(podCastList, host);
                            podcast.display(hostName);
                            break;
                    }
                    switch (podcastChoice) {
                        case 4:
                            System.out.println("Enter Release Date to search");
                            scanner.nextLine();
                            System.out.print("Jukebox $~ ");
                            String releaseDate = scanner.nextLine();
                            Date date = Date.valueOf(releaseDate);
                            List<PodCast> publishedDate = podcast.searchByPublishedDate(podCastList, date);
                            podcast.display(publishedDate);

                            break;
                    }
            }

            System.out.print("Do you want to return to main Menu (Yes/No): ");
            runAgain = scanner.next();
        }
        while (runAgain.equalsIgnoreCase("Yes"));
    }
}