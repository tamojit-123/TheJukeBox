package JukeBoxDao;

import model.Song;

import java.util.List;

public interface SongI {

    public List<Song> searchBySongName(List<Song> songList, String songName);

    public List<Song> searchByArtist(List<Song> songList, String artistName);

    public List<Song> searchByAlbum(List<Song> songList, String albumName);

    public List<Song> searchByGenre(List<Song> songList, String genre);


}
