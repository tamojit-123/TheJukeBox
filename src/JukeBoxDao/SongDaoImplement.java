package JukeBoxDao;

import database.DatabaseConnection;
import model.Song;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SongDaoImplement implements SongI {

    List<Song> songList = new LinkedList<>();

    public void display(List<Song> songList) {

        System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Song Id", "Song Name", "Song Duration", "Album Name", "Artist Name", "Genre");
        System.out.println("===================================================================================================================");
        songList.forEach(song -> System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s\n", song.getSongId(), song.getSongName(), song.getSongDuration(),
                song.getAlbumName(), song.getArtistName(), song.getGenre()));
    }

    public List<Song> fetchData() {

        try {
            Connection connection = DatabaseConnection.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("Select * from SongTable");
            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {

                Song songData = new Song();

                songData.setSongId(resultSet.getInt(1));
                songData.setSongName(resultSet.getString(2));
                songData.setSongDuration(resultSet.getTime(3));
                songData.setAlbumName(resultSet.getString(4));
                songData.setArtistName(resultSet.getString(5));
                songData.setGenre(resultSet.getString(6));
                songList.add(songData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return songList;

    }

    @Override
    public List<Song> searchBySongName(List<Song> songList, String songName) {
        return songList.stream().filter(s -> s.getSongName().equalsIgnoreCase(songName)).collect(Collectors.toList());
    }

    @Override
    public List<Song> searchByArtist(List<Song> songList, String artistName) {
        return songList.stream().filter(s -> s.getArtistName().equalsIgnoreCase(artistName)).collect(Collectors.toList());
    }

    @Override
    public List<Song> searchByAlbum(List<Song> songList, String albumName) {
        return songList.stream().filter(s -> s.getAlbumName().equalsIgnoreCase(albumName)).collect(Collectors.toList());
    }

    @Override
    public List<Song> searchByGenre(List<Song> songList, String genre) {
        return songList.stream().filter(s -> s.getGenre().equalsIgnoreCase(genre)).collect(Collectors.toList());
    }

}